package com.cdac.Sortings;

public class BubbleSort {
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			boolean swapped = false;
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
}
