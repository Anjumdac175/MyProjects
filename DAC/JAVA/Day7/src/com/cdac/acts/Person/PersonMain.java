package com.cdac.acts.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of person Array");
		int n = sc.nextInt();
		sc.nextLine();
		Person[] p = new Person[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Person AadharNumber: ");
			String aadhar = sc.nextLine(); 
			
			System.out.println("Enter Person Name: ");
			String name = sc.nextLine(); 
			
			System.out.println("Enter Person Date of Birth: ");
			String dob = sc.nextLine();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(dob, format);
			
			System.out.println("\nEnter Person Address Details: ");
			System.out.println("\n****************************");
			System.out.println("Enter the HouseNumber of Person: ");
			String hno = sc.nextLine(); 
			System.out.println("Enter the City of Person: ");
			String city = sc.nextLine();
			System.out.println("Enter the State of Person: ");
			String state = sc.nextLine();
			System.out.println("Enter the Pincode of Person: ");
			String pin = sc.nextLine();
			System.out.println("Enter the Phone Number of Person: ");
			String phone = sc.nextLine();
			System.out.println("\n****************************");
			Address ad = new Address(hno,city,state,pin,phone);
			p[i] = new Person(aadhar,name,date,ad);
		}
		
		//Printing Array of Person Details
		System.out.println(Arrays.toString(p));
		
		////to check whether a person is born before 15-08-1947 & to check if a person has more than 100 years of age
		Person.CalPersonAge(p, n);
		sc.close();
	}

}
