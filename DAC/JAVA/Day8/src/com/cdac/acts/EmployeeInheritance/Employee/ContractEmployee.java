package com.cdac.acts.EmployeeInheritance.Employee;

import java.util.Date;

import com.cdac.acts.EmployeeInheritance.Address.Address;
import com.cdac.acts.EmployeeInheritance.Enum.Department;

public class ContractEmployee extends Employee{

	private double hourlyRate;
	private int totalHoursWorked;
	
	public ContractEmployee() {
		super();
	}

	public ContractEmployee(String empName, Date dob, Address address, Department dept, Date doj,double hourlyRate, int totalHoursWorked) {
		super(empName,dob,address,dept,doj);
		this.hourlyRate = hourlyRate;
		this.totalHoursWorked = totalHoursWorked;
	}
	

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getTotalHoursWorked() {
		return totalHoursWorked;
	}

	public void setTotalHoursWorked(int totalHoursWorked) {
		this.totalHoursWorked = totalHoursWorked;
	}

	@Override
	public double CalculateSalary() {
		
		return hourlyRate * totalHoursWorked;
	}

	@Override
	public String toString() {
		return super.toString()+"\n ContractEmployee[\n hourlyRate: " + hourlyRate 
				+ "\n totalHoursWorked: " + totalHoursWorked + "\n]";
	}
	
	
}
