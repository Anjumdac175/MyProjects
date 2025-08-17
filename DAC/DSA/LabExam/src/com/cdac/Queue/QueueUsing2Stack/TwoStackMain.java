package com.cdac.Queue.QueueUsing2Stack;

import com.cdac.Queue.CircularQueue.CircularQueue;
import com.cdac.Queue.CircularQueue.Dequeue;

public class TwoStackMain {

	public static void usingTwoStack() {
		QueueUsingTwoStack queue = new QueueUsingTwoStack(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println("Elements in Queue are: ");
		queue.display();
		
		System.out.println("\nELement delete from Queue is: "+ queue.dequeue());
		System.out.println("ELement delete from Queue is: "+ queue.dequeue());
		System.out.println("ELement delete from Queue is: "+ queue.dequeue());
		System.out.println("Elements in Queue are: ");
		queue.display();
	}
	
	public static void usingOneStack() {
		QueueUsingStack queue = new QueueUsingStack(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println("Elements in Queue are: ");
		queue.display();
		
		System.out.println("\nELement delete from Queue is: "+ queue.dequeue());
		System.out.println("ELement delete from Queue is: "+ queue.dequeue());
		System.out.println("ELement delete from Queue is: "+ queue.dequeue());
		System.out.println("Elements in Queue are: ");
		queue.display();
	}
	
	public static void circularQueue() {
		CircularQueue cqueue = new CircularQueue(5);
		cqueue.enqueue(10);
		cqueue.enqueue(20);
		cqueue.enqueue(30);
		cqueue.enqueue(40);
		cqueue.enqueue(50);
		System.out.println("Elements in Queue are: ");
		cqueue.display();
		
		System.out.println("\nELement delete from Queue is: "+ cqueue.dequeue());
		System.out.println("ELement delete from Queue is: "+ cqueue.dequeue());
		System.out.println("ELement delete from Queue is: "+ cqueue.dequeue());
		System.out.println("Elements in Queue are: ");
		cqueue.display();
		cqueue.enqueue(60);
		cqueue.enqueue(70);
		cqueue.enqueue(80);
		System.out.println("\nELement delete from Queue is: "+ cqueue.dequeue());
		cqueue.enqueue(90);
		System.out.println("Elements in Queue are: ");
		cqueue.display();
		
	}
	
	public static void deQueue() {
		Dequeue dqueue = new Dequeue(5);
		dqueue.insertRear(10);
		dqueue.insertRear(20);
		dqueue.insertFront(30);
		dqueue.insertFront(40);
		dqueue.insertRear(50);
		System.out.println("Elements in Queue are: ");
		dqueue.display();
		
		dqueue.deleteRear();
		
		System.out.println("Elements in Queue are: ");
		dqueue.display();
		
		dqueue.deleteFront();
		
		System.out.println("Elements in Queue are: ");
		dqueue.display();

	}
	public static void main(String[] args) {
		//usingTwoStack();
		//usingOneStack();
		//circularQueue();
		deQueue();
	}

}
