package com.cdac.acts.Accounts.AccountsTester;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import com.cdac.acts.Accounts.Account;
import com.cdac.acts.Accounts.AccountManager;

public class AccountTester {

	public static void main(String[] args) throws AccountNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		AccountManager manager = new AccountManager();
		
		String menu = "\n********Accounts Menu************"
				+"\n1. Add Account"
				+"\n2. Display All Accounts using Enchanced For Loop"
				+"\n3. Find Account and Display it's Details"
				+"\n4. Fund Transfer"
				+"\n5. Remove Account"
				+"\n6. Apply Interests"
				+"\n7. Sort Accounts by Account number"
				+"\n8. Sort Accounts by Account Opening Date"
				+"\n9. Check for ConcurrentModifications"
				+"\n10. Exit from the program"
				+"\n*****************************\n";
		while(true) {
			
			System.out.println(menu);
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1: manager.addAccount(sc); break;
				case 2: manager.displayAllAccounts();break;
				case 3: manager.displayDetailsByAccountNo(sc);break;
				case 4: manager.fundTransfer(sc); break;
				case 5: manager.removeAccount(sc); break;
				case 6: manager.applyInterest(); break;
				case 7:
					Collections.sort(manager.getAllAccounts(), new Comparator<Account>() {
	
						@Override
						public int compare(Account o1, Account o2) {
							
							return o1.getAccNO().compareTo(o2.getAccNO());
						}
					
					});
					System.out.println("\nSorting of Account Number in Ascending Order is done Successfully............");
					break;
				
				case 8:
					Collections.sort(manager.getAllAccounts(),new Comparator<Account>(){
	
						@Override
						public int compare(Account o1, Account o2) {
							
							return o1.getDateOfOpening().compareTo(o2.getDateOfOpening());
						}
						
					});
					System.out.println("\nSorting of Date of Opening of Account in Ascending Order is done Successfully............");

					break;
				
				case 9:
					manager.checkConcurrentModificationSafeRemoval();
					break;
				
				case 10:
					sc.close();
					System.out.println("Program Exit Successfully..........");
					System.exit(0);
						
					default:
						System.out.println("Please enter valid option!!!");
				}
			
			}
		}
}

