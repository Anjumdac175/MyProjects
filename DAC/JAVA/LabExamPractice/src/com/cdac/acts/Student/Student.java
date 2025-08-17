package com.cdac.acts.Student;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 48201550590440324L;
	private Integer rollNo;
	private String name;
	private Double marks;
	private Department dept;
	
	public Student() {
	// Do nothing ctor	
	}

	public Student(Integer rollNo, String name, Double marks, Department dept) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.dept = dept;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, marks, name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return dept == other.dept && Objects.equals(marks, other.marks) && Objects.equals(name, other.name)
				&& Objects.equals(rollNo, other.rollNo);
	}

	@Override
	public String toString() {
		return "Student: "
				+ "\n**********************"
				+"\nrollNo: " + rollNo
				+ "\nname: " + name
				+ "\nmarks: " + marks
				+ "\ndept: " + dept 
				+ "\n";
	}
	
}
