package com.cdac.Stack.PostFix;

public class PostFixStack {
	 private int top;
	    private int[] stackArray;

	    public PostFixStack(int size) {
	        stackArray = new int[size];
	        top = -1;
	    }

	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("Stack OverFlow..." + element);
	            return;
	        }
	        stackArray[++top] = element;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            return '\0';
	        }
	        return stackArray[top--];
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    public boolean isFull() {
	        return top == stackArray.length - 1;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            return '\0';
	        }
	        return stackArray[top];
	    }

}
