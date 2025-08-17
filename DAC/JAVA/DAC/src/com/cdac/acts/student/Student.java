package com.cdac.acts.student;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
	
	private int rollNo;
	private String name;
	private int marks;

	public Student()
	{}
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void searchByRollNo(Student[] s, int rno) {
		int index = 0;
		boolean found = false;
		for(int i=0; i<5; i++)
		{
			if(s[i].rollNo == rno)
			{
				found = true;
				index = i;
				
			}
		}
		
		if(found)
		{
			System.out.println("Student name:"+s[index].name + " for the RollNo is: "+s[index].rollNo);
		}
		else
		{
			System.out.println("Student not found!!");
		}
		
	}
	public static void sortBymarks(Student[] s){
		
		Arrays.sort(s, new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				return s1.marks - s2.marks;
			}
		});
	
		for(Student s1: s)
		{
			System.out.println(s1.name+" "+s1.marks);
		}
	}
}
	
