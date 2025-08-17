package com.cdac.pgdac.SortedList;

import com.cdac.pgdac.LinkedList.Node;

public class SortedSinglyLinkedList implements SortedLinkedList {
	private Node head;
		
	public SortedSinglyLinkedList() {	
		head = null;
	}
	
	@Override
	public void insert(int element) {
	
		// If List is Empty to insert first Node
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		//If List is Not Empty to Traverse for the Location to insert
		Node current = head;
		Node prev = null;
		while(current != null) {
			
			// checks for the Largest ELement in the List if found insert in Location if not Inserts in Last
			if(current.data > newNode.data) {
				break;
			}
			prev = current;
			current = current.next;
		}
		
		//Adding smallest node at the First
		 if(prev == null) {
			 newNode.next = head;
			 head = newNode;
			 return;
		 }
		
		 //Adding Element in between prev and Current
		 prev.next = newNode;
		 newNode.next = current;
	}
	
	
	@Override
	public void delete(int element) {
		
		if(head == null) {
			System.out.println("No Elements in List....");
		}
		
		if(head.data == element)
		{
			System.out.println("\nNode "+ head.data+ " deleted Successfully....");
			head = head.next;
			return;
		}
		Node current = head;
		Node prev = null;
		
		while(current != null) {
			if(current.data == element) {
				prev.next = current.next;
				System.out.println("\nNode "+ current.data+ " deleted Successfully....");
				return;
			}
			prev = current;
			current = current.next;
		}
		System.out.println("Element not Found............Nothing Deleted...");
	}
	
	@Override
	public void deleteAll(int element) {
		
		if(head == null) {
			System.out.println("No Elements in List........");
			return;
		}
		
		boolean deleted = false;
		while(head != null && head.data == element) {
			System.out.println("Deleted Element: " + head.data);
			head = head.next;
			deleted = true;
		}
		
		Node current = head;
		Node prev = null;
		while(current != null) {
			if(current.data == element) {
				System.out.println("\n" + current.data+ " are Deleted....." );
				if(prev != null) {
					prev.next = current.next;
				}
				current = current.next;
				deleted = true;
				
			}else {
				prev = current;
				current = current.next;
			}
		}

		if(deleted) {
			System.out.println("All Occurence of the Element are deleted...");	
		}else {
			System.out.println("Element not Found.. Nothing Deleted");
		}
	}

	@Override
	public boolean search(int element) {
		Node current = head;
		while(current != null) {
			if(current.data == element) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	
	//To print Data
	@Override
	public void print() {
		
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}	
		System.out.println("");
	}

	

	
}
