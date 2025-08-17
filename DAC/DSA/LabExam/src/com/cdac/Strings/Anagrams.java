package com.cdac.Strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";
		
		char[] angrm1 = str1.toCharArray();
		char[] angrm2 = str2.toCharArray();
		
		Arrays.sort(angrm1);
		Arrays.sort(angrm2);
		
		if(Arrays.equals(angrm1, angrm2)) {
			System.out.println("Anagarams are Equal...");
		}else {
			System.out.println("Anagarams are not Equal...");
		}
		

	}

}
