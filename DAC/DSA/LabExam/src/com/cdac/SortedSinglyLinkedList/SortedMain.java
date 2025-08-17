package com.cdac.SortedSinglyLinkedList;

import com.cdac.SortedCircularSinglyLList.SortedCircularSinglyLList;
import com.cdac.SortedDoublyLinkedList.SortedDoublyLList;

public class SortedMain {

	public static void sortedSLList() {
		SortedSinglyLList sorted = new SortedSinglyLList();
		sorted.insert(10);
		sorted.insert(20);
		sorted.insert(15);
		sorted.insert(5);
		sorted.insert(10);
		sorted.insert(20);
		sorted.insert(15);
		sorted.insert(5);
		System.out.println("Sorted Elements are: ");
		sorted.display();
		
//		sorted.delete(10);
//		sorted.delete(5);
//		sorted.delete(20);
//		sorted.delete(15);
//		System.out.println("Sorted Elements are: ");
//		sorted.display();
		
		sorted.deleteAll(5);
		sorted.deleteAll(15);
		sorted.deleteAll(20);
		sorted.deleteAll(10);
		System.out.println("Sorted Elements are: ");
		sorted.display();
	}
	
	public static void sortedDLList() {
		SortedDoublyLList sorted = new SortedDoublyLList();
		sorted.insert(10);
		sorted.insert(20);
		sorted.insert(15);
		sorted.insert(5);
		sorted.insert(10);
		sorted.insert(20);
		sorted.insert(15);
		sorted.insert(5);
		System.out.println("Sorted Elements are: ");
		sorted.display();
	
//		sorted.delete(10);
//		sorted.delete(5);
//		sorted.delete(20);
//		sorted.delete(15);
		
		sorted.deleteAll(5);
		sorted.deleteAll(15);
		sorted.deleteAll(20);
		sorted.deleteAll(10);
		System.out.println("Sorted Elements are: ");
		sorted.display();
	}
	
	public static void sortedCircularSinglyLList() {
		SortedCircularSinglyLList sorted = new SortedCircularSinglyLList();
		sorted.insert(10);
		sorted.insert(20);
		sorted.insert(15);
		sorted.insert(5);
		sorted.insert(10);
		sorted.insert(20);
		sorted.insert(15);
		sorted.insert(5);
		System.out.println("Sorted Elements are: ");
		sorted.display();
	
//		sorted.delete(10);
//		sorted.delete(5);
//		sorted.delete(20);
//		sorted.delete(15);
		
		sorted.deleteAll(5);
		sorted.deleteAll(15);
		sorted.deleteAll(20);
		sorted.deleteAll(10);
		System.out.println("Sorted Elements are: ");
		sorted.display();
	}
	public static void main(String[] args) {
		//sortedSLList();
		//sortedDLList();
		sortedCircularSinglyLList();
	}

}
