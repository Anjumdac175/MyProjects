package com.cdac.Stack.PostFix;

public class InfixToPostFix {
	
    private int top;
    private char[] stackArray;

    public InfixToPostFix(int size) {
        stackArray = new char[size];
        top = -1;
    }

    public void push(char element) {
        if (isFull()) {
            System.out.println("Stack OverFlow..." + element);
            return;
        }
        stackArray[++top] = element;
    }

    public char pop() {
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

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return stackArray[top];
    }
}
