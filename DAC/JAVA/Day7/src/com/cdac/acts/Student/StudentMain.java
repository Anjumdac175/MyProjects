package com.cdac.acts.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Student Array");
		int n = sc.nextInt();
		Student[] s = new Student[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Student RollNo");
			int rollNo = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			String name = sc.nextLine();
			
			System.out.println("Enter Student Date of Birth");
			String dob = sc.nextLine();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy");
			LocalDate date = LocalDate.parse(dob, format);
			
			//courses of student(PG_DAC,PG_AI,PG_DESD,PG_VLSI,PG_DBDA)
			System.out.println("Enter Student Taken Course");
			String crs = sc.nextLine();
			Course course = Course.valueOf(crs);
			
			s[i] = new Student(rollNo,name,date,course);
		}
		
		// Display Student Array
		System.out.println(Arrays.toString(s));
		
		
		//Sorting of Student Array By Date of Birth
		Student.sortByDOB(s);
		
		
		sc.close();
	}
}
