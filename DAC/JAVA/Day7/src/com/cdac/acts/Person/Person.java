package com.cdac.acts.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

	private String aadharNo;
	private String name;
	private LocalDate dob;
	private Address address;
	public Person() {
		
	}
	public Person(String aadharNo, String name, LocalDate dob, Address address) {
		this.aadharNo = aadharNo;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	@Override
	public String toString() {
		return "\nPerson [\n\naadharNo: " + aadharNo + "\nname: " + name + "\ndob: " + dob + "\n\naddress: " + address + "]";
	}
	
	//to check whether a person is born before 15-08-1947 & to check if a person has more than 100 years of age
	public static void CalPersonAge(Person[] p, int n)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate today = LocalDate.now();
		String s = today.format(formatter);
		LocalDate todaydate = LocalDate.parse(s, formatter);
		LocalDate comparedate = LocalDate.parse("15-08-1947", formatter);
		for(int i=0; i<n; i++)
		{
			if(p[i].dob != null)
			{
				if(p[i].dob.isBefore(comparedate))
				{
					System.out.println(p[i].name + " has DOB Before 15-Aug-1947:" +p[i].dob);
				}
				else
				{
					System.out.println(p[i].name + " has DOB After 15-Aug-1947:" +p[i].dob);
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			Period age = Period.between(p[i].dob, todaydate);
			if(age.getYears() >= 100)
			{
				System.out.println(p[i].name+" has more than 100 Years of Age: "+age.getYears());
			}
			else
			{
				System.out.println(p[i].name+" has not more than 100 Years of Age: "+age.getYears());
			}
		}
		
		
	}
	
}
