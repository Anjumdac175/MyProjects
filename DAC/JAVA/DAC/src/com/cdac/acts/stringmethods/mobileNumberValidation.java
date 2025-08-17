package com.cdac.acts.stringmethods;

import java.util.Scanner;
import java.util.regex.Pattern;

public class mobileNumberValidation {

	public static String MobileValidation(String num) {
		
		String format = num.replaceAll("[^0-9]", "");
		String starts = "[7-9][0-9]{9}";
		if(Pattern.matches(starts, format))
		{
			if(format.length() == 10)
			{
				return "+91-" + format.substring(0, 3)+"-"+format.substring(3, 6)+"-"+format.substring(6);
			}
			else if(format.length() == 12 && format.startsWith("91"))
			{
				return "+91-"+format.substring(2, 5)+"-"+format.substring(5, 8)+"-"+format.substring(8);
			}
			else
			{
				return "Entered mobile no is Invalid!! Please enter a valid number";
			}
		}
		else
		{
			return "Please enter a mobile number starts with 7,8 or 9";
		}
		}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Mobile Number:");
		String number = sc.nextLine();
		
		String validatednum = MobileValidation(number);
		System.out.println("Formatted Mobile Number is: "+validatednum);
		
	
		sc.close();

	}
}
