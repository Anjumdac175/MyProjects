package com.cdac.acts.PhoneContacts.Phone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneUtils {
	private static final Map<String,PhoneContacts> contacts = new HashMap<>();
	private static final Set<String> usedPhones = new HashSet<>();

	public static void addContact(Scanner sc) {
		try {
			System.out.println("Enter name:");
			String name = sc.nextLine();
			System.out.println("Enter Date of Birth(yyyy-MM-dd): ");
			LocalDate dob = LocalDate.parse(sc.nextLine());

			String uniqueKey = name.toLowerCase()+ "-" +dob;
			if(contacts.containsKey(uniqueKey)) {
				System.out.println("Name & dob are ALready Present..");
				return;
			}

			Set<String> phones = new HashSet<>();

			while(true) {

				System.out.println("Enter PhoneNumber: ");
				String phone = sc.nextLine();

				if(phone.equalsIgnoreCase("done")) {
					break;
				}
				if(usedPhones.contains(phone)) {
					System.out.println("Phone number already");
					continue;
				}

				phones.add(phone);
				usedPhones.add(phone);
				System.out.println("Contact Added....");

			}

			System.out.println("Enter Email(optional): ");
			String email = sc.nextLine();

			if(email.isBlank()) {
				email = null;
			}
			
			PhoneContacts contact = new PhoneContacts(name,dob,usedPhones,email);
			contacts.put(uniqueKey, contact);
			System.out.println("PhoneContacts Added");
			
		}catch(Exception e) {
			System.out.println("Enter Valid Input...");
		}
		
	}

	public static void displayContacts(Scanner sc) {
		if(contacts.isEmpty()) {
			System.out.println("Contacts not Available");
		}
		else {
			contacts.values().forEach(System.out::println);
		}
		
	}

	public static void updateContact(Scanner sc) {
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter dob: ");
		LocalDate date = LocalDate.parse(sc.nextLine());
		
		String key = name+"-"+date;
		
		PhoneContacts phonecontact = contacts.get(key);
		
		if(phonecontact == null) {
			System.out.println("Contact not found");
			return;
		}
		
		System.out.println("do you want to add contact");
		System.out.println("1. phone");
		System.out.println("2. email");
		int option = Integer.parseInt(sc.nextLine());
		
		switch(option) {
		case 1:
			usedPhones.removeAll(phonecontact.getPhoneNumbers());
			Set<String> numbers = new HashSet<>();
			while(true) {
				System.out.println("Enter contact");
				String number = sc.nextLine();
				
				if(number.equalsIgnoreCase("done")){
					break;
				}
				if(usedPhones.contains(number)) {
					System.out.println("Already exists");
					continue;
				}
				
				numbers.add(number);
				usedPhones.add(number);
			}
			
			phonecontact.setPhoneNumbers(numbers);
			System.out.println("New Contact Updated...");
			
		case 2:
			  System.out.print("Enter new email: ");
              String email = sc.nextLine();
              phonecontact.setEmail(email);
              System.out.println("Email updated!");
			break;
		default:
			System.out.println("invalid input");
		}
	}

	public static void removeOldContacts(Scanner sc) {
		
		List<String> toRemove = new ArrayList<>();
		for(Map.Entry<String, PhoneContacts> entry: contacts.entrySet()) {
			if(entry.getValue().getAge() > 80) {
				toRemove.add(entry.getKey());
				usedPhones.removeAll(entry.getValue().getPhoneNumbers());
			}
		}
		toRemove.forEach(System.out::println);
		System.out.println("Age above 80 are deleted..");
	}

}
