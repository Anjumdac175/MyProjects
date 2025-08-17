package com.cdac.pgdac;

import com.cdac.pgdac.HeapSort.HeapSort;
import com.cdac.pgdac.MergeSort.MergeSort;
import com.cdac.pgdac.QuickSort.QuickSort;

public class SortMain {

	public static void main(String[] args) {
		
		int[] mergearr = {6,3,9,5,2,8};
		int[] quickarr = {-2,3,9,5,-1,8};
		int[] heaparr = {0,3,-9,5,12,8};
		
		System.out.println("Elements Before Sorting Array using Merge are: ");
		for(int val : mergearr) {
			System.out.print(val + " ");
		}
		
		System.out.println("\nSorted Elements after MergeSort are: ");
		MergeSort.mergeSort(mergearr, 0, mergearr.length-1);
		
		for(int val : mergearr) {
			System.out.print(val + " ");
		}
		System.out.println("\n\n************************************************");
		
		System.out.println("\nElements Before Sorting Array using QuickSort are: ");
		for(int val : quickarr) {
			System.out.print(val + " ");
		}
		
		System.out.println("\nSorted Elements after QuickSort are: ");
		QuickSort.quickSort(quickarr, 0, quickarr.length-1);
		
		for(int val : quickarr) {
			System.out.print(val + " ");
		}
		System.out.println("\n\n************************************************");
		
		System.out.println("\nElements Before Sorting Array using HeapSort are: ");
		for(int val : heaparr) {
			System.out.print(val + " ");
		}

		System.out.println("\nSorted Elements after HeapSort are: ");
		HeapSort.heapSort(heaparr);
		
		for(int val : heaparr) {
			System.out.print(val + " ");
		}
	}
}
