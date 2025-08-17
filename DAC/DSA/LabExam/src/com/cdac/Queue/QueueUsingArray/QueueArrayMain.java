package com.cdac.Queue.QueueUsingArray;

public class QueueArrayMain {

	public static void main(String[] args) {
		Queue queue = new QueueArray(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println("Elements in Queue");
		queue.display();

	}

}
