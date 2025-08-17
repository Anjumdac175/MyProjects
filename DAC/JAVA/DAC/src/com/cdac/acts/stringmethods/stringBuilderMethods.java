package com.cdac.acts.stringmethods;

public class stringBuilderMethods {

	public static void main(String[] args) {
		/*
		 * Methods
		 * append(String str),insert(int offset,String str),replace(int start,int end, String str)
		 * delete(int start, int end),reverse(),length(),charAt(int index),setCharAt(int index, char ch)
		 * toString(),capacity(),ensureCapacity(int minimumCapacity)*/
		
		StringBuilder strbuilder = new StringBuilder("Welcome to DAC in Pune");
		System.out.println("Length: " + strbuilder.length());
		System.out.println("CharAt(8): " + strbuilder.charAt(8));
		System.out.println("Append: " + strbuilder.append(" ,PASHAN"));
		System.out.println("Insert: " + strbuilder.insert(0, "Hi , "));
		System.out.println("Replace(12,15,CDAC): " + strbuilder.replace(16, 19, "CDAC"));
		
		System.out.println("Capacity: " + strbuilder.capacity());
		strbuilder.ensureCapacity(50);
		System.out.println("EnsureCapacity: " + strbuilder.capacity());
		
		strbuilder.setCharAt(3, '!');
		System.out.println("SetCharAt(3,'!'): " + strbuilder);
		
		System.out.println("toString: " + strbuilder.toString());
		
		StringBuilder str = new StringBuilder("MUMBAI");
		System.out.println("Reverse the String: " + str.reverse());
		
		System.out.println("Delete the content in string: " + strbuilder.delete(0, 4));
		

	}

}
