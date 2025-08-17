package com.cdac.StudentLinkedList;

public class StudentMain {

	public static void main(String[] args) {
		StudentLinkedList student = new StudentLinkedList();
		
		student.insertStudent(101, "Anjum");
		student.insertStudent(105, "Shreya");
		student.insertStudent(104, "Akshaya");
		student.insertStudent(102, "Shivam");
		student.insertStudent(103, "Vishal");
		System.out.println("Student List is: ");
		student.display();
		int searchrno = 105;
		System.out.println("Is " + searchrno +" in the Student List? " + student.searchStudent(searchrno));
		int searchrno1 = 106;
		System.out.println("Is " + searchrno1 +" in the Student List? " + student.searchStudent(searchrno1));
		
		student.sortStudent();
		System.out.println("\nStudent List after Sorted is: ");
		student.display();
		
		student.deleteStudent(102);
		System.out.println("\nStudent List after delete the Student is: ");
		student.display();
	}

}
