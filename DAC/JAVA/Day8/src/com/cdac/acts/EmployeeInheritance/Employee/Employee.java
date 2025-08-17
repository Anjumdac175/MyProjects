package com.cdac.acts.EmployeeInheritance.Employee;

import java.util.Date;

import com.cdac.acts.EmployeeInheritance.Address.Address;
import com.cdac.acts.EmployeeInheritance.DateUtil.DateUtil;
import com.cdac.acts.EmployeeInheritance.Enum.Department;

public abstract class Employee {

	private String empName;
	private long empNo;
	private Date dob;
	private Address address;
	private Department dept;
	private Date doj;
	
	public static long  eno = 250240120100L; 
	
	public Employee() {
		
	}
	
	public Employee(String empName, Date dob, Address address, Department dept, Date doj) {
		this.empName = empName;
		this.empNo = eno++;
		this.dob = dob;
		this.address = address;
		this.dept = dept;
		this.doj = doj;
	}

	abstract public double CalculateSalary();
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public static long getEno() {
		return eno;
	}

	public static void setEno(long eno) {
		Employee.eno = eno;
	}

	@Override
	public String toString() {
		String strDob = DateUtil.getFormattedDate(dob);
		String strDoj = DateUtil.getFormattedDate(doj);
		return "Employee\n[\n empName: " + empName 
				+"\n empNo: " + empNo 
				+ "\n Date of Birth: " + strDob
				+ address 
				+ "\n dept: "+ dept.getValue() 
				+ "\n Date of Joining: " + strDoj+"\n";
	}
	
	
}
