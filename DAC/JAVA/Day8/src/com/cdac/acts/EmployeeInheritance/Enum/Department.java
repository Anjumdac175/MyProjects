package com.cdac.acts.EmployeeInheritance.Enum;

public enum Department {
HR("HR Department"),
FINANCE("Finance Department"),
SALES("Sales Department"),
MARKETING("Marketing Department"),
OPERATIONS("Operations Department");
	
	private String value;
	private Department(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
