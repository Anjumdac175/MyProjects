package com.cdac.pgdac;

import java.util.Scanner;

import com.cdac.pgdac.BinarSearch.BinarySearch;
import com.cdac.pgdac.LinearSearch.LinearSearch;

public class SearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array...");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements into Array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in Array are: ");
		for(int elements: arr) {
			System.out.print(elements+" ");
		}
		
		System.out.println("\nEnter the element to be searched Using Linear Search is: ");
		int lsearch = sc.nextInt();
		System.out.println("Is " +lsearch + " present in Array? "+ LinearSearch.findUsingLinearSearch(arr,lsearch));
	
		System.out.println("\nEnter the element to be searched Using Binary Search is: ");
		int bsearch = sc.nextInt();
		System.out.println("Is " +bsearch + " present in Array? "+ BinarySearch.FindUsingBinarySearch(arr,bsearch));
		
		sc.close();

	}

}
