package com.cdac.Stack.StackArray;

public class StackArray implements Stack {

	private int top = -1;
	private int[] stackArray;
	
	public StackArray(int size) {
		stackArray = new int[size];
	}
	
	
	@Override
	public void push(int element) {

		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		stackArray[++top] = element;
	}

	@Override
	public void pop() {

		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		
		System.out.println("\nDeleted Element is: " + stackArray[top--]);
	}

	@Override
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == stackArray.length -1) {
			return true;
		}
		return false;
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		
		for(int i = top; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
		}
	}

}
