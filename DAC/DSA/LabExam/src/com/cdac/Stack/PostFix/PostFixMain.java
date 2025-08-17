package com.cdac.Stack.PostFix;

import java.util.Scanner;

public class PostFixMain {

	private static void convertToPostFix(String str) {
		InfixToPostFix stack = new InfixToPostFix(str.length() * 2);

		char[] postfix = new char[str.length()];
		int j = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
				postfix[j++] = ch;
			
			}else if(ch == '(') {
				stack.push(ch);
			
			}else if(ch ==')') {
				
				while(!stack.isEmpty() && stack.peek() != '(') {
					postfix[j++] = stack.pop();
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
					postfix[j++] = stack.pop();
					
				}
				stack.push(ch);
			}
		}
		
		while(!stack.isEmpty()) {
			postfix[j++] = stack.pop();
		}
		
		String output = new String(postfix,0,j);
		System.out.println("PostFix Notation is: " + output);
	}

	private static int precedence(char ch) {
			switch(ch) {
			case '^': return 3;
			case '*': case '/' : return 2;
			case '+': case '-': return 1;
			}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter InFix: ");
		String str = sc.nextLine();
		
		System.out.println("Infix Notation is: " + str);
		convertToPostFix(str);
		sc.close();
	}
}
