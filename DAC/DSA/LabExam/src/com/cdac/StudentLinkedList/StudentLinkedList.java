package com.cdac.StudentLinkedList;

public class StudentLinkedList {
	
	private Student head;
	
	public void insertStudent(int rollNo, String name) {
		Student newStudent = new Student(rollNo, name);
		
		if(head == null) {
			head = newStudent;
			return;
		}
		
		Student cur = head;
		while(cur.next != null) {
			cur = cur.next;
		}
		cur.next = newStudent;
	}
	
	public String searchStudent(int rollNo) {
		
		if(head == null) {
			System.out.println("Empty");
			return null;
		}
		
		Student cur = head;
		while(cur != null) {
			if(cur.rollNo == rollNo) {
				return "Student [ RollNo: "+cur.rollNo + " Name: "+cur.name + "]\n";
			}
			cur = cur.next;
		}
		
		return null;
	}
	
	public void sortStudent() {
		if(head == null || head.next == null) {
			return;
		}
		
		for(Student i = head; i != null; i= i.next) {
			for(Student j = i.next; j != null; j = j.next) {
				
				if(i.rollNo > j.rollNo) {
					
					int temproll = i.rollNo;
					String tempname = i.name;
					
					i.rollNo = j.rollNo;
					i.name = j.name;
					
					j.rollNo = temproll;
					j.name = tempname;
				}
			}
			
		}
	}
	
	public void deleteStudent(int rollNo) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		if(head.rollNo == rollNo) {
			head = head.next;
			System.out.println("Student deleted......");
			return;
		}
		
		Student cur = head;
		while(cur.next != null && cur.next.rollNo != rollNo) {
			cur = cur.next;
		}
		
		if(cur.next == null) {
			System.out.println("Student not found to delete");
		}else {
			cur.next = cur.next.next;
			System.out.println("Student deleted......");
		}
	}
	
	
	public void display() {
		if(head == null) {
			System.out.println("No Student data");
			return;
		}
		
		Student cur = head;
		while(cur != null) {
			System.out.print("Student [ RollNo: "+ cur.rollNo + "\tName: "+ cur.name + "]\n");
			cur = cur.next;
		}
		System.out.println("");
	}

}
