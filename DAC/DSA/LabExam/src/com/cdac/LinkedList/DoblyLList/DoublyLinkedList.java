package com.cdac.LinkedList.DoblyLList;


public class DoublyLinkedList {
	private DNode head;
	
	public void insert(int element) {
		DNode newNode = new DNode(element);
		
		newNode.next = head;
		
		if(head != null) {
			head.prev = newNode;
		}
		newNode.prev = null;
		head = newNode;
	}

	public void delete() {
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		head = head.next;
		head.prev = null;
	}
	
	public void traverse() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		DNode cur = head;
		while(cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.print("null");
	}
}
