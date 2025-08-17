/*
 * Assignments 2:
Q. Implement a Stack class using resizable array that implements the Stack interface defined in class.
Throw appropriate exception when required.

 */

package com.cdac.pgdac.stackMain;

import java.util.Scanner;

import com.cdac.pgdac.stack.StackClass;

public class StackMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Stack: ");
		int size = sc.nextInt();
		
		StackClass stack = new StackClass(size);
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Enter element into stack");
			int element = sc.nextInt();
			stack.push(element);
		}
		
		System.out.println("Topmost element in stack is. ");
		stack.peek();
		
		System.out.println("Elements in stack");
		for(int i=0; i<size; i++) {
			
			stack.pop();
		}
		

		sc.close();
	}

}
