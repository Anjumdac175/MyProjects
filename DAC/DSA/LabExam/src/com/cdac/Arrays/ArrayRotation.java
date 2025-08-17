package com.cdac.Arrays;

import java.util.Arrays;

public class ArrayRotation {
	
	private static void rightRotateArray(int[] arr, int rightPos) {
		int n = arr.length-1;
		while(rightPos > 0) {
			int temp = arr[n];
			for(int i = n; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp; 
			rightPos--;
		}
		System.out.println("Elements after Right rotate are: " + Arrays.toString(arr));
		
	}
	
	private static void leftRotateArray(int[] arr, int leftPos) {		
		while(leftPos > 0) {
			int temp = arr[0];
			for(int i = 0; i < arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = temp; 
			leftPos--;
		}
		System.out.println("Elements after Left rotate are: " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Element Before are: " + Arrays.toString(arr));
		int leftPos = 2;
		int rightPos = 2;
		leftRotateArray(arr, leftPos);
		rightRotateArray(arr, rightPos);
	}
}
