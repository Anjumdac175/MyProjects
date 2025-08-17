package com.cdac.acts.AssEmployee;

public class Employee {

	private int empNo;
	private String name;
	private double salary;
	private Address address;
	
	public Employee() {
		
	}
	public Employee(int empNo,String name,double salary, Address address) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "\nEmployee [\nempNo: " + empNo + "\nname: " + name + "\nsalary: " + salary + "\n\naddress: " + address +"]";
	}
	
}
