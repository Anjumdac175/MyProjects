package com.cdac.acts.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student	[]s = new Student[5];
		
		while(true)
		{
			System.out.println("*********Menu**********");
			System.out.println("\n1. Add Student");
			System.out.println("\n2. Print Student Details");
			System.out.println("\n3. Print Student by RollNo");
			System.out.println("\n4. Print all Students sorted by Marks");
			System.out.println("\n5. Exit from Program");
			System.out.println("**********************");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					for(int i=0; i<5; i++)
					{
						System.out.println("\nEnter Student RollNo");
						int rollNo = sc.nextInt();
						System.out.println("\nEnter Student Name");
						String name = sc.next();
						System.out.println("\nEnter Student Marks");
						int marks = sc.nextInt();
					
						s[i] = new Student(rollNo,name,marks);
					}
					
					break;
					
				case 2:
					System.out.println(Arrays.toString(s));
					break;
					
				case 3:
					System.out.println("\nEnter the RollNo to be Searched");
					int search = sc.nextInt();
					Student.searchByRollNo(s,search);
					break;
					
				case 4:
					Student.sortBymarks(s);
					break;
				case 5:
					System.out.println("Exit Successfully!!");
					System.exit(choice);
			}
			sc.close();
		}
	}

}
