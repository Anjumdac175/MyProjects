package com.cdac.acts.StudentUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

import com.cdac.acts.Student.Student;

public class StudentFileUtil {

	public static void saveStudentTOFile(Set<Student> student, String fileName) throws FileNotFoundException, IOException {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName,true))){
			
			oos.writeObject(student);
		}
		
	}

	@SuppressWarnings("unchecked")
	public static Set<Student> readStudentFromFile(String fileName) throws ClassNotFoundException, IOException {
		
		Set<Student> studentList = new HashSet<>();
		File file = new File(fileName);
		if(file.exists()) {
			
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
				
				studentList = (Set<Student>) ois.readObject();
			}
		}
		return studentList;
		
		
	}

}
