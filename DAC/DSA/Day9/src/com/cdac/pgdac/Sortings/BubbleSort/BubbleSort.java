package com.cdac.pgdac.Sortings.BubbleSort;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		int elementtoSort = arr.length;
		while(elementtoSort > 1) {
			int left = 0;
			while(left < (elementtoSort - 1)) {
				if(arr[left + 1] <arr[left]) {
					int temp = arr[left + 1];
					arr[left + 1] = arr[left];
					arr[left] = temp;
				}
				left++;
			}
			elementtoSort--;
		}
	}
}
