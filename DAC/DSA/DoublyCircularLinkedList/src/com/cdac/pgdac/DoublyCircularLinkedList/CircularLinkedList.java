package com.cdac.pgdac.DoublyCircularLinkedList;

public class CircularLinkedList implements CircularDoublyLinkedListImp  {
	
	private DCNode head;
	
	public CircularLinkedList() {
		head = null;
	}

	@Override
	public void insert(int element) {
		DCNode newNode = new DCNode();
		newNode.data = element;
		newNode.next = null;
		newNode.prev = null;
		
		// if List is empty
		if(head == null) {
			newNode.next = newNode;
			newNode.prev = newNode;
			head = newNode;
			return;
		}
		DCNode tail = head.prev;
		//insert at begin
		if(head != null && newNode.data < head.data) {
			newNode.next = head;
			newNode.prev = tail;
			
			tail.next = newNode;
			head.prev = newNode;
			
			head = newNode;
			return;
		}
		
		//traversal
		DCNode cur = head;
		while(cur.next != head) {
			if(cur.data > element) {
				break;
			}
			cur = cur.next;
		}
		
		// last node
		if(cur.next == head && cur.data <= element) {
			
			newNode.next = head;
			newNode.prev = cur;
			cur.next = newNode;
			cur = newNode;
			head.prev = newNode;
			return;
			
		}
		
		// in between
		newNode.next = cur;
		newNode.prev = cur.prev;
	
		cur.prev.next = newNode;
		cur.prev = newNode;
		
	}

	@Override
	public void delete(int element) {
		
		// if list is empty
		if(head == null) {
			System.out.println("List is Empty.....");
			return;
		}
		DCNode tail = head.prev;
		boolean deleted = false;
		//if list is not empty and only one node
		if(head.next == head && head.data == element) {
			System.out.println("Element deleted....");
			deleted = true;
			head = null;
			return;
		}
		
		//if list is not empty anf to delete from beginning
		if(head.data == element) {
			head = head.next;
			head.prev = tail;
			tail.next = head;
			System.out.println("Element deleted.....");
			deleted = true;
			return;
		}
		
		
		DCNode cur = head;
		// traverse
		while(cur.next != head) {
			
			if(cur.data == element) {
				cur.prev.next = cur.next;
				cur.next.prev = cur.prev;
				System.out.println("Element deleted....");
				deleted = true;
				return;
			}
			cur = cur.next;
		}
		
		if(cur.next == head && cur.data == element) {
			cur.prev.next = head;
			head.prev = cur.prev;
			System.out.println("Element deleted....");
			deleted = true;
			return;
		}
		
		if(deleted) {
			System.out.println("Element deleted...");
		}else {
			System.out.println("Element not found...");
		}
	}

	@Override
	public void deleteAll(int element) {

		// if list is empty
		if(head == null) {
			System.out.println("List is Empty.....");
			return;
		}
		boolean deleted = false;
		//if list is not empty and only one node
		while(head != null && head.data == element) {
			if(head.next == head) {
				head = null;
				deleted = true;
				System.out.println("Element deleted....");
				break;
			}
			//if list is not empty anf to delete from beginning
			else{
				DCNode tail = head.prev;
				head = head.next;
				head.prev = tail;
				tail.next = head;
				System.out.println("Element deleted.....");
			}
		}

		DCNode cur = head.next;
		// traverse
		while(cur != head) {

			if(cur.data == element) {
				cur.prev.next = cur.next;
				cur.next.prev = cur.prev;

				deleted = true;
				System.out.println("Element deleted....");
				cur = cur.next;
			}else {
				cur = cur.next;
			}
		}

		if(deleted) {
			System.out.println("All Occurances deleted...");
		}else {
			System.out.println("Element not found...");
		}

	}

	@Override
	public void print() {

		if(head == null) {
			System.out.println("List is Empty...");
			return;
		}
		DCNode cur = head;
		 do{
			System.out.print(cur.data + " ");
			cur = cur.next;
		}while(cur != head);
		System.out.println("");
	}

}
