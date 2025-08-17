package com.cdac.pgdac.LinkedList;

public class SinglyLinkedList implements LinkedList {
	
	private Node head;
	@SuppressWarnings("unused")
	private Node tail;
	
	
	public SinglyLinkedList() {
		
		head = null;
		tail = null;
	}
	
	// Adding Elements into front in a linkedlist
	@Override
	public void addAtFront(int element) {
		
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		newNode.next = head; // As we are adding at front head should be changed
		head = newNode;
	}
	
	// Adding Element at the End of the List
	@Override
	public void addAtEnd(int element) {
		
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		
		tail.next = newNode; // As we are adding at end we can use tail to add elements
		tail = newNode;
	}
	
	// Checking if head node is empty or not
	
	@Override
	public boolean isEmpty() {
		
		if(head == null) {
			return true;
		}
		return false;
	}
	
	//Printing values in LinkedList
	@Override
	public void traversal() {
		
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}
}
