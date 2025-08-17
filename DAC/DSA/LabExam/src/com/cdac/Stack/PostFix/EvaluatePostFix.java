package com.cdac.Stack.PostFix;

import java.util.Scanner;

public class EvaluatePostFix {

	
	private static void evaluatePostFix(String postfix) {
		
		PostFixStack stack = new PostFixStack(postfix.length() * 2);;
		
		String[] numbers = postfix.split(" ");
		
		for(String nums : numbers) {
			if(nums.matches("^[0-9]+$")) {
				stack.push(Integer.parseInt(nums));
			}else {
				int b = stack.pop();
				int a = stack.pop();
				int result = 0;
				switch(nums.charAt(0)) {
				case '+': 
					result = a + b; 
					System.out.println(a + " " + nums + " " + b + " → " + result);
					break;
				case '-': 
					result = a - b; 
					System.out.println(a + " " + nums + " " + b + " → " + result);
					break;
				case '*': 
					result = a * b; 
					System.out.println(a + " " + nums + " " + b + " → " + result);
					break;
				case '/': 
					result = a / b; 
					System.out.println(a + " " + nums + " " + b + " → " + result);
					break;
				default:
				    throw new IllegalArgumentException("Invalid operator: " + nums);

				}
				
				stack.push(result);
				
			}
		}
		int output = stack.pop();
		System.out.println("Value for the PostFix Expression is: " + output);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String postfix = "5 6 2 + * 12 4 / -";
		System.out.println("PostFix Expression is : " + postfix);
		evaluatePostFix(postfix);
		
		sc.close();
	}
}
