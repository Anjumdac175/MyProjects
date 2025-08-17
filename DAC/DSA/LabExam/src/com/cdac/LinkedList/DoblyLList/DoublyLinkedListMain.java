package com.cdac.LinkedList.DoblyLList;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		DoublyLinkedList dList = new DoublyLinkedList();
		dList.insert(25);
		dList.insert(20);
		dList.insert(15);
		dList.insert(10);
		dList.insert(5);
		System.out.println("Elements in DoubleLList are: ");
		dList.traverse();
		dList.delete();
		dList.delete();
		System.out.println("\nElements in DoubleLList After Deletion are: ");
		dList.traverse();

	}

}
