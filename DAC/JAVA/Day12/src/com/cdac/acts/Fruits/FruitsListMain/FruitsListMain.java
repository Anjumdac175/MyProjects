package com.cdac.acts.Fruits.FruitsListMain;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.Fruits.DataPrinter;
import com.cdac.acts.Fruits.Fruits;
import com.cdac.acts.Fruits.PriceComparator;

public class FruitsListMain {

	public static void main(String[] args) {
		List<Fruits> fruits = DataUtils.getFruitsList();
		Scanner sc = new Scanner(System.in);
		String Menu = "\n**********Fruit Menu***************\r\n"
				+"1. Add FruitList\r\n"
				+"2. Sort Fruits by Color\r\n"
				+"3. Sort by Qunatity\r\n"
				+"4. Sort by Price\r\n"
				+"5. Exit the Program\r\n"
				+"***************************\r\n";
			while(true)
			{
				System.out.println(Menu);
				System.out.println("Enter the choice:");
				int choice = sc.nextInt();
				
				switch(choice)
				{
					case 1:
//						for(Fruits fl: fruits) {
//							System.out.println(fl);
//						}
						DataPrinter.printData(fruits);
						break;
					case 2:
						Collections.sort(fruits);
						System.out.println("Sorting By Color updated Successfully!!...........");
						break;
						
					case 3:
						Collections.sort(fruits, new Comparator<Fruits>() {
							
							@Override
							public int compare(Fruits f1,Fruits f2) {
								return f1.getQuantity().compareTo(f2.getQuantity());
							}
						});
						System.out.println("Sorting By Quantity updated Successfully!!...........");
						break;
					
					case 4:
						Collections.sort(fruits,new PriceComparator());
						System.out.println("Sorting By Price updated Successfully!!...........");
						break;
						
					case 5:
						sc.close();
						System.out.println("Exit from the Program");
						System.exit(0);
					}
			}
	}

}
