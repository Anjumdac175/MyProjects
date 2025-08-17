package com.cdac.acts.AssEmployee;

import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Address ad = new Address();
		Employee emp = new Employee();
		
		System.out.println("Enter Employee Details: ");
		System.out.println("*****************************");
		System.out.println("\nEnter Employee Id: ");
		int empno = sc.nextInt();
		sc.nextLine();
		System.out.println("\nEnter Employee Name: ");
		String name = sc.nextLine();
		System.out.println("\nEnter Employee Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("\nEnter Employee Address: ");
		System.out.println("\n*****************************");
		System.out.println("\nEnter Employee Housenumber: ");
		String hno = sc.nextLine();
		System.out.println("\nEnter Employee City: ");
		String city = sc.nextLine();
		System.out.println("\nEnter Employee State: ");
		String state = sc.nextLine();
		System.out.println("\nEnter Employee pincode: ");
		String pin = sc.nextLine();
		System.out.println("\nEnter Employee country: ");
		String ctry = sc.nextLine();
		
		ad = new Address(hno,city,state,pin,ctry);
		emp = new Employee(empno,name,salary,ad);
		
		System.out.println("\n*****************************");
		System.out.println("Enployee Details are: ");
		System.out.println(emp.toString());
		
		sc.close();
	}

}
