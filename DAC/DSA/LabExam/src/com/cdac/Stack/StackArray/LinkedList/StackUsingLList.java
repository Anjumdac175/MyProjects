package com.cdac.Stack.StackArray.LinkedList;

import com.cdac.Stack.StackArray.Stack;

public class StackUsingLList extends StackLinkedList implements Stack {

	@Override
	public void push(int element) {
		insertAtEnd(element);
	}

	@Override
	public void pop() {
		deleteAtEnd();
		
	}

	@Override
	public boolean isEmpty() {
		super.isEmpty();
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		traverse();
		
	}

}
