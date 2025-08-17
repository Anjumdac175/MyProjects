package com.cdac.Queue.QueueUsingArray;

public class QueueArray implements Queue {

	private int front;
	private int rear;
	private int[] queueArray;
	
	
	public QueueArray(int size) {
		queueArray = new int[size];
		front = -1;
		rear = -1;
	}

	@Override
	public void enqueue(int element) {
		
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		if(isEmpty()) {
			front = rear = 0;
		}
		
		queueArray[++rear]  = element;
	}

	@Override
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		if(front == rear) {
			front = rear = -1;
		}
		return queueArray[++front];
	}

	@Override
	public boolean isEmpty() {
		
		return front == -1;
	}

	@Override
	public boolean isFull() {
		
		return rear == queueArray.length-1;
	}

	public void display() {
		if(front == rear) {
			System.out.println("Queue is Empty");
			return;
		}
		
		for(int i = front + 1; i <= rear; i++) {
			System.out.print(queueArray[i] + " ");
		}
	}
}
