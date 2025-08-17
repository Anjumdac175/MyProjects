package com.cdac.pgdac.BinarSearch;

import com.cdac.pgdac.Sortings.BubbleSort.BubbleSort;

public class BinarySearch {
	
	public static boolean FindUsingBinarySearch(int[] arr, int element) {
		BubbleSort.bubbleSort(arr);
		
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == element) {
				return true;
			}
			if(element < arr[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return false;
	}
}
