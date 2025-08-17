package com.cdac.Queue.CircularQueueLList;

public class CircularSinglyLList {
	private CSNode head;
	private CSNode tail;
	
	public CircularSinglyLList() {
		this.head = null;
		this.tail = null;
	}

	public void insertEnd(int element) {
		CSNode newNode = new CSNode(element);
		if(head == null) {
			head = tail = newNode;
			tail.next = head;
			return;
		}

		tail.next = newNode;
		tail = newNode;
		tail.next = head;
	}
	
	public int deleteFront() {
		if(head == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int value = head.data;
		if(head == tail) {
			head = null;
			tail = null;
			
		}else {
			
			head = head.next;
			tail.next = head;
		}
		return value;
	}
	
	
	public void display() {
		if(head == null) {
			System.out.println("Queue is Empty");
			return;
		}
		
		CSNode cur = head;
		while(true) {
			System.out.print(cur.data + " ");
			cur = cur.next;
			
			if(cur == head) {
				break;
			}
		}
		
		System.out.println();
	}
}
