package com.cdac.acts.Person;

public class Address {

	private String houseNo;
	private String city;
	private String state;
	private String pincode;
	private String phoneNo;
	
	public Address() {
		
	}

	public Address(String houseNo, String city, String state, String pincode, String phoneNo) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "\nhouseNo: " + houseNo + "\ncity: " + city + "\nstate: " + state + "\npincode: " + pincode
				+ "\nphoneNo: " + phoneNo + "]\n****************";
	}
	
	
}
