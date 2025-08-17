package com.cdac.acts.Employee;

public enum Dept {
HR("Human Resource Dept"),
FINANCE("Finance Dept"),
SALES("Sales Dept"),
MARKETING("Marketing Dept"),
OPERATIONS("Operations Dept");
	
	private String value;
	private Dept(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
