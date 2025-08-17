package com.cdac.acts.FileBasics;

import java.io.File;

public class findDirectory {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\DAC\\");
		
		// check if it is a Directory
		if(file.isDirectory()) {
			System.out.println("It is a Directory..List of Contents are: ");
			String[] dir = file.list();
			if(dir !=null) {
				for(String d : dir) {
					System.out.println(d);
				}
			}
		}
		else if(file.isFile()) { //check if it is a File
			System.out.println("It is a File. Name is: "+file.getName());
		}
		else{
			System.out.println("given Path doesn't Exists");
		}

	}

	
	/*
It is a Directory..List of Contents are: 
Account
Assignments
DAC
java
OOP with Java

C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\DAC\\.classpath
It is a File. Name is: .classpath
*/
}
