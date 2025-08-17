package com.cdac.pgdac.LinkedListTester;

import com.cdac.pgdac.LinkedList.SinglyLinkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		
		SinglyLinkedList sList = new SinglyLinkedList();
		SinglyLinkedList sList1 = new SinglyLinkedList();
		System.out.println("Elements add at Front are: ");
		sList.addAtFront(5);
		sList.addAtFront(25);
		sList.addAtFront(35);
		sList.addAtFront(45);
		sList.addAtFront(15);
		sList.traversal();
		
		System.out.println("Elements add at End are: ");
		sList1.addAtEnd(5);
		sList1.addAtEnd(25);
		sList1.addAtEnd(35);
		sList1.addAtEnd(10);
		sList1.addAtEnd(45);
		sList1.addAtEnd(65);
		sList1.traversal();
	}

}
