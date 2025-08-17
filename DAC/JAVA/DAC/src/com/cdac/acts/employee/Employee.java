package com.cdac.acts.employee;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
	
	private int empNo;
	private String name;
	private int salary;

	public Employee()
	{}
	public Employee(int empNo, String name, int salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", Salary=" + salary + "]";
	}

	public static void searchByempNo(Employee[] e, int eno) {
		int index = 0;
		boolean found = false;
		for(int i=0; i<5; i++)
		{
			if(e[i].empNo == eno)
			{
				found = true;
				index = i;
				
			}
		}
		
		if(found)
		{
			System.out.println("Employee name:"+e[index].name + " for the EmpNo is: "+e[index].empNo);
		}
		else
		{
			System.out.println("Employee not found!!");
		}
		
	}
	public static void sortBySalary(Employee[] e){
		
		Arrays.sort(e, new Comparator<Employee>(){
			public int compare(Employee s1, Employee s2) {
				return s1.salary - s2.salary;
			}
		});
	
		for(Employee s1: e)
		{
			System.out.println(s1.name+" "+s1.salary);
		}
	}
}
