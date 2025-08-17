package com.cdac.Queue.CircularQueueLList;

public class Main {
	
	public static void usingLListCircularQueue() {
		Queue cqueue = new CircularQueue();
		cqueue.enqueue(10);
		cqueue.enqueue(20);
		cqueue.enqueue(30);
		cqueue.enqueue(40);
		cqueue.enqueue(50);
		System.out.println("Elements in Queue are: ");
		cqueue.display();
		
		cqueue.dequeue();
		System.out.println("Elements in Queue are: ");
		cqueue.display();
		
		cqueue.enqueue(60);
		System.out.println("Elements in Queue are: ");
		cqueue.display();
	}

	public static void usingLListDeQueue() {
		DequeueImp dqueue = new Dequeue();
		dqueue.insertAtRear(10);
		dqueue.insertAtRear(20);
		System.out.println("Elements in Queue are: ");
		dqueue.display();
		
		dqueue.insertAtFront(30);
		dqueue.insertAtFront(40);
		System.out.println("Elements in Queue are: ");
		dqueue.display();
		
		dqueue.insertAtFront(60);
		System.out.println("Elements in Queue are: ");
		dqueue.display();
		
		dqueue.deleteAtFront();
		System.out.println("Elements in Queue are: ");
		dqueue.display();
		
		dqueue.deleteAtRear();
		System.out.println("Elements in Queue are: ");
		dqueue.display();
	}
	
	public static void main(String[] args) {
		//usingLListCircularQueue();
		usingLListDeQueue();
		
	}

}
