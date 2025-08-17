package com.cdac.pgdac.InsertionSort;

import java.util.Scanner;

public class InsertionSortMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter elements into Array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in Array Before Sorting: ");
		for(int values : arr) {
			System.out.print(values + " ");
		}
		
		System.out.println("\nElements in Array after Sorting using Insertion Sort are: ");
		InsertionSort.insertionSort(arr);
		
		for(int sortedValues : arr) {
			System.out.print(sortedValues + " ");
		}
		sc.close();

	}

}
