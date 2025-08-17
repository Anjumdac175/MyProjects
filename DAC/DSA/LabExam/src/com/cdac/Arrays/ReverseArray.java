package com.cdac.Arrays;

import java.util.Arrays;

public class ReverseArray {

	private static void reverseArray(int[] arr) {
		int n = arr.length;
//		int[] arr1 = new int[n];
//		for(int i = 0; i < n; i++) { // time complexity = O(n), space-complexity = O(n); bcz of extra array
//			arr1[i] = arr[n-i-1];
//		}
		
		for(int i = 0; i < n/2; i++) { // time complexity = O(n), space-complexity = O(1);
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		System.out.println("Elements in Array After: " + Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		int[] arr = {82,45,12,2,10,96};
		System.out.println("Elements in Array Before: " + Arrays.toString(arr));
	
		reverseArray(arr);
	}
}
