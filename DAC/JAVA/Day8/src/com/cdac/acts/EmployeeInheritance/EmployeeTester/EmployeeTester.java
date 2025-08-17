package com.cdac.acts.EmployeeInheritance.EmployeeTester;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.EmployeeInheritance.Address.Address;
import com.cdac.acts.EmployeeInheritance.DateUtil.DateUtil;
import com.cdac.acts.EmployeeInheritance.Employee.ContractEmployee;
import com.cdac.acts.EmployeeInheritance.Employee.Employee;
import com.cdac.acts.EmployeeInheritance.Employee.PermEmployee;
import com.cdac.acts.EmployeeInheritance.Enum.Department;

public class EmployeeTester {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how may Employees should add: ");
		int n = sc.nextInt();
		sc.nextLine();
		Employee[] emp = new Employee[n];
		int choice = 0;
		while(true)
		{
			System.out.println("\n==========Employee Menu===========\n");
			System.out.println("1.Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Exit from Program");
			System.out.println("\n===============================\n");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					for(int i=0; i<n; i++)
					{
						//Extract permanent / contract employee by choice
						emp[i] = extractEmployee(sc);
						System.out.println("Employee Added Successfully!!....");
					}
					break;
				case 2:
					for(int i=0; i<n; i++)
					{
						//Prints toString() of respected employee
						System.out.println(emp[i]);
						//prints Calculated salary of respected employee
						System.out.println("\nCalculated Salary: "+emp[i].CalculateSalary());
					}
						
						break;
				case 3:
					System.out.println("Exit successfully!!!");
					sc.close();
					System.exit(0);
					
				default:
					System.out.println("!Invalid choice");
						
			}
		}
	}

	private static Employee extractEmployee(Scanner sc) throws ParseException {
		System.out.println("Choose Type of Employee");
		System.out.println("***************************");
		System.out.println("1. PermanentEmployee");
		System.out.println("2. ContractEmployee");
		System.out.println("***************************");
		int choice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Date of Birth: ");
		String dob = sc.nextLine();
		Date Birthdate = DateUtil.getDate(dob);
		
		System.out.println("Enter Address: ");
		System.out.println("***************************");
		
		System.out.println("\nEnter HouseNo: ");
		String hno = sc.nextLine();
		
		System.out.println("\nEnter City: ");
		String city = sc.nextLine();
		
		System.out.println("\nEnter Pincode: ");
		String pin = sc.nextLine();
		
		System.out.println("\nEnter State: ");
		String state = sc.nextLine();
		
		System.out.println("Enter Department from (HR,FINANCE,SALES,MARKETING,OPERATIONS): ");
		String dept = sc.nextLine().toUpperCase();
		Department dname = Department.valueOf(dept);
		
		System.out.println("Enter Date of Joining: ");
		String doj = sc.nextLine();
		Date Joindate = DateUtil.getDate(doj);
		
		System.out.println("\n*******************");
		
		Address ad = new Address(hno,city,pin,state);
		
		if(choice == 1)
		{
			System.out.println("Enter Basic Salary: ");
			double basicsal = sc.nextDouble();
			System.out.println("Enter Incentives: ");
			double inc = sc.nextDouble();
			System.out.println("Enter SpecialAllowance: ");
			double splallowance = sc.nextDouble();
			System.out.println("\n*******************\n");
			return new PermEmployee(name,Birthdate,ad,dname,Joindate,basicsal,inc,splallowance);
		}
		else
		{
			System.out.println("Enter HourlyRate: ");
			double hrpay = sc.nextDouble();
			System.out.println("Enter TotalHourlyWorked: ");
			int hw = sc.nextInt();
			System.out.println("\n*******************\n");
			return new ContractEmployee(name,Birthdate,ad,dname,Joindate,hrpay,hw);
		}
		
	}

}
