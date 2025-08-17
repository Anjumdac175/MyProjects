package com.cdac.pgdac.LinearSearch;

public class LinearSearch {

	public static boolean findUsingLinearSearch(int[] arr,int element){
		
		for(int values : arr) {
			if(values == element) {
				return true;
			}
		}
		return false;
	}
}
