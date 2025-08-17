package com.cdac.acts.account;

import java.util.Arrays;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account[] ac = new Account[3];
		Account a = new Account();
		
		String menu = "*******************Menu*******************\r\n"
				+ "1.Add Account of the Customer\r\n"
				+ "2.Display Accounts of the Customers\r\n"
				+ "3.Display Account Balance of the Particular Customer\r\n"
				+ "4.withdraw Amount from the Customer Balance\r\n"
				+ "5.Transfer Amount of one Account to the Another\r\n"
				+ "6.Exit from Program\r\n"
				+ "*****************************************";
		

		while(true)
		{			
			System.out.println(menu);
			
			System.out.println("Enter your Choice");
			
			int choice = sc.nextInt();		
			
			switch(choice)
			{
				case 1:
					
					for(int i=0;i<3;i++)
					{
						System.out.println("\nEnter Account No of the Customer");
						int acno = sc.nextInt();
						System.out.println("\nEnter Name of the Customer");
						String name = sc.next();
						System.out.println("\nEnter Initial Balance of the Customer");
						double bal  = sc.nextDouble();
						
						ac[i] = new Account(acno,name,bal);
					}
					break;
					
				case 2:
					
					System.out.println(Arrays.toString(ac));
					break;
					
				case 3:
					
					System.out.println("\nEnter the Account no that you want to be searched:");
					int sacno = sc.nextInt();
					a.searchByAccount(ac,sacno);
					break;
					
				case 4:
					
					System.out.println("\nEnter the Account No that needed to be Withdrawn:");
					int daccount= sc.nextInt();
					System.out.println("\nEnter the amount that needed to be Withdrawn:");
					double draw = sc.nextDouble();
					a.Withdraw(ac,daccount,draw);
					break;
				case 5:
					
					System.out.println("\nEnter the Account no from which we want to transfer the amount");
					int ac1 = sc.nextInt();
					System.out.println("\nEnter the Account no to which we want to transfer the amount");
					int ac2 = sc.nextInt();
					System.out.println("\nEnter the Amount to be tranfered");
					double transfer = sc.nextDouble();
					int id1 = a.searchByAccount(ac, ac1);
					int id2 = a.searchByAccount(ac, ac2);
					a.Transfer(ac,id1,id2,transfer);
					break;
				case 6:
					System.out.println("Program exited Successfully!!!");
					sc.close();
					System.exit(0);
			}

		}
	}

}
