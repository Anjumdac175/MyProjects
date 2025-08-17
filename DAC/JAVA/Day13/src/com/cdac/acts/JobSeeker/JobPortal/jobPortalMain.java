package com.cdac.acts.JobSeeker.JobPortal;

import java.util.Scanner;

import com.cdac.acts.JobSeeker.jobPortal;

public class jobPortalMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		jobPortal jp = new jobPortal();
		String menu ="\n********Job Seeker Potal************"
				+"\n1. Job Seeker Registration"
				+"\n2. Display All Registration"
				+"\n3. Update Email"
				+"\n4. Display Details By Degree"
				+"\n5. Sort By Email"
				+"\n6. Sort By Date of Birth"
				+"\n7. Sort By Graduation Date"
				+"\n8. Exit from the program"
				+"\n*****************************\n";
		while(true) {
			
			System.out.println(menu);
			
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1: jp.jobSeekerRegistration(sc);
				break;
			case 2: jp.diplayAllRegistrations();
				break;
			case 3: jp.updateEmail(sc);
				break;
			case 4: jp.displayByDegree(sc);
				break;
			case 5: jp.sortByEmail();
				break;
			case 6: jp.sortByDoB();
				break;
			case 7: jp.sortByGod();
				break;
			case 8:
				sc.close();
				System.out.println("Exit from Program.......");
				System.exit(0);
			default:
				System.out.println("Invalid Input..........");
			}
		}
		
		
	}

}
