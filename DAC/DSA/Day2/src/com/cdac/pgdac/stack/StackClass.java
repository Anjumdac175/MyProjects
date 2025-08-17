package com.cdac.pgdac.stack;

import com.cdac.pgdac.Stack;
import com.cdac.pgdac.StackEmptyException;

public class StackClass implements Stack{

	private int size;
	private int []arr;
	private int top;
	
	public StackClass(int intialsize){
		arr = new int[intialsize];
		size = intialsize;
		top = -1;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void push(int element) {
		 
		if(isFull()) {
			resize();
		}
		arr[++top] = element;
	}

	@Override
	public int pop() {
		
		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty.. Can't pop out any element from Stack...");
		}
		int result = arr[top--];
		return result;
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
		if(top == arr.length-1) {
			return true;
		}
		return false;
	}

	@Override
	public void peek() {
		
		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty..");
		}	
		System.out.println(arr[top]);
	}

	private void resize() {
		
		int capacity = size *2;
		int[] newArray = new int[capacity];
		
		for(int i=0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		
		arr = newArray;
		size = capacity;
		System.out.println("Resize capacity of Stack is: " + size);
	}	
	
	public void Display() {
		
		if(isEmpty()) {
			throw new StackEmptyException("Stack is Empty.. no elements to Display"); 
		}
		
		for(int i = top; i >= 0; i--) {	
			System.out.println(arr[i]);
		}
	}
}
