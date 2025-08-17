package com.cdac.acts.AssEmployee;

public class Address {

	private String housenumber;
	private String city;
	private String state;
	private String pincode;
	private String country;
	
	public Address(){
		
	}
	
	public Address(String housenumber,String city,String state,String pincode,String country) {
		this.housenumber = housenumber;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}

	@Override
	public String toString() {
		return "[\nhousenumber: " + housenumber + "\ncity: " + city + "\nstate: " + state + "\npincode: " + pincode
				+ "\ncountry: " + country + "]";
	}
	
}
