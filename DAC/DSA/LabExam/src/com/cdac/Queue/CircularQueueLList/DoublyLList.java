package com.cdac.Queue.CircularQueueLList;

 class DNode{
	 public int data;
	 public DNode prev;
	 public DNode next;
	
	 public DNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
 }

 public class DoublyLList {

	private DNode head;
	private DNode tail;
	
	public DoublyLList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertAtFront(int element) {
		DNode newNode = new DNode(element);
		
		if(head == null) {
			head = tail = newNode;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void insertAtEnd(int element) {
		DNode newNode = new DNode(element);
		if(head == null) {
			head = tail = newNode;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	public int deleteAtFront() {
		if(head == null) {
			System.out.println("DeQueue is Empty");
			return -1;
		}
		
		int value = head.data;
		
		if(head == tail) {
			head = tail = null;
		}else {
			head = head.next;
			head.prev = null;
		}
		
		return value;
	}
	
	public int deleteAtEnd() {
		if(head == null) {
			System.out.println("DeQueue is Empty");
		}
		
		int value = tail.data;
		
		if(head == tail) {
			head = tail = null;
		}else {
			tail = tail.prev;
			tail.next = null;
		}
		
		return value;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("DeQueue is Empty");
		}
		
		DNode cur = head;
		while(cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}
