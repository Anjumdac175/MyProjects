package com.cdac.Queue.QueueUsing2Stack;

import com.cdac.Queue.QueueUsingArray.Queue;

public class QueueUsingStack implements Queue {
	
	private int[] stack;
	private int top;
	
	public QueueUsingStack(int size) {
		stack = new int[size];
		top = -1;
	}

	@Override
	public void enqueue(int element) {
		
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		
		stack[++top] = element;
	}

	@Override
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int front = stack[top--];
		
		if(isEmpty()) {
			return front;
		}
		
		int remove = dequeue();
		
		stack[++top] = front;
		
		return remove;
	}

	@Override
	public boolean isEmpty() {
		
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == stack.length - 1;
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		
		for(int i = 0; i <= top; i++) {
			System.out.print(stack[i] + " ");
		}
		
	}
}
