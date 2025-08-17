package com.cdac.Sortings;

public class SelectionSort {
	
	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int indx = i;
			for(int j = i+1; j < n; j++) {
				if(arr[j].compareTo(arr[indx]) < 0) {
					indx = j;
				}
			}
			T temp = arr[indx];
			arr[indx] = arr[i];
			arr[i] = temp;
		}
	}
}
