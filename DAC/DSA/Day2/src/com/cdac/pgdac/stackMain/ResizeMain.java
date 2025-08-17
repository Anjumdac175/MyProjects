package com.cdac.pgdac.stackMain;

import java.util.Scanner;

import com.cdac.pgdac.stack.StackClass;

public class ResizeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Stack: ");
		int size = sc.nextInt();
		StackClass stack = new StackClass(size);
		
		String ch = null;
		do {
			
			System.out.println("Enter Element into Stack: ");
			int element = sc.nextInt();
			
			stack.push(element);
			System.out.println("Do you Want to Add more Elements ? (y/n): ");
			
			ch = sc.next();
		}while(ch.equalsIgnoreCase("y"));
		
		System.out.println("Top Most Element in the stack: ");
		stack.peek();
		
		System.out.println("Pop out Elements from stack: " + stack.pop());
		
		System.out.println("Elements in Stack are: ");
		stack.Display();
		
		sc.close();
	}

}
