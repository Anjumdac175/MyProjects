/*
 * Assignment 1: Implement following function to delete element from specified position in given array.
The function should return the updated logical size of array.
   int deleteFromPosition(int[] arr, int n, int pos);
 */
package com.cdac.pgdac;

import java.util.Scanner;

public class DeleteElement {

	private static int DeleteFromPosition(int[] arr, int size, int pos) {
		
		for(int i = pos;i < size-1;i++) {
			arr[i] = arr[i+1];
		}
		return size-1;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size of array:");
		int size= sc.nextInt();
		int[] arr = new int[size] ;
		System.out.println("Enter array elements:");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before Delete...");
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter Position to delete element from array:");
		int pos= sc.nextInt();
		int resizeVar=DeleteFromPosition(arr,size,pos);
		
		System.out.println("After delete...");
		for (int i=0;i<resizeVar;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();

	}
}
