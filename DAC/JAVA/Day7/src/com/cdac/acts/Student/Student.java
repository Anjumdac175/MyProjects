package com.cdac.acts.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Student {

	private int rollNo;
	private String name;
	private LocalDate dob;
	private Course course;
	
	public Student() {
		
	}

	public Student(int rollNo, String name, LocalDate dob, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.course = course;
	}

	@Override
	public String toString() {
		return "\nStudent [\nrollNo=" + rollNo + "\nname=" + name + "\ndob=" + dob + "\ncourse=" + course.getValue() + "]\n";
	}
	
	//Sorting of Student Array By Date of Birth
	public static void sortByDOB(Student[] s) {
			Arrays.sort(s,new Comparator<Student>(){

				@Override
				public int compare(Student s1, Student s2) {
					return s1.dob.compareTo(s2.dob);
				}
			});
			
		System.out.println("\nSorted Array of Students By DOB are:\n");
		System.out.println(Arrays.toString(s));
	}
}
