package com.cdac.Sortings;

public class InsertionSort {

	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			T elementToInsert = arr[i];
			int j = i - 1;
			while( j>=0 && arr[j].compareTo(elementToInsert) > 0) {
				arr[j + 1] = arr[j];
				j = j -1;
			}
			arr[j + 1] = elementToInsert;
		}
	}
}
