package com.cdac.acts.PhoneContacts.Phone;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class PhoneContacts {
	
	private final String name;
	private final LocalDate dob;
	private Set<String> phoneNumbers;
	private String email;
	
	public PhoneContacts(String name, LocalDate dob, Set<String> phoneNumbers, String email) {
		this.name = name;
		this.dob = dob;
		this.phoneNumbers = new HashSet<>(phoneNumbers);
		this.email = email;
	}

	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public int getAge() {
		return Period.between(dob, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "PhoneContacts [name=" + name + ", dob=" + dob + ", phoneNumbers=" + phoneNumbers + ", email=" + email
				+ ", getAge()=" + getAge() + "]";
	}

	
	
	
	
	

}
