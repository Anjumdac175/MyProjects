package com.cdac.acts.stringmethods;

import java.util.Scanner;

public class Words {

	public static void checkWord(String str, String str1) {
		// using Contains method	
		if(str.toLowerCase().contains(str1.toLowerCase()))
		{
			System.out.println(str1 + " is found !!");
		}
		else
		{
			System.out.println("Word not found !!");
		}
	}
	
	public static void checkOccurenceWord(String str, String str2) {
		// using split
		
		int count = str.toLowerCase().split(str2.toLowerCase(), -1).length-1;
		System.out.println("No of Occureneces of "+str2+" is: "+count);
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = "";
		System.out.println("Enter String: ");
		str = sc.nextLine();
		
		String str1 = "";
		System.out.println("\nEnter the word to be checked: ");
		str1 = sc.nextLine();
		
		checkWord(str,str1);
		
		String str2 = "";
		System.out.println("\nEnter the word to be checked for Occurence: ");
		str2 = sc.nextLine();
		checkOccurenceWord(str,str2);
		
		sc.close();
	}
}
