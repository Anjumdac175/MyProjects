package com.cdac.acts.EmployeeInheritance.Address;

public class Address {

	private String houseNo;
	private String city;
	private String pincode;
	private String state;
	
	public Address() {
		
		this.houseNo = "";
		this.city = "";
		this.pincode="";
		this.state="";
	}

	public Address(String houseNo, String city, String pincode, String state) {
		
		this.houseNo = houseNo;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "\n\n Address:\n houseNo: " + houseNo 
				+ "\n city: " + city 
				+ "\n pincode: " + pincode 
				+ "\n state: " + state +"\n";
	}
}
