package com.cdac.Queue.QueueUsing2Stack;



import com.cdac.Queue.QueueUsingArray.Queue;


public class QueueUsingTwoStack implements Queue {

	private int[] stack1;
	private int[] stack2;
	
	private int top1, top2;
	public QueueUsingTwoStack(int size) {
		stack1 = new int[size];
		stack2 = new int[size];
		top1 = top2 = -1;
	}

	@Override
	public void enqueue(int element) {
		
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		
		stack1[++top1] = element;
	}

	@Override
	public int dequeue() {
		
		if(isEmpty()) {
			return -1;
		}
		
		if(isEmpty2()) {
			while(!isEmpty1()) {
				stack2[++top2] = stack1[top1--]; 
			}
		}
		
		return stack2[top2--];
		
	}
	
	public boolean isEmpty1() {
		return top1 == -1;
	}
	
	public boolean isEmpty2() {
		return top2 == -1;
	}
	@Override
	public boolean isEmpty() {
		return isEmpty1() && isEmpty2();
	}


	@Override
	public boolean isFull() {
		return top1 == stack1.length-1;
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty..");
		}
		
		for(int i = top2; i >= 0; i--) {
			System.out.print(stack2[i]+" ");
		}
		
		for(int i = 0; i <= top1; i++) {
			System.out.print(stack1[i]+" ");
		}
		System.out.println();
	}
}
