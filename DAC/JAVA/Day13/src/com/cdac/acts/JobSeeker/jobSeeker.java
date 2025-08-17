package com.cdac.acts.JobSeeker;

import java.time.LocalDate;
import java.util.Objects;

import com.cdac.acts.JobSeeker.Degree.Degree;

public class jobSeeker implements Comparable<jobSeeker>{

	//registrationId, name, email, password,
	//dateOfBirth, aadharId, phone number, graduationDate, degree(enum).
	private Long registrationId;
	private String name;
	private String email;
	private String password;
	private LocalDate dateOfBirth;
	private String aadharId;
	private String phoneNumber;
	private LocalDate graduationDate;
	private Degree degree;
	
	public jobSeeker() {
	}

	public jobSeeker(Long registrationId, String name, String email, String password, LocalDate dateOfBirth,
			String aadharId, String phoneNumber, LocalDate graduationDate, Degree degree) {
		
		this.registrationId = registrationId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.aadharId = aadharId;
		this.phoneNumber = phoneNumber;
		this.graduationDate = graduationDate;
		this.degree = degree;
	}

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	@Override
	public int compareTo(jobSeeker o) {
		
		return this.email.compareTo(o.email);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		jobSeeker jseeker = (jobSeeker) obj;
		return degree == jseeker.degree && Objects.equals(registrationId,jseeker.registrationId) && Objects.equals(aadharId, jseeker.aadharId)
				&& Objects.equals(dateOfBirth, jseeker.dateOfBirth) && Objects.equals(email, jseeker.email) && Objects.equals(graduationDate, jseeker.graduationDate)
				&& Objects.equals(name, jseeker.name) && Objects.equals(password, jseeker.password) && Objects.equals(phoneNumber, jseeker.phoneNumber);
	}
	
	@Override
	public int hashCode(){
		int readyHash = Objects.hash(degree,registrationId,aadharId,dateOfBirth, email,graduationDate,name,password,phoneNumber);
		System.out.println("Ready hash" + name +"" + readyHash);
		return readyHash;
	}
	
	@Override
	public String toString() {
		return "jobSeeker\n"+"registrationId: " + registrationId 
							+ "\nname: " + name 
							+ "\nemail: " + email 
							+ "\npassword: "+ password 
							+ "\ndateOfBirth: " + dateOfBirth 
							+ "\naadharId: " + aadharId 
							+ "\nphoneNumber: " + phoneNumber
							+ "\ngraduationDate: " + graduationDate 
							+ "\ndegree: " + degree.getValue() + "\n";
	}

	
	
}
