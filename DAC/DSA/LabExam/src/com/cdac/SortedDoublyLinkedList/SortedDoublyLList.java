package com.cdac.SortedDoublyLinkedList;

import com.cdac.SortedSinglyLinkedList.SortedLinkedList;

public class SortedDoublyLList implements SortedLinkedList {

	private DNode head;
	private DNode tail;
	

	public SortedDoublyLList() {
		this.head = null;
		this.tail = null;
	}

	@Override
	public void insert(int element) {
		DNode newNode = new DNode(element);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		if(newNode.data <= head.data) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}
		
		DNode cur = head;
		while(cur != null && newNode.data >= cur.data) {
			cur = cur.next;
		}
		
		if(cur == null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			return;
		}
		
		newNode.next = cur;
		newNode.prev = cur.prev;
		cur.prev.next = newNode;
		cur.prev = newNode;

	}

	@Override
	public void delete(int element) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}

		if(element == head.data) {
			if(head == tail) {
				head = tail = null;
			}else {
				head = head.next;
				head.prev = null;
			}
			return;
		}

		DNode cur = head;
		while(cur != null && cur.data != element) {
			cur =cur.next;
		}

		if(cur == null) {
			System.out.println("Element not found..");
			return;
		}

		if(cur == tail) {
			tail = tail.prev;
			tail.next = null;
		}else {
			cur.prev.next = cur.next;
			cur.next.prev = cur.prev;
		}

	}

	@Override
	public void deleteAll(int element) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}

		while(head != null && element == head.data) {
			if(head == tail) {
				head = tail = null;
			}else {
				head = head.next;
				head.prev = null;
			}
		}

		DNode cur = head;
		while(cur != null) {

			if(cur.data == element) {
				cur.prev.next = cur.next;

				if(cur.next != null) {
					cur.next.prev = cur.prev;
				}else {
					tail = cur.prev;
				}
			}
			cur =cur.next;
		}

	}

	@Override
	public void display() {
		if(head == null) {
			System.out.println("Empty..");
			return;
		}
	
		DNode cur = head;
		System.out.print("null -> ");
		while(cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.println("null");

	}

}
