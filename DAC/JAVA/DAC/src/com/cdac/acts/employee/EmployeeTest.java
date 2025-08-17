package com.cdac.acts.employee;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee []s = new Employee[5];
		
		while(true)
		{
			System.out.println("*********Menu**********");
			System.out.println("\n1. Add Employee");
			System.out.println("\n2. Print Employee Details");
			System.out.println("\n3. Print Employee by EmpNo");
			System.out.println("\n4. Print all Employee sorted by Salary");
			System.out.println("\n5. Exit from Program");
			System.out.println("**********************");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					for(int i=0; i<5; i++)
					{
						System.out.println("\nEnter Student RollNo");
						int empNo = sc.nextInt();
						System.out.println("\nEnter Student Name");
						String name = sc.next();
						System.out.println("\nEnter Student Marks");
						int salary = sc.nextInt();
					
						s[i] = new Employee(empNo,name,salary);
					}
					
					break;
					
				case 2:
					System.out.println(Arrays.toString(s));
					break;
					
				case 3:
					System.out.println("\nEnter the RollNo to be Searched");
					int search = sc.nextInt();
					Employee.searchByempNo(s,search);
					break;
					
				case 4:
					Employee.sortBySalary(s);
					break;
				case 5:
					System.out.println("Exit Successfully!!");
					System.exit(choice);
			}
			sc.close();
		}
	}

}
