package com.cdac.acts.Account.AccountTester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.cdac.acts.Account.Account;

public class AccountMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Account> account = new ArrayList<>();
		List<Account> unmodifiableList = null;
		
		
		
		while(true)
		{
			System.out.println("\n**********AccountMenu***********");
			System.out.println("\n*******************************");
			System.out.println("1. Add Account");
			System.out.println("2. Print All Accounts");
			System.out.println("3. Deposit Amount");
			System.out.println("4. Withdraw Amount");
			System.out.println("5. Create unmodified from existing list");
			System.out.println("6. Use Upper Bound");
			System.out.println("7. Use Lower Bound");
			System.out.println("8. Exit");
			System.out.println("\n*******************************");
			
			System.out.println("\nEnter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					try{
						
					System.out.println("Enter Account Holder Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Date of Opening Account: ");
					String dop = sc.nextLine();
					LocalDate opendate = LocalDate.parse(dop, format);
					System.out.println("Enter Minimum Balance: ");
					double balance = sc.nextDouble();
					sc.nextLine();
					
					account.add(new Account(name,opendate,balance));
					}catch(IllegalArgumentException e){
						System.out.println("Error: " +e.getMessage());
					}
					break;
				
				case 2:
					System.out.println("Account Details are: ");
					System.out.println("***************************\n");
					ListIterator<Account> itr = account.listIterator();
					while(itr.hasNext())
					{
						Account ac = itr.next();
						System.out.println(ac);
					}
					System.out.println("***************************\n");
					break;
				case 3:
					System.out.println("Enter the Account No to which amount is to be depoisted");
					long acno = sc.nextLong();
					
					System.out.println("Enter the amount to be Deposited: ");
					double amount = sc.nextDouble();
					
					boolean found = false;
					
					for(Account acc: account)
					{
						if(acc.getAcno() == acno)
						{
							acc.deposit(amount);
							System.out.println("Amount Depoisted Successfully!.......New Balance is " + acc.deposit(0));
							found = true;
							break;
						}
					}
					if(!found){
						System.out.println("Account No doesnot Exists!!please enter a valid account number");
						
					}
					
					break;
				case 4:
					System.out.println("Enter the Amount from which you want Witdraw amount");
					long acno1 = sc.nextLong();
					
					System.out.println("Enter amount to be Withdraw: ");
					double draw = sc.nextDouble();
					
					boolean found1 = false;
					
					for(Account acc: account)
					{
						if(acc.getAcno() == acno1)
						{
							acc.withdraw(draw);
							System.out.println("Amount Withdraw Successfully!............NEw Balance is: " + acc.withdraw(0));
							found1 = true;
							break;
						}
					}
					if(!found1){
						System.out.println("Account No doesnot Exists!!please enter a valid account number");
						
					}
					break;
				case 5:
					if(account.isEmpty())
					{
						System.out.println("No Account Found!!!");
					}
					else
					{
						LocalDate date = LocalDate.parse("05/04/2023", format);
						unmodifiableList  = Collections.unmodifiableList(account);
						System.out.println("Unmodified list is created!!!");
						
						// this part of code creates an error of java.lang.UnsupportedOperationException as it is unmodified list
						unmodifiableList.add(new Account("Ankita",date,2000.00));
					}
					
					break;
				case 6:
					System.out.println("Using UpperBound<? extends T>.....");
					displayUpperBound(account);
					break;
					
				case 7:
					System.out.println("Using LowerBound<? super T>.......");
					displayLowerBound(account);
					break;
				case 8:
					System.out.println("Exit Successfully");
					sc.close();
					System.exit(0);
			}
			
		}
		

	}
	
	// Upper bound: You can read from this list
	private static void displayLowerBound(List<? extends Account> list) {
		for(Account ac: list)
		{
			System.out.println(ac);
		}
		
	}

	 // Lower bound: You can write to this list
	private static void displayUpperBound(List<? super Account> list) {
		for(Object obj: list)
		{
			System.out.println(obj);
		}
		
	}

}
