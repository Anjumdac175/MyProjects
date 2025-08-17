package com.cdac.StudentLinkedList;

public class Student {
	public int rollNo;
	public String name;
	public Student next;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		this.next = null;
	}
}
