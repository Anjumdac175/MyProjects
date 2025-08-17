package com.cdac.SortedSinglyLinkedList;

public class SortedSinglyLList implements SortedLinkedList {

	private SNode head;
	private SNode tail;
	
	public SortedSinglyLList() {
		this.head = null;
		this.tail = null;
	}
	
	@Override
	public void insert(int element) {
		SNode newNode = new SNode(element);
		
		// 1. if node is Empty
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		// 2. if node is not Empty and and add element in front
		if(newNode.data <= head.data) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		// 3. if element is in smaller than cur
		SNode cur = head;
		SNode prev = null;
		while(cur != null && newNode.data >= cur.data) {
			prev = cur;
			cur = cur.next;
		}

		// 4. if element is larger at add at end
		if(cur == null) {
			tail.next = newNode;
			tail = newNode;
			return;
		}
		
		// 5. if element is inserting in between
		prev.next = newNode;
		newNode.next = cur;

	}

	@Override
	public void delete(int element) {
		// 1. if list is empty
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		// 2.if element is equal to head
		
		if(head.data == element) {
			head = head.next;
			return;
		}
		
		// 3. find element pos traverse
		SNode cur = head;
		SNode prev = null;
		
		while(cur != null && cur.data != element) {
			prev = cur;
			cur = cur.next;
		}
		
		// 4. if element is not found
		if(cur == null) {
			System.out.println("Element Not Found to Delete..");
			return;
		}
		
		// 5. if element is in between the list
		prev.next = cur.next;
		
		// 6. if element is last node
		if(cur == tail) {	
			tail = prev;
			return;
		}
		System.out.println("Element deleted..");
	}
	
	@Override
	public void deleteAll(int element) {
		// 1. if list is empty
		if(head == null) {
			System.out.println("Empty");
			return;
		}

		// 2.if element is equal to head

		while(head != null && head.data == element) {
			head = head.next;
		}

		if(head == null) {
			tail = null;
			System.out.println("Deleted All Occurances...");
			return;
		}

		// 3. find element pos traverse
		SNode cur = head.next;
		SNode prev = head;
		while(cur != null) {
			if(cur.data == element) {
				
				prev.next = cur.next; // middle situation handles

				if(cur == tail) {	// last node
					tail = prev;
				}

				cur = prev.next;

			}else if(cur.data > element){
				break;
			}else {
				prev = cur;
				cur = cur.next;
			}
		}
		System.out.println("Deleted All Occurances..");

	}

	@Override
	public void display() {
		if(head == null) {
			System.out.println("Empty..");
			return;
		}
	
		SNode cur = head;
		while(cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.println("null");
	}

	
}
