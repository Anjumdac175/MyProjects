	package com.cdac.pgdac.HeapSort;

public class HeapSort {
	
	public static void heapify(int[] arr, int size, int i) {
		
		
		int largest = i;  // non-leaf node to move largest element at the top of heap
		int left = 2 * i + 1;  // left child
		int right = 2 * i + 2;  // right child
		
		//finding largest among left and right to swap and to show in sorted list
		if(left < size && arr[left] > arr[largest]) {
			largest = left;
		}
		
		if(right < size && arr[right] > arr[largest]) {
			largest = right;
		}
		
		// if root is not the largest again swap between smallest and highest to maintain heap property
		if(largest != i) {
			Swap(arr, i, largest);
			heapify(arr, size, largest);
		}
	}
	
	public static void heapSort(int[] arr) {
		int n = arr.length;
		
		// Building MaxHeap
		for(int i = n/2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		// swap root and last element to place largest element at last position in sorted array
		for(int i = n-1; i > 0; i--) {
			Swap(arr,0,i);
		
		// Heapify the root until it reduces to 1 element and to print sorted array
			heapify(arr, i, 0);
		}
	}

	private static void Swap(int[] arr, int last, int first) {
		
		// to swap with first and last or smallest and largest
		int temp = arr[last];
		arr[last] = arr[first];
		arr[first] =  temp;
		
	}

}
