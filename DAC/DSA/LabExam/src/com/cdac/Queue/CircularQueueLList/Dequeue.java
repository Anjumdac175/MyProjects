package com.cdac.Queue.CircularQueueLList;

public class Dequeue implements DequeueImp{

	DoublyLList dqueue = new DoublyLList();

	@Override
	public void insertAtFront(int element) {
		dqueue.insertAtFront(element);
		
	}

	@Override
	public void insertAtRear(int element) {
		dqueue.insertAtEnd(element);
		
	}

	@Override
	public void deleteAtFront() {
		System.out.println("Element Deleted is: " + dqueue.deleteAtFront());
		
	}

	@Override
	public void deleteAtRear() {
		System.out.println("Element Deleted is: " + dqueue.deleteAtEnd());
		
	}

	@Override
	public void display() {
		dqueue.display();
		
	}
}
