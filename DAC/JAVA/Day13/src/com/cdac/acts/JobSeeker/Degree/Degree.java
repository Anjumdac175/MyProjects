package com.cdac.acts.JobSeeker.Degree;

public enum Degree {
	BTECH("Bachelor of Technology"),
	BE("Bachelor of Engineering"),
	BSc("Bachelor of Science"),
	MSc("Master of Science"),
	MCA("Master of Computer Applications"),
	MBA("Master of Business Administration");
	
	private String value;
	
	Degree(String value) {
		
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
