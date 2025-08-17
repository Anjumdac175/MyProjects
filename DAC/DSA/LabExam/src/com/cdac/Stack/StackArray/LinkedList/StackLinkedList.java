package com.cdac.Stack.StackArray.LinkedList;

import com.cdac.LinkedList.SNode;

public class StackLinkedList {
	private SNode head;
	
	public void insertAtEnd(int element) {
		SNode newNode = new SNode(element);
		if(head == null) {
			head = newNode;
			return;
		}
		
		SNode cur = head;
		while(cur.next != null) {
			cur = cur.next; 
		}
		if(cur.next == null) {
			cur.next = newNode;
		}	
	}
	
	public void deleteAtEnd() {
		if(isEmpty()) {
			return;
		}
		
		if(head.next == null) {
			System.out.println("\nElement deleted.." + head.data);
			head = null;
			return;
		}
		
		SNode cur = head;
		SNode prev = null;
		while(cur.next != null) {
			prev = cur;
			cur = cur.next;
		}
		System.out.println("\nElement deleted.." + cur.data);
		prev.next = null;
	}
	
	
	public boolean isEmpty() {
		
		if(head == null) {
			return true;
		}
		
		return false;
	}
	
	public void traverse() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		SNode cur = head;
		while(cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.print("null");
	}
}
