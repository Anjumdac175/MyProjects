package com.cdac.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		
		SinglyLinkedList sList = new SinglyLinkedList();
		System.out.println("Elements Added into LinkedList are: ");
		sList.insert(20);
		sList.insert(2);
		sList.insert(15);
		sList.insert(35);
		sList.insert(47);
		sList.traverse();
		
		sList.reverse();
		System.out.println("\nElements in LinkedList in a Reverse order are: ");
		sList.traverse();
		
		System.out.println("\n\nMiddle Element in LinkedList is: " + sList.findMiddle());
		
		System.out.println("\nElements Added into LinkedList are: ");
		sList.delete();
		sList.delete();
		sList.traverse();
	}

}
