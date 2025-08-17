package com.cdac.pgdac.QuickSort;

public class QuickSort {

	public static void quickSort(int[] arr, int startPos, int endPos) {
		
		if(startPos < endPos) {
			
			// first partition elements based on pivot index
			int position = partition(arr, startPos, endPos);
			
			// then sort elements according to pivot left and right
			quickSort(arr, startPos, position - 1);
			quickSort(arr, position + 1, endPos);
			
		}
	}

	public static int partition(int[] arr, int startPos, int endPos) {
		
		int pivot = arr[endPos]; // taking Pivot as last element in array
		int i = startPos - 1; // intializing index = -1
		
		for(int j = startPos; j < endPos; j++) {
			if(arr[j] < pivot) {  //if element is less than pivot then swap them
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		
		//placing pivot element into correct position
		int temp = arr[i + 1];
		arr[i + 1] = arr[endPos];
		arr[endPos] = temp;
		
		return i + 1;      // returning pivot index to for partition
	}
}
