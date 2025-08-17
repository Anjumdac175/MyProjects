package com.cdac.Arrays;

import java.util.Arrays;

public class SlidingWindow {

	private static int windowsum(int[] windowSize) {
		int subarraysum = 0;
		for(int i = 0; i < windowSize.length; i++) {
			subarraysum += windowSize[i] ; 
		}
		return subarraysum;
	}
	private static void subArraySum(int[] arr, int slide) {
		
		int[] windowSize = new int[slide];
		for(int i = 0;  i <= arr.length-slide; i++) {
			
			int start = i; 
			for(int j = 0; j < slide; j++) {
				windowSize[j] = arr[start++];
			}
			System.out.println("Sum of SubArrays are: " + windowsum(windowSize));
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Element Before are: " + Arrays.toString(arr));
		int slide = 3;
		subArraySum(arr,slide);

	}
}
