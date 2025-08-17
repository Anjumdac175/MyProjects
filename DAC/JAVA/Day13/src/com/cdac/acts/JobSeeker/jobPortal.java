package com.cdac.acts.JobSeeker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.cdac.acts.JobSeeker.Degree.Degree;

public class jobPortal {

	//registrationId, name, email, password,
		//dateOfBirth, aadharId, phone number, graduationDate, degree(enum).
	Set<jobSeeker> js = new HashSet<>();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public void jobSeekerRegistration(Scanner sc) {
	try {	
			System.out.println("Enter Registration Id: ");
			Long regId = sc.nextLong();
			sc.nextLine();
	
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
	
			System.out.println("Enter Email: ");
			String mail = sc.nextLine();
	
			System.out.println("Enter Password: ");
			String pswd = sc.nextLine();
	
			System.out.println("Enter Date of Birth: ");
			String dob = sc.nextLine();
			LocalDate birthDate = LocalDate.parse(dob,format);
			if(birthDate.isAfter(LocalDate.now())) {
				System.out.println("Birth date should not be in Future");
				return;
			}
	
	
			System.out.println("Enter Aadhar No: ");
			String aadhar = sc.nextLine();
			if(!aadhar.matches("^[1-9][0-9]{11}")) {
				System.out.println("Please enter valid Aadhar Number");
				return;
			}
	
			System.out.println("Enter Phone Number: ");
			String phoneno = sc.nextLine();
			if(!phoneno.matches("^[7-9][0-9]{9}$")) {
				System.out.println("Enter Valid Phone Number");
				return;
			}
	
	
			System.out.println("Enter Graduation Completion Date: ");
			String god = sc.nextLine();
			LocalDate gradDate = LocalDate.parse(god,format);
			if(gradDate.isAfter(LocalDate.now())){
				System.out.println("Graduation Date should not be in Future.....");
				return;
			}
	
	
			System.out.println("Enter Graduation Degree: ");
			String degree = sc.nextLine();
			Degree gdegree = Degree.valueOf(degree);
	
			jobSeeker newSeeker = new jobSeeker(regId,name,mail,pswd,birthDate,aadhar,phoneno,gradDate,gdegree);
			if(js.add(newSeeker))
				System.out.println("Registration Successfull!!!..........");
			else
				System.out.println("Duplicate Entry of Registration.........");
			
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid input: "+e.getMessage());
		}
	}
			
	// Display All Registrations
	public void diplayAllRegistrations() {
		for(jobSeeker seeker: js) {
			System.out.println(seeker);
		}
	}
	
	//Update Email from old to new
	public void updateEmail(Scanner sc) {
		System.out.println("Enter old MailId: ");
		String oldMail = sc.nextLine();
		System.out.println("Enter New MailId: ");
		String newMail = sc.nextLine();
	
		boolean found = false;
		for(jobSeeker seeker: js) {
			if(seeker.getEmail().equalsIgnoreCase(oldMail)) {
				seeker.setEmail(newMail);
				found = true;
				System.out.println("Email Id Updated Successfully.............");
				break;
			}
		}
		if(!found) {
			System.out.println("Email Not Found to Update................");
		}
	}
	
	//Display details by given Degree
	public void displayByDegree(Scanner sc) {
		
		System.out.println("Enter Degree for which Details to be fecthed......");
		System.out.println("Choose Degree from(BTECH,BE,BSc,MSc,MCA,MBA)");
		String degree = sc.nextLine();
		try {
		Degree dgr = Degree.valueOf(degree.toUpperCase());
		for(jobSeeker seeker:js) {
			if(seeker.getDegree().equals(dgr)) {
				System.out.println(seeker);
			}
		}
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid Degree: "+e.getMessage());
		}
	}
	
	
	//Sort the list by EmailId
	public void sortByEmail() {
		List<jobSeeker> jobseeker = new ArrayList<>(js);
		Collections.sort(jobseeker);
		System.out.println("Sorted by Email Successfully.........");
		for(jobSeeker seeker: jobseeker) {
			System.out.println(seeker);
		}
	}
	
	
	//Sort the list by Date of Birth
	public void sortByDoB() {
		List<jobSeeker> jobseeker = new ArrayList<>(js);
		Collections.sort(jobseeker, new Comparator<jobSeeker>(){

			@Override
			public int compare(jobSeeker o1, jobSeeker o2) {
			
				return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
			}
		});
		System.out.println("Sorted By Date of Birth Successfully.........");
		for(jobSeeker seeker: jobseeker) {
			System.out.println(seeker);
		}
	}
	
	
	//Sort the list by Graduation date
	public void sortByGod() {
		List<jobSeeker> jobseeker = new ArrayList<>(js);
		Collections.sort(jobseeker, new Comparator<jobSeeker>(){

			@Override
			public int compare(jobSeeker o1, jobSeeker o2) {
			
				return o1.getGraduationDate().compareTo(o2.getGraduationDate());
			}
		});
		System.out.println("Sorted By Graduation completion date Successfully.........");
		for(jobSeeker seeker: jobseeker) {
			System.out.println(seeker);
		}
	}
}
