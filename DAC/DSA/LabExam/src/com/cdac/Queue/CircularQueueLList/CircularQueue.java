package com.cdac.Queue.CircularQueueLList;

public class CircularQueue implements Queue {

	CircularSinglyLList cqueue = new CircularSinglyLList();
	@Override
	public void enqueue(int element) {
		cqueue.insertEnd(element);
		
	}

	@Override
	public void dequeue() {
		cqueue.deleteFront();
		
	}

	@Override
	public void display() {
		cqueue.display();
	}

}
