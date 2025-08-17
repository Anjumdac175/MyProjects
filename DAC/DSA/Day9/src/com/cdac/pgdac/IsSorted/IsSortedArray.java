package com.cdac.pgdac.IsSorted;

public class IsSortedArray {

	private static boolean isArraySorted(int[] arr) {
		
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			
			int j=0;
			if(arr[j] > arr[j + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
	
		int[] sortedArr = {11,15,25,32,45};
		int[] UnsortedArr = {15,10,25,2,45};
		
		System.out.println("Is Array Sorted? " + isArraySorted(sortedArr));
		System.out.println("Is Array Sorted? " + isArraySorted(UnsortedArr));

	}
}
