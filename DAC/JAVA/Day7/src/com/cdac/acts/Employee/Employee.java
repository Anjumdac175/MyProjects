package com.cdac.acts.Employee;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

	private String empName;
	private int empNo;
	private LocalDate dob;
	private Dept dept;
	private LocalDate doj;
	
	public static int empno=100;
	
	public Employee() {
		this.empName = "";
		this.empNo = empno++;
		this.dob = null;
		this.dept = null;
		this.doj = null;
	}
	
	public Employee(String empName,LocalDate dob,Dept dept,LocalDate doj) {
		this.empName = empName;
		this.empNo = empno++;
		this.dob = dob;
		this.dept = dept;
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return "Employee:\n[\nempName: " + empName + "\nempNo: " + empNo + "\ndob: " + dob + "\nDept: " + dept.getValue() + "\ndoj: " + doj + "\n]\n";
	}

	public static void checkGratituty(Employee[] emp, int n) {
		
		LocalDate today = LocalDate.now();
		for(int i=0; i<n; i++)
		{
			Period service = Period.between(emp[i].doj, today); 
			if(service.getYears() >= 5)
			{
				System.out.println(emp[i].empName + " is Eligible for Gratituty as he/she have a Experience of "+service.getYears());
			}
			else
			{
				System.out.println(emp[i].empName + " is Not Eligible for Gratituty as he/she have a less Experience of "+service.getYears());
			}
		}
		
		
	}
}
