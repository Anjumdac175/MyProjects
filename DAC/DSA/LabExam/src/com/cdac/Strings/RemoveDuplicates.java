package com.cdac.Strings;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "MylabmyExam";
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(result.indexOf(ch) == -1) {
				result+=ch;
			}
		}
		
		System.out.println("After Removing Duplicates: " + result);
		
//		char[] charArray = str.toCharArray();
//		
//		int idx = 0;
//		for(int i = 0; i < charArray.length-1; i++) {
//			boolean found = false;
//			for(int j = 0; j < idx; j++) {
//				if(charArray[i] == charArray[j]) {
//					found = true;
//					break;
//				}
//			}
//			if(!found) {
//				charArray[idx++] = charArray[i];
//			}
//		}
//
//		System.out.println("After removing: ");
//		for(int i = 0; i < idx; i++) {
//			System.out.print(charArray[i]);
//		}
	
	}
}
