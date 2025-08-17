package com.cdac.acts.stringmethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Welcome to CDAC-ACTS PASHAN";
		/*
		 * Methods
		 * length(),charAt(int index), substring(int begidx,int endidx), equals(Object obj), equalsIgnoreCase(object obj)
		 * toLowerCase(),toUpperCase(),trim(),replace(char old,char new),indexOf(String str),contains(CharSequence s)
		 * compareTo(String anotherstr),concat(String str),isEmpty(),split(String regex)*/
		System.out.println("Length of the String is: "+str.length());
		System.out.println("Character at Given Location charAt(6) is:  "+str.charAt(6));
		System.out.println("Substring in substring(3,8) is: "+str.substring(3, 8));
		
		String str1 = "ACTS";
		String str2 = new String("ACTS");
		System.out.println("Equals: str1.equals(str2) is: "+str1.equals(str2));
		
		String str3 = "acts";
		System.out.println("EqualsIgnoreCase: str2.equalsIgnoreCase(str3) is: "+str2.equalsIgnoreCase(str3));
		
		System.out.println("Convert all to LowerCase: "+str.toLowerCase());
		System.out.println("Convert all to UpperCase: "+str.toUpperCase());
		
		System.out.println("IndexOf():If a given string is present in String give the Index of that String: "+str.indexOf("PASHAN"));
		System.out.println("contain():checks the given string is present in String and returns true/false: "+str.contains(str2));
		System.out.println("CompareTo():compares if given is equal if equal returns 0, if greater returns +ve, if lesser return -ve: "+str.compareToIgnoreCase(str3));

		System.out.println("Concat the String: "+str.concat(" for DAC course"));
		
		String str4 ="";
		System.out.println("If the String is Empty: "+str4.isEmpty());
		
		System.out.println("Replace all spaces with -: "+str.replace(" ", " - "));
		System.out.println("Trim the spaces in String: "+str.trim());
		
		String[] split = str.split(" ");
		System.out.println("Spliting of string: "+Arrays.toString(split));
		
	}

}
