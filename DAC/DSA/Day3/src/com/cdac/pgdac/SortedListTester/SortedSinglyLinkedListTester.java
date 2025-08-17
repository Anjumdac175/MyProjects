package com.cdac.pgdac.SortedListTester;
import com.cdac.pgdac.SortedList.SortedSinglyLinkedList;

public class SortedSinglyLinkedListTester {

	public static void main(String[] args) {
		
		SortedSinglyLinkedList sortedList = new SortedSinglyLinkedList();
		
		sortedList.insert(5);
		sortedList.insert(10);
		sortedList.insert(25);
		sortedList.insert(15);
		sortedList.insert(1);
		sortedList.insert(3);
		sortedList.insert(45);
		sortedList.insert(60);
		sortedList.insert(15);
		sortedList.insert(3);
		System.out.println("Elements in LinkedList are: ");
		sortedList.print();
		sortedList.delete(10);
		sortedList.delete(1);
		System.out.println("Elements in LinkedList After Deletion are: ");
		sortedList.print();
		
		sortedList.deleteAll(15);
		sortedList.deleteAll(3);
		System.out.println("Elements in LinkedList After Deletion are: ");
		sortedList.print();
		
		System.out.println("Is 45 in List? " + sortedList.search(45));
		System.out.println("Is 2 in List? " + sortedList.search(2));
		
		
	}

}
