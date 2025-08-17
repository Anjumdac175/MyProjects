package com.cdac.SortedCircularSinglyLList;

import com.cdac.SortedSinglyLinkedList.SNode;
import com.cdac.SortedSinglyLinkedList.SortedLinkedList;

public class SortedCircularSinglyLList implements SortedLinkedList {
	private SNode head;
	private SNode tail;
	
	public SortedCircularSinglyLList() {
		head = null;
		tail = null;
	}
	

	@Override
	public void insert(int element) {
		SNode newNode = new SNode(element);
		
		if(head == null) {
			head = tail = newNode;
			tail.next = head;
			return;
		}
		
		if(newNode.data <= head.data) {
			newNode.next = head;
			head = newNode;
			tail.next = head;
			return;
		}
		
		SNode cur = head;
		while(cur.next != head && cur.next.data < newNode.data) {
			cur = cur.next;
		}
		
		newNode.next = cur.next;
		cur.next = newNode;
		
		if(cur == tail) {
			tail = newNode;
		}
		tail.next = head;

	}

	@Override
	public void delete(int element) {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		if(head.data == element) {
			if(head == tail) {
				head = tail = null;
			}else {
				head = head.next;
				tail.next = head;
			}
			return;
		}

		
		SNode cur = head;
		while(cur.next != null && cur.next.data != element) {
			cur = cur.next;
		}
		
		if(cur.next == head) {
			System.out.println("Element not Found");
			return;
		}
		
		if(cur.next == tail) {
			tail = cur;
		}
		
		cur.next = cur.next.next;
		tail.next = head;
	}

	@Override
	public void deleteAll(int element) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}

		while(head.data == element) {
			if(head == tail) {
				head = tail = null;
				return;
			}else {
				head = head.next;
				tail.next = head;
			}
		}


		SNode cur = head;
		while(cur.next != head) {
			if(cur.next.data == element) {
				SNode toDelete = cur.next;
				cur.next = toDelete.next;
				if(toDelete == tail) {
					tail = cur;
				}
			}else {
				cur = cur.next;
			}
		}
		tail.next = head; 
	}

	@Override
	public void display() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		SNode cur = head;
		while(true) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
			
			if(cur == head) {
				break;
			}
		}
		System.out.println("null");
	}

}
