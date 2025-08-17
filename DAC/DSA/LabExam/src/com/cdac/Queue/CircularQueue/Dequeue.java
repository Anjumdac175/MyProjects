package com.cdac.Queue.CircularQueue;

public class Dequeue implements DequeueImp {

	private int[] dqueArray;
	private int front, rear, size, capacity;
	
	public Dequeue(int capacity) {
		dqueArray = new int[capacity];
		this.capacity = capacity;
		this.front = -1;
		this.rear = 0;
		this.size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == capacity;
	}

	@Override
	public void insertFront(int element) {
		if(isFull()) {
			System.out.println("DeQueue is Full..");
			return;
		}
		
		if(isEmpty()) {
			front = rear = 0;
		}else {
			front = (front - 1 + capacity) % capacity;
		}
		
		dqueArray[front] = element;
		size++;
	}

	@Override
	public void insertRear(int element) {
		if(isFull()) {
			System.out.println("DeQueue is Full..");
			return;
		}
		if(isEmpty()) {
			front = rear = 0;
		}else {
			rear = (rear + 1) % capacity;
		}
		
		dqueArray[rear] = element;
		size++;
	}

	@Override
	public void deleteFront() {
		if(isEmpty()) {
			System.out.println("DeQueue is Empty");
			return;
		}
		
		System.out.println("Delete Element for queue is: " + dqueArray[front]);
		front = (front + 1) % capacity;
		size--;
		
		if(size == 0) {
			front = rear = -1;
		}
	}

	@Override
	public void deleteRear() {
		if(isEmpty()) {
			System.out.println("DeQueue is Empty");
			return;
		}
		
		System.out.println("Delete Element for queue is: " + dqueArray[rear]);
		rear = (rear - 1 + capacity) % capacity;
		size--;
		
		if(size == 0) {
			front = rear = -1;
		}
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("DeQueue is Empty");
			return;
		}
		
		for(int i = 0; i < size; i++) {
			int idx = (front + i) % capacity;
			System.out.print(dqueArray[idx] + " ");
		}
		System.out.println();
	}
}
