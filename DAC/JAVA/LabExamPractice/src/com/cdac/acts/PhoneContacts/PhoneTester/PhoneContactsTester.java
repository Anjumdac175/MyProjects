package com.cdac.acts.PhoneContacts.PhoneTester;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cdac.acts.PhoneContacts.Phone.PhoneContacts;
import com.cdac.acts.PhoneContacts.Phone.PhoneUtils;

public class PhoneContactsTester {

	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		  int choice;
	        do {
	            System.out.println("\n----- PHONE BOOK MENU -----");
	            System.out.println("1. Add New Contact");
	            System.out.println("2. Display All Contacts");
	            System.out.println("3. Update Contact (Phone/Email)");
	            System.out.println("4. Remove Contacts above 80 years");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = Integer.parseInt(sc.nextLine());

	            switch (choice) {
	                case 1 -> PhoneUtils.addContact(sc);
	                case 2 -> PhoneUtils.displayContacts(sc);
	                case 3 -> PhoneUtils.updateContact(sc);
	                case 4 -> PhoneUtils.removeOldContacts(sc);
	                case 5 -> System.out.println("Exiting...");
	                default -> System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 5);
	    }
}
