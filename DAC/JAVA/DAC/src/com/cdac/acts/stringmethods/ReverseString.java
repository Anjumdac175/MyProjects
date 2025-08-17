package com.cdac.acts.stringmethods;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		System.out.println("Enter String: ");
		str = sc.nextLine();
		
		System.out.println("Before Reversed String is: "+ str);
		char[] ch = str.toCharArray();
		
		int i = 0;
		int n = str.length()-1;
		
		while(i < n)
		{
			char temp = ch[i];
			ch[i] = ch[n];
			ch[n] = temp;
			
			i++;
			n--;
		}
		
		String reversed = new String(ch).toString();
		System.out.println("Reversed String is: "+ reversed);
		sc.close();
	}

}
