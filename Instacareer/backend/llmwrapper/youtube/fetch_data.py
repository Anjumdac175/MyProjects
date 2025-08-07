# Make sure you have yt-dlp installed:
# pip install yt-dlp

from youtube.youtube_types import VideoDescription, YouTubeActivity
from yt_dlp import YoutubeDL
from typing import List, Tuple

import concurrent.futures
import time
import random
import re

def get_youtube_description(activity: YouTubeActivity) -> VideoDescription:
    """
    Fetches the description for a single YouTube video URL.
    Includes validation to ensure only valid video URLs are processed.
    """
    url = activity.get('titleUrl')

    # --- FIX: URL Validation ---
    # This regex checks if the URL is a standard YouTube video link.
    # It prevents passing invalid links (like search results) to yt-dlp.
    if not url or not re.search(r"(?:v=|\/)([0-9A-Za-z_-]{11}).*", url):
        error_msg = f"Invalid or non-video URL format: {url}"
        print(f"SKIPPING: {error_msg}")
        return {
            'title': activity.get('title', 'N/A'),
            'titleUrl': url,
            'description': '',
            'error': error_msg
        }

    # --- FIX: Added 'noplaylist' to prevent processing entire playlists ---
    ydl_opts = {
        'quiet': True,
        'extract_flat': False,
        'skip_download': True,
        'socket_timeout': 10,  # Increased timeout slightly for more stability
        'no_warnings': True,
        'noplaylist': True,   # Ensures we only get data for the single video
    }

    try:
        # This block now only runs for valid video URLs
        with YoutubeDL(ydl_opts) as ydl:
            info = ydl.extract_info(url, download=False)
            description = info.get('description', '')
            print(f'Fetched description from YouTube URL using (YoutubeDL): {url}')
            return {
                'title': activity['title'],
                'titleUrl': url,
                'description': description,
                'error': None,
            }
    except Exception as e:
        # This will now only catch errors for valid video URLs that have issues
        # (e.g., private, deleted, region-locked).
        error_msg = f"yt-dlp failed for URL '{url}': {str(e)}"
        print(f"ERROR: {error_msg}")
        return {
            'title': activity['title'],
            'titleUrl': activity['titleUrl'],
            'description': '',
            'error': str(e) # Return the original error message
        }

def fetch_descriptions_parallel(
        activities: List[VideoDescription], 
        max_workers: int = 5, 
        delay_range: Tuple[float, float] = (0.4, 1.0)) -> List[VideoDescription]:
    """
    Fetch YouTube descriptions in parallel with randomized delays.
    (This function's logic remains unchanged as it was already correct).
    
    Args:
        activities: List of YouTubeActivity format dicts
        max_workers: Maximum number of parallel threads to use
        delay_range: Tuple of (min, max) delay between requests in seconds
        
    Returns:
        List of results in the same order as input activities
    """
    results = [None] * len(activities)
    
    def process_activity(index: int, activity: YouTubeActivity):
        # Add random delay to avoid appearing as a bot
        time.sleep(random.uniform(*delay_range))
        return index, get_youtube_description(activity)
    
    with concurrent.futures.ThreadPoolExecutor(max_workers=max_workers) as executor:
        # Submit all tasks
        futures = [executor.submit(process_activity, idx, act) 
                   for idx, act in enumerate(activities)]
        
        # As they complete, store results in the correct position
        for future in concurrent.futures.as_completed(futures):
            try:
                index, result = future.result()
                results[index] = result
            except Exception as e:
                # This outer catch is a safeguard for unexpected threading issues
                print(f"Critical error in thread processing: {e}")
    
    return results
