package com.cdac.Queue.CircularQueue;

import com.cdac.Queue.QueueUsingArray.Queue;

public class CircularQueue implements Queue{

	private int front;
	private int rear;
	private int size, capacity;
	private int[] queueArray;
	
	public CircularQueue(int capacity) {
		queueArray = new int[capacity];
		front = rear = -1;
		this.capacity = capacity;
		size = 0;
	}

	@Override
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("Queue is Full..");
			return;
		}
		if(isEmpty()) {
			front = 0;
		}
		
		rear = (rear + 1) % capacity;
		queueArray[rear] = element;
		size++;
	}

	@Override
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int removed =  queueArray[front];
		if(front == rear) {
			front = rear = -1;
		}else {
			front = (front + 1) % capacity;
		}
		size--;
		return removed;
	}

	@Override
	public boolean isEmpty() {
		
		return front == -1;
	}

	@Override
	public boolean isFull() {
		
		return (rear + 1) % capacity == front;
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		for(int i = 0; i < size; i++) {
			int idx = (front + i) % capacity;
			System.out.print(queueArray[idx]+ " ");
			idx++;
		}
		System.out.println("");
	}
}
