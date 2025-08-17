package com.cdac.Arrays;

import java.util.Arrays;

public class SecondThirdLargest {
	
	private static void findThirdLargest(int[] arr, int max, int secMax) {
		
		int thirdMax = 0;
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] > thirdMax && arr[i] != max && arr[i] != secMax ) {
				thirdMax = arr[i];
			}
		}
		System.out.println("Third Largest Value is: " + thirdMax);
		
	}

	private static void findSecondLargest(int[] arr) {
		
		int max = arr[0];
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest Value is: " + max);
		
		int secMax = 0;
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println("Second Largest Value is: " + secMax);
		
		findThirdLargest(arr, max, secMax);
	}

	public static void main(String[] args) {
		int[] arr = {12,8,10,6,4,9};
		System.out.println("Elements in array are: " + Arrays.toString(arr));
		findSecondLargest(arr);
	}
}
