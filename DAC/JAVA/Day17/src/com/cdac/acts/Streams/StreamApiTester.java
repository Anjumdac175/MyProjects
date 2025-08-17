package com.cdac.acts.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTester {

	public static void main(String[] args) {


		List<String> fruitList = new ArrayList<>();
		fruitList = Arrays.asList("Apple","Banana","Kiwi","Pinapple","Grapes","Figs","BlueBerry","JackFuit","CanBerry","StrawBerry","Banana");
		
		// Print Distinct Elements of List
		List<String> distinctList = fruitList.stream()
								.distinct()
								.collect(Collectors.toList());
		System.out.println("\n******************************");
		System.out.println("Distinct Fruits in List are: ");
		System.out.println("******************************\n");
		distinctList.forEach(System.out::println);
		
		// Print All Elements in the List to Upper Case using map
		List<String> toUpper = fruitList.stream()
								.map((fruit) -> fruit.toUpperCase()) // Function Lambda (T R) -> takes T and Returns R
								.collect(Collectors.toList());
		System.out.println("\n**********************************");
		System.out.println("Fruits in List Converted into All UPPER CASE are: ");
		System.out.println("*************************************\n");
		toUpper.forEach(System.out::println);
		
		//Print Elements in the Lsit with Specified Letter/StartsWith using filter
		List<String> specificLetter = fruitList.stream()
										.filter((fruit) -> fruit.startsWith("B")) // Predicate (T t) -> returns Boolean
										.collect(Collectors.toList());
		System.out.println("\n************************************");
		System.out.println("Fruits in List which starts with Letter B are: ");
		System.out.println("******************************\n");
		specificLetter.forEach(System.out::println);
		
		// concat all strings in the list using reduce
		String concatString = fruitList.stream()
								.reduce("", (fruit1,fruit2) -> fruit1 +" "+fruit2); // Function Lambda (T R) -> takes T and Returns R
		
		System.out.println("\n******************************");
		System.out.println("Fruits in List After Concatinate are: \n");
		System.out.println("******************************\n");
		System.out.println(concatString.trim());
		
		//filter by ending with some text
		List<String> endsLetter = fruitList.stream()
									.filter((fruit) -> fruit.endsWith("Berry")) // Predicate (T t) -> returns Boolean
									.collect(Collectors.toList());
		System.out.println("\n******************************");
		System.out.println("Fruits in List which Ends with Letter Berry are: ");
		System.out.println("******************************\n");
		endsLetter.forEach(System.out::println);
	}

}
