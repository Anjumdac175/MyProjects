package com.cdac.acts.Apple.AppleTester;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.cdac.acts.Apple.Apple;

public class AppleFruitTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Apple> apple = new ArrayList<Apple>();
		String menu = "*******AppleMenu******"
				+"\n1. Add Apple"
				+"\n2. Print List of Apples"
				+"\n3. Filter by Weight"
				+"\n4. Filter by Color"
				+"\n5. Filter by Color and weight"
				+"\n6. Filter by Color, weight and Taste"
				+"\n7. Sort by Weight"
				+"\n8. Sort by color"
				+"\n9. Remove Red Apples"
				+"\n10. Remove Green Apples"
				+"\n11. Convert into Set Coolection"
				+"\n12. Exit from Program"
				+"\n*************************\n";
		
		while(true) {
			System.out.println(menu);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				/*System.out.println("Enter Weight of the Apple: ");
				double weight = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Color of the Apple: ");
				String color = sc.nextLine();
				
				System.out.println("Enter the Taste of the Apple: ");
				String taste = sc.nextLine();
				
				apple.add(new Apple(weight,color,taste));
				
				System.out.println("Apple Record Saved Successfully.......");*/
				
				apple.add(new Apple(200.00,"Green","sour"));
				apple.add(new Apple(250.00,"Green","sweet"));
				apple.add(new Apple(100.20,"Red","Looks good"));
				apple.add(new Apple(300.50,"Red","sweet"));
				apple.add(new Apple(350.10,"Green","Rotten"));
				apple.add(new Apple(150.00,"Red","salty"));
				apple.add(new Apple(150.00,"Red","salty"));
				System.out.println("Apple Record Saved Successfully.......");
				break;
				
			case 2:
				System.out.println("Apple List is: \n");
				apple.forEach(System.out::println);
				break;
				
			case 3:
				 apple.stream()
				.filter(w -> w.getWeight() >100)
				.forEach(System.out::println);
				
				 break;
				 
			case 4:
				apple.stream()
				.filter(c ->c.getColor().equals("Green"))
				.forEach(System.out::println);
				apple.stream()
				.filter(c1 ->c1.getColor().equals("Red"))
				.forEach(System.out::println);
				break;
				
			case 5:
				apple.stream()
				.filter(wc -> (wc.getColor().equals("Green")||wc.getColor().equals("Red")) && wc.getWeight()>100)
				.forEach(System.out::println);
				break;
				
			case 6:
				apple.stream()
				.filter(wct -> (wct.getColor().equals("Green")||wct.getColor().equals("Red")) && wct.getWeight()>100 && wct.getTaste().equals("sweet"))
				.forEach(System.out::println);
				break;
				
			case 7:
				apple.stream()
				.sorted((w1, w2) -> w1.getWeight().compareTo(w2.getWeight()))
				.forEach(System.out::println);
				System.out.println("Sorted by Weight................");
				
				break;
				
			case 8:
				apple.stream()
				.sorted((c1, c2) -> c1.getColor().compareTo(c2.getColor()))
				.forEach(System.out::println);
				System.out.println("Sorted by Color................");
				break;
				
			case 9:
				apple.removeIf((c) -> c.getColor().equals("Red"));
				apple.forEach(System.out::println);
				System.out.println("Removed All Red Apples................");
				break;
				
			case 10:
				apple.removeIf((c) -> c.getColor().equals("Green"));
				apple.forEach(System.out::println);
				System.out.println("Removed All green Apples................");
				break;
				
			case 11:
				System.out.println("\nConverting into Set Collection");
				Set<Apple> appleset = new HashSet<>(apple);
				appleset.forEach(System.out::println);
				
				break;
			case 12:
				sc.close();
				System.out.println("Exit Successfully");
				System.exit(0);
				
			}
		}
		
	}

}
