package com.cdac.acts.lambdaFunctions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Function;

public class lambdaConvertStrDate {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date as a String to Convert into LocalDate(format: dd-MM-yyyy)");
		String date = sc.nextLine();
		
		//converting String to LocalDate
		Function<String, LocalDate> strToDate = str -> LocalDate.parse(str,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate ldate = strToDate.apply(date);
		System.out.println("Converted String into LocalDate is: "+ ldate);
		
		
		//Converting LocalDate into String
		Function<LocalDate, String> dateToStr = localDate -> localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		String formattedDate = dateToStr.apply(ldate);
		System.out.println("Converted again Date into String as: " + formattedDate);
		sc.close();


	}

}
