package com.cdac.acts;

import java.util.Scanner;

public class numsToWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] ones = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] teens = {"Ten","Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tens = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		String words="";
		System.out.println("Enter the number from the range of 0 - 99999");
		int number = sc.nextInt();
		if(number == 0)
		{
			words = "Zero";
		}
		else
		{ 
			if(number >=1000 && number <=99999)
			{
				int th = number/1000;
			
				if (th < 20) 
				{
					if (th < 10) 
					{
						words += ones[th-1];
					} 
					else 
					{
						words += teens[th - 10];
					}
				} 
				else 
				{
					words += tens[(th/10)-2] + " " + ones[(th % 10)-1];
				}
				words += " Thousand ";
				number = number % 1000;
			}
			/*if(number >= 1000) {

				words += ones[(number/1000)-1] + " Thousand ";
				number = number%1000;
			}*/
			if(number >= 100)
			{
				words += ones[(number/100)-1] + " Hundred ";
				System.out.println("");
				number = number%100;
				if(number != 0)
				{
					words +="and ";
				}
				else
				{
					words +=" Rupees only ";
				}
			}
		
			if(number >= 20)
			{
				words +=tens[(number/10)-2] +" ";
				number = number%10;
			}
		
			if(number >= 10 && number <= 19)
			{
				words += teens[number-10] + " " + "Rupees only!!";
				number = 0;
			}
		
			if(number > 0 && number<10)
			{
				words += ones[number-1] +" " + "Rupees only!!";
			}
		}
		System.out.println("In Words: " + words.trim());
		sc.close();

	}

}
