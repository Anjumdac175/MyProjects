package com.cdac.acts.Student;

public enum Course {

	PG_DAC("Post Gradutation in Advance Computing"),
	PG_AI("Diploma Artificial Intelligence"),
	PG_DESD("Diploma in Embedded System Desgins"),
	PG_VLSI("Diploma in VLSI Design"),
	PG_DBDA("Diploma in Big Data Analytic");
	
	private String value;

	private Course(String value) {
	this.value = value;	
	}

	public String getValue()
	{
		return value;
	}
}
