package com.cdac.LinkedList;

public class SinglyLinkedList {

	private SNode head;
	
	public void insert(int element) {
		SNode newNode = new SNode(element);
		newNode.next = head;
		head = newNode;
	}
	
	public void delete() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
	}
	
	public void reverse() {
		
		SNode prev = null;
		SNode cur = head;
		SNode next = null;
		
		while(cur != null) { 			//1 -> 2 -> 3 -> 4 -> null
			next = cur.next;			//next = 2 -> 3 -> 4 -> null for first time and like this it go on
			cur.next = prev;			//cur.next = prev = null for first time
			prev = cur;					// prev = cur = 1 -> null
			cur = next;					// cur = next = 2 -> 3 -> 4 -> null for first time and like this it go on
		}
		
		head = prev;
	}
	
	public int findMiddle() {
	
		if(head == null) {
			System.out.println("List is Empty");
			return 0;
		}
		
		SNode slow = head;
		SNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;					// slow pointer moves one step
			fast = fast.next.next;				// fast pointer moves 2 steps forward
		}
		return slow.data;						// by reach slow to mid fast moves to null that's how we get a middle element
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
