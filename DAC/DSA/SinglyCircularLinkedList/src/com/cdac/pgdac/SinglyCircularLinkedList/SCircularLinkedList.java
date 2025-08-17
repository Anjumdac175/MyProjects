package com.cdac.pgdac.SinglyCircularLinkedList;

public class SCircularLinkedList implements CircularLinkedListImp{

	private SCNode head;
	private SCNode tail;
	
	
	public SCircularLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void insert(int element) {

		SCNode newNode = new SCNode();
		newNode.data = element;
		
		//if List is Empty
		if(head == null) {
			newNode.next = newNode;
			head = newNode;
			tail = newNode;
			return;
		}
		
		//If list is Not Empty and want to add at Begin
		
		if(newNode.data < head.data) {
			newNode.next = head;
			tail.next = newNode;
			head = newNode;
			return;
		}
		
		//If element is greater of all
		SCNode cur = head;
		SCNode prev = null;
		while(cur.next != head && cur.data <= element) {
			prev = cur;
			cur = cur.next;
		}
		
		//Last node Insertion
		if(cur.next == head && cur.data <= element) {
			cur.next = newNode;
			newNode.next = head;
			tail = newNode;
			return;
		}
		
		// in Between Insertion
		newNode.next = cur;
		prev.next = newNode;
	}

	// Deletion in List
	@Override
	public void delete(int element) {
		if(head == null) {
			System.out.println("List is Empty....");
			return;
		}
		//delete only node
		if(head == tail && head.data == element) {
			head = null;
			tail = null;
			System.out.println("Element Deleted..");
			return;
		}
		
		if(head.data == element) {
			head = head.next;
			tail.next = head;
			System.out.println("Element Deleted..");
			return;
		}
		
		//traversal
		SCNode cur = head.next;
		SCNode prev = head;
		while(cur != head) {
			
			if(cur.data == element) {
				prev.next = cur.next;
				
				//Delete at end
				if(cur == tail){
					tail = prev;
				}
				System.out.println("Element Deleted..");
				return;
			}
			
			prev = cur;
			cur = cur.next;
		}
			
		System.out.println("Element Not found... nothing deleted...........");
	}

	@Override
	public void deleteAll(int element) {
	
		if(head == null) {
			System.out.println("List is Empty....");
			return;
		}
		boolean deleted = false;
		//delete only node
		while(head != null && head.data == element) {
			if(head == tail) {
				head = null;
				tail = null;
			System.out.println("Elements Deleted..");
			return;
			}
			head = head.next;
			tail.next = head;
			deleted = true;
		}
		
		// if head has multiple occurance
		if(head == null) {
			System.out.println("Elements Deleted....");
			return;
		}
		
		//traversal
		SCNode cur = head.next;
		SCNode prev = head;
		while(cur != head) {

			if(cur.data == element) {
				prev.next = cur.next;

				//Delete at end
				if(cur == tail){
					tail = prev;
				}
				cur = prev.next; // check if any occurances in between
				deleted = true;
//				return;
			}else {
				prev = cur;
				cur = cur.next;
			}
		}
		if(deleted) {
			System.out.println("Elements Deleted.....");
		}else {
			System.out.println("Element Not found... nothing deleted...........");
		}
	}
	@Override
	public void print() {

		if(head == null) {
			System.out.println("List is Empty...");
			return;
		}
		
		SCNode cur = head;
		do {
			System.out.print(cur.data +" ");
			cur = cur.next;
		}while(cur != head);
		System.out.println("");
	}

	
}
