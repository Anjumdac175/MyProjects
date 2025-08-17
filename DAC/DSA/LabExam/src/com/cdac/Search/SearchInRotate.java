package com.cdac.Search;

public class SearchInRotate {
	
	public static int searchInRotate(int[] arr, int element) {
		int low = 0;
		int high = arr.length-1;
		 
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == element) {
				return mid;
			}
			
			if(arr[low] < arr[mid]) {
				
				if(element >= arr[low] && element < arr[mid]) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}else {
				
				if(element > arr[mid] && element <= arr[high]) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {12,25,33,6,8,10};
		int index = searchInRotate(arr, 6);
		if(index != -1) {
			System.out.println("Element found at: " + index);
		}else {
			System.out.println("Element no found..");
		}
	}
}
