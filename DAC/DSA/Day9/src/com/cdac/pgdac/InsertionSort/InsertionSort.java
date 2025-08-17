package com.cdac.pgdac.InsertionSort;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		
//		Insertion Sort in Descending Order
		
		for(int i = 0; i < arr.length ; i++) {

			int elementToInsert = arr[i];
			int j = i - 1;

			while(j >= 0 && arr[j] < elementToInsert) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = elementToInsert;
		}
		
		
//		Insertion Sort in Ascending Order
		
//		for(int i = 0; i < arr.length ; i++) {
//			
//			int elementToInsert = arr[i];
//			int j = i - 1;
//			
//			while(j >= 0 && arr[j] > elementToInsert) {
//				arr[j + 1] = arr[j];
//				j = j - 1;
//			}
//			
//			arr[j + 1] = elementToInsert;
//		}

	}
}
