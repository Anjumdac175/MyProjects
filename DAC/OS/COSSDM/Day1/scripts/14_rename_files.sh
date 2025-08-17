#!/bin/bash

timestamp=$(date +%Y%m%d%H%M%S)

# Loop through all .txt files in the current directory
for file in *.txt; do
    # Check if the file exists to avoid errors when no .txt files are found
    if [ -f "$file" ]; then
        # Create the new filename by appending the timestamp
        new_name="${file%.txt}_$timestamp.txt"
        
        # Rename the file
        mv "$file" "$new_name"
        
        # Display a message indicating the file has been renamed
        echo "Renamed '$file' to '$new_name'"
    fi
done
