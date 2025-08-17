package com.cdac.acts.StudentTester;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import com.cdac.acts.CustomException.InvalidMarksException;
import com.cdac.acts.Student.Department;
import com.cdac.acts.Student.Student;
import com.cdac.acts.StudentUtil.StudentFileUtil;
import com.cdac.acts.StudentUtil.StudentUtils;

public class StudentTester {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		String fileName = "Student.dat";
		Set<Student> student = StudentFileUtil.readStudentFromFile(fileName);
		
		String menu = "\n**********STUDENT MANAGEMENT SYTEM*************"
						+"\n 1. Add Student"
						+"\n 2. Store Student Records to File"
						+"\n 3. Display All Student Records"
						+"\n 4. Search Students based on Department"
						+"\n 5. Sort Students by Marks"
						+"\n 6. Filter Students who Scored More than 75%"
						+"\n 7. Using API Group Students By Department and partition By Pass/Fail"
						+"\n 8. Exist from Program"
						+"\n*******************************************";
		
		while(true) {
			
			System.out.println(menu);
			System.out.println("\nEnter your Choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				
				System.out.println("Enter Student Roll No: ");
				Integer rollno = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Student Name: ");
				String name = sc.nextLine();
								
				Double marks = 0.0;
				boolean validmarks = false;
				while(!validmarks) {
					try {
						System.out.println("Enter Student Marks: ");
						marks = sc.nextDouble();
						ValidateMarks(marks);

						System.out.println("Marks Accepted\n");
						validmarks = true;
					}catch(InvalidMarksException e) {
						System.out.println(e.getMessage());
					}catch(InputMismatchException e) {
						System.out.println("Please enter valid marks.. ");
					}
				}
				sc.nextLine();
				
				Department dept = null;
				while(dept == null) {
					System.out.println("Enter Student Department(DAC,AI,DITSS,DBD): ");
					String department = sc.nextLine().toUpperCase();

					try {
						dept = Department.valueOf(department);
					}catch(IllegalArgumentException e) {
						System.out.println("Invalid input given to Department");
					}
				}

				student.add(new Student(rollno,name,marks,dept));
				System.out.println("Student added............");
				break;
				
			case 2:
				System.out.println("Storing Student Data into File......");
				StudentFileUtil.saveStudentTOFile(student,fileName);
				System.out.println("Student Record Saved Successfully into File..");
				
				break;
				
			case 3: 
				
				System.out.println("Retrieving Students Data From File......");
//				student = StudentFileUtil.readStudentFromFile(fileName);
				student.forEach(System.out::println);
				
				break;
				
			case 4:
				
				System.out.println("Search Student based on Department...........");
				System.out.println("\nEnter Student Department: ");
				String deptment = sc.nextLine().toUpperCase();
	
				StudentUtils.searchByDept(student,deptment);
				
				break;
				
			case 5:
				
				System.out.println("Sort Student List based on Marks in Descending Order....");
				StudentUtils.sortByMarks(student);
				break;
				
			case 6: 
				
				System.out.println("Top Scorers of Students are:.........");
				StudentUtils.topScorerStudents(student);
				break;
				
			case 7:
				
				System.out.println("Students List By Department are:..........");
				StudentUtils.filterByDept(student);
				
				
				System.out.println("Students List By Pass/Fail are: ......... ");
				StudentUtils.filterByPassFail(student);
				
				break;
				
			case 8: 
				
				sc.close();
				System.out.println("Data Saved Successfully.Exiting from Program.....");
				System.exit(0);
				break;
			
			default:
				System.out.println("Please enter valid Input!..");
			
			}
		}
		
	}
		public static void ValidateMarks(double marks) throws InvalidMarksException {
			if(marks < 0 || marks > 100) {
				throw new InvalidMarksException("Marks must be in between 0 and 100");
			}
		}
}
