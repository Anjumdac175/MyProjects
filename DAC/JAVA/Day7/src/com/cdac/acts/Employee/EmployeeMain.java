package com.cdac.acts.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter the Size of Employee Array: ");
		int n = sc.nextInt();
		sc.nextLine();
		Employee[] emp = new Employee[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the Details of Employee "+(i+1)+" : ");
			emp[i] = addEmployee(sc, format);
		}
		
		//To print List of Employees
		System.out.println(Arrays.toString(emp));
		
		// Checking a Employee is Eligible for Gratituty or not 
		Employee.checkGratituty(emp,n);
		
		sc.close();
	}

	private static Employee addEmployee(Scanner sc, DateTimeFormatter format) {
		Employee emp;
		
		System.out.println("***********************************");
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Date of Birth: ");
		String dob = sc.nextLine();
		LocalDate Birthdate = LocalDate.parse(dob, format);
		
		System.out.println("Enter Employee Department from(HR,FINANCE,SALES, MARKIETING,OPERATIONS): ");
		String dept = sc.nextLine().toUpperCase();
		Dept dep = Dept.valueOf(dept);
		
		System.out.println("Enter Employee Joining Date in Department");
		String doj = sc.nextLine();
		LocalDate joinDate = LocalDate.parse(doj, format);
		System.out.println("***********************************");
		emp = new Employee(name,Birthdate,dep,joinDate);
		return emp;
	}

}

/*Enter the Size of Employee Array: 
2
Enter the Details of Employee 1 : 
***********************************
Enter Employee Name: 
Nishad Anjum
Enter Employee Date of Birth: 
16-08-1998
Enter Employee Department from(HR,FINANCE,SALES, MARKIETING,OPERATIONS): 
hr
Enter Employee Joining Date in Department
10-10-2019
***********************************
Enter the Details of Employee 2 : 
***********************************
Enter Employee Name: 
Shreya
Enter Employee Date of Birth: 
20-05-2002
Enter Employee Department from(HR,FINANCE,SALES, MARKIETING,OPERATIONS): 
finance
Enter Employee Joining Date in Department
25-01-2023
***********************************
[Employee:
[
empName: Nishad Anjum
empNo: 100
dob: 1998-08-16
Dept: Human Resource Dept
doj: 2019-10-10
]
, Employee:
[
empName: Shreya
empNo: 101
dob: 2002-05-20
Dept: Finance Dept
doj: 2023-01-25
]
]
Nishad Anjum is Eligible for Gratituty as he/she have a Experience of 5
Shreya is Not Eligible for Gratituty as he/she have a less Experience of 2*/

