package com.cdac.acts.lambdaFunctions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class lambdaFunctions {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Amithabh","Aishwaraya","Jaya","Aliya","Deepika","Ranvir Singh","Salam Khan");
		
		//Lambda Function
		//Function R apply<T t> R is Return Type and T is Datatype.. Here R, T can be same
		Function<String, String> toUpper = str ->  str.toUpperCase();
		System.out.println("*****************************************");
		System.out.println("Names Converted into UpperCase are: ");
		System.out.println("*****************************************\n");
		names.forEach(name -> System.out.println(toUpper.apply(name)));
		
		
		//BiFunction R apply<T,U,R> R is Return Type and t and u are two parameters..
		BiFunction <String, String, String> concatString = (str1,str2) -> str1 +" "+str2;
		System.out.println("\n*********************************************");
		System.out.println("Concating of Names are: ");
		System.out.println("****************************************\n");
		names.forEach(concat -> System.out.println(concatString.apply(concat,"From Bollywood")));
		
		//Predicate  R test(T t) takes T value and retruns Boolean
		System.out.println("\n*********************************************");
		System.out.println("Find a String present in List: ");
		System.out.println("****************************************\n");
		Predicate<String> search = (str) -> str.equalsIgnoreCase("Deepika");
		boolean found = false;
		for(String s: names) {
			if(search.test(s)) {
				found = true;
				break;
			}
		}
		System.out.println("IS Deepika present in the List? " + found);
		
		//ForEach void accept(T t) -> it only consumes data and returns nothing
		System.out.println("\n*********************************************");
		System.out.println("For Each with Lambda Function: ");
		System.out.println("****************************************\n");
		names.forEach(name -> System.out.println(name+" - "+name.length()));
		
		System.out.println("\nFor Each with Method Reference: ");
		System.out.println("****************************************\n");
		names.forEach(System.out::println);
		
		
		//For Each with Map
		System.out.println("\n*********************************************");
		System.out.println("Printing of Map with for Each: ");
		System.out.println("****************************************\n");
		
		Map<Integer, String> map = new HashMap<>();
		
		for(int i = 0; i < names.size(); i++) {
			map.put(i, names.get(i));
		}
		
		map.forEach((key,value) -> System.out.println(key+" - "+value));
		
		// Sorting Using Function Literal
		System.out.println("****************************************\n");
		 Comparator<String> scomp = (s1,s2) -> s2.compareTo(s1);
		 Collections.sort(names,scomp);
		 System.out.println("\nSorting in Descending Order using Functional Literal of Lambda Function: ");
		 System.out.println("***************************************************\n");
		 names.forEach(System.out::println);
		 
		// Sorting Using Lambda Function
		System.out.println("****************************************\n");
		System.out.println("\nSorting in Ascending Order using Lambda Function: ");
		System.out.println("***************************************************\n");
		Collections.sort(names,(s1,s2) -> s1.compareTo(s2));
		names.forEach(name -> System.out.println(name));
	}
}
