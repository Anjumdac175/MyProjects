package com.cdac.acts.Account.AccountTester;


import java.util.Collections;
import java.util.Scanner;
import com.cdac.acts.Account.AccountManager;
import com.cdac.acts.Account.AccountComparators.sortByDateofOpeningComparator;
import com.cdac.acts.Account.AccountComparators.sortByNameComparator;



public class AccountMain {
	

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			AccountManager manager = new AccountManager();
			while(true) {			
				System.out.println("*********AccountMenu*************");
				System.out.println("\n*******************************\n");
				System.out.println("1. Add Account");
				System.out.println("2. Display All Accounts");
				System.out.println("3. Deposit Amount");
				System.out.println("4. Withdraw Amount");
				System.out.println("5. Sort By Account Number By Descending Order");
				System.out.println("6. Sort By Account Holder Name By Ascending Order");
				System.out.println("7. Sort By Date of Opening of Account");
				System.out.println("8. Sort By Balance In Account");
				System.out.println("9. Exit from the Program");
				System.out.println("\n*******************************\n");
				System.out.println("Enter your Choice");
				int choice = sc.nextInt();
				sc.nextLine();

				switch(choice)
				{
				case 1:
					manager.addAccount(sc);
					break;
				case 2:
					manager.displayAccounts();
					break;
				case 3:
					manager.Deposit(sc);
					break;
				case 4:
					manager.Withdraw(sc);
					break;
				case 5:
					manager.sortByAccountNoDesc();
					break;
				case 6:
					Collections.sort(manager.getAccounts(),new sortByNameComparator());
					System.out.println("Sorted Array by Account Holder Name by Ascending Order...");
					break;
				case 7:
					Collections.sort(manager.getAccounts(),new sortByDateofOpeningComparator());
					System.out.println("Sorted Array by Date of Opening Of Account  by Ascending Order...........");
					break;
				case 8:
					manager.sortByAccountBalanceDesc();
					break;
				case 9:
					sc.close();
					System.out.println("Exited from the Program successfully!!!");
					System.exit(0);
				}
			}
	}

}
