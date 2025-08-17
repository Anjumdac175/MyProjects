package com.cdac.Sortings;

import java.util.Arrays;

public class SortMain {
	
	public static void genricBubbleSort() {
		Integer[] arr = {25,12,8,43,15};
		String[] str = {"Pineapple","Banana","Guvava","Apple","Orange"};
		
		System.out.println("Integers Before Sort are using BubbleSort: " + Arrays.toString(arr));
		BubbleSort.bubbleSort(arr);
		System.out.println("Integers After Sort are: " + Arrays.toString(arr));
		
		System.out.println("Strings Before Sort are using BubbleSort: " + Arrays.toString(str));
		BubbleSort.bubbleSort(str);
		System.out.println("Strings After Sort are: " + Arrays.toString(str));
		
		System.out.println("---------------------------------------------------\n");
	}

	public static void genricSelectionSort() {
		Integer[] arr = {25,12,8,43,15};
		String[] str = {"Pineapple","Banana","Guvava","Apple","Orange"};

		System.out.println("Integers Before Sort are using SelectionSort: " + Arrays.toString(arr));
		SelectionSort.selectionSort(arr);
		System.out.println("Integers After Sort are: " + Arrays.toString(arr));

		System.out.println("Strings Before Sort are using SelectionSort: " + Arrays.toString(str));
		SelectionSort.selectionSort(str);
		System.out.println("Strings After Sort are: " + Arrays.toString(str));
		System.out.println("---------------------------------------------------\n");
	}
	
	
	public static void genricInsertionSort() {
		Integer[] arr = {25,12,8,43,15};
		String[] str = {"Pineapple","Banana","Guvava","Apple","Orange"};
		
		System.out.println("Integers Before Sort are using InsertionSort: " + Arrays.toString(arr));
		InsertionSort.insertionSort(arr);
		System.out.println("Integers After Sort are: " + Arrays.toString(arr));
		
		System.out.println("Strings Before Sort are using InsertionSort: " + Arrays.toString(str));
		InsertionSort.insertionSort(str);
		System.out.println("Strings After Sort are: " + Arrays.toString(str));
		
		System.out.println("---------------------------------------------------\n");
	}
	
	public static void UsingmergeSort() {
		int[] arr = {25,12,8,43,15};
		//String[] str = {"Pineapple","Banana","Guvava","Apple","Orange"};
		
		System.out.println("Integers Before Sort are using MergeSort: " + Arrays.toString(arr));
		MergeSort.mergeSort(arr, 0, arr.length-1);
		System.out.println("Integers After Sort are: " + Arrays.toString(arr));
		
//		System.out.println("Strings Before Sort are using InsertionSort: " + Arrays.toString(str));
//		InsertionSort.insertionSort(str);
//		System.out.println("Strings After Sort are: " + Arrays.toString(str));
//		
		System.out.println("---------------------------------------------------\n");
	}
	
	public static void UsingQuickSort() {
		int[] arr = {25,12,8,43,15};
		//String[] str = {"Pineapple","Banana","Guvava","Apple","Orange"};
		
		System.out.println("Integers Before Sort are using QuickSort: " + Arrays.toString(arr));
		QuickSort.quickSort(arr, 0, arr.length-1);
		System.out.println("Integers After Sort are: " + Arrays.toString(arr));
		
//		System.out.println("Strings Before Sort are using InsertionSort: " + Arrays.toString(str));
//		InsertionSort.insertionSort(str);
//		System.out.println("Strings After Sort are: " + Arrays.toString(str));
//		
		System.out.println("---------------------------------------------------\n");
	}
	
	public static void UsingHeapSort() {
		int[] arr = {25,12,8,43,15};
		//String[] str = {"Pineapple","Banana","Guvava","Apple","Orange"};
		
		System.out.println("Integers Before Sort are using HeapSort: " + Arrays.toString(arr));
		HeapSort.heapSort(arr);
		System.out.println("Integers After Sort are: " + Arrays.toString(arr));
		
//		System.out.println("Strings Before Sort are using InsertionSort: " + Arrays.toString(str));
//		InsertionSort.insertionSort(str);
//		System.out.println("Strings After Sort are: " + Arrays.toString(str));
//		
		System.out.println("---------------------------------------------------\n");
	}
	
	public static void main(String[] args) {
		genricBubbleSort();
		genricSelectionSort();
		genricInsertionSort();
		UsingmergeSort();
		UsingQuickSort();
		UsingHeapSort();
		
	}

}
