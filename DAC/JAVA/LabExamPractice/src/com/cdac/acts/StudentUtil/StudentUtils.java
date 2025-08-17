package com.cdac.acts.StudentUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cdac.acts.Student.Department;
import com.cdac.acts.Student.Student;

public class StudentUtils {


	public static void searchByDept(Set<Student> student, String dept) {
		
		// Filtering Student based on Department
		student.stream()
		.filter((s) -> s.getDept() == Department.valueOf(dept))
		.forEach(System.out::println);		
	}

	public static void sortByMarks(Set<Student> student) {

		student.stream()
		.sorted((s1,s2) -> s2.getMarks().compareTo(s1.getMarks()))
		.forEach(System.out::println);
	}

	public static void topScorerStudents(Set<Student> student) {

		student.stream()
		.filter((s) -> s.getMarks() > 75)
		.forEach(System.out::println);
	}

	public static void filterByDept(Set<Student> student) {
		
		Map<Department, Set<Student>> filterDept =	student.stream()
							.collect(Collectors.groupingBy(Student::getDept,Collectors.toSet()));
		
		filterDept.forEach((d,s) -> System.out.println(d + " - "+s));
		
	}

	public static void filterByPassFail(Set<Student> student) {
		Map<Boolean, List<Student>> partitionMarks = student.stream()
											.collect(Collectors.partitioningBy((s)->s.getMarks() > 40));
		
		System.out.println("Passed Student List are: ");
		partitionMarks.get(true).forEach(System.out::println);
		
		System.out.println("Fail Student List are: ");
		partitionMarks.get(false).forEach(System.out::println);
		
	}

	
}
