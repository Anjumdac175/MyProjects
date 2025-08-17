package com.cdac.acts.EmployeeInheritance.Employee;
import java.util.Date;

import com.cdac.acts.EmployeeInheritance.Address.Address;
import com.cdac.acts.EmployeeInheritance.Enum.Department;

public class PermEmployee extends Employee {

	private double basicSalary;
	private double incentives;
	private double specialAllowance;
	
	public PermEmployee() {
		super();
		this.basicSalary = 0.0;
		this.incentives = 0.0;
		this.specialAllowance = 0.0;
	}

	
	public PermEmployee(String empName, Date dob, Address address, Department dept, Date doj, double basicSalary, double incentives, double specialAllowance) {
		super(empName,dob,address,dept,doj);
		this.basicSalary = basicSalary;
		this.incentives = incentives;
		this.specialAllowance = specialAllowance;
	}


	@Override
	public double CalculateSalary() {
		double totalSalary = basicSalary + incentives + specialAllowance;
		return totalSalary;
	}


	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}


	public double getIncentives() {
		return incentives;
	}


	public void setIncentieves(double incentives) {
		this.incentives = incentives;
	}


	public double getSpecialAllowance() {
		return specialAllowance;
	}


	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}


	@Override
	public String toString() {
		return super.toString()+"\n PermEmployee:\n basicSalary: " + basicSalary 
				+ "\n incentives: " + incentives 
				+ "\n specialAllowance: "+ specialAllowance + "\n]";
	}

}
