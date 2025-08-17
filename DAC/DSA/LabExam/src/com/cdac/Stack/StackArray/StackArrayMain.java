package com.cdac.Stack.StackArray;

import com.cdac.Stack.StackArray.LinkedList.StackUsingLList;

public class StackArrayMain {
	
	public static void stackByArray() {
		Stack stack = new StackArray(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Stack elements are: ");
		stack.display();
		
		stack.pop();
		
		System.out.println("Stack elements after deleting are: ");
		stack.display();
		
	}
	
	public static void stackByLList() {
		StackUsingLList stack = new StackUsingLList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Stack elements are: ");
		stack.display();
		
		stack.pop();
		stack.pop();
		
		System.out.println("Stack elements after deleting are: ");
		stack.display();		
	}

	public static void main(String[] args) {
		//stackByArray();
		stackByLList();
		
	}
}
