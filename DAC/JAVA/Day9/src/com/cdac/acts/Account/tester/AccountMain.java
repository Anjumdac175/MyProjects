package com.cdac.acts.Account.tester;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cdac.acts.Account.AccountInherit.Account;
import com.cdac.acts.Account.AccountInherit.CurrentAccount;
import com.cdac.acts.Account.AccountInherit.DepositAccount;
import com.cdac.acts.Account.AccountInherit.SavingsAccount;


public class AccountMain {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Account account = createAccount(sc); // Extracted Account Creation Method
		
		if(account == null)
		{
			System.out.println("Account creation Failed!!!!!!!");
			return;
		}
		
		int choice = 0;
		
		do {
			System.out.println("\n==========Account Menu===========\n");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Calculate MaturityAmount");
			System.out.println("4. Display All Accounts");
			System.out.println("5. Exit..");
			System.out.println("\n===================================\n");
			
			System.out.println("Enter your Option");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: performDeposit(sc, account); break;
				case 2: performWithdraw(sc, account); break;
				case 3:	performMaturity(sc, account); break;
				case 4: System.out.println(account); break;
				case 5: System.out.println("Exit from Program scuccessfully!!!");System.exit(0);
			}
		}while(choice != 5);
	
		sc.close();
	}

	//Extracted Methods of Maturity Amount 
	private static void performMaturity(Scanner sc, Account account) {
		if (account instanceof DepositAccount da) {
		    System.out.println("Enter interest of rate");
		    double rate = sc.nextDouble();
		    double maturity = da.calculateMaturity(rate);
		    System.out.println("Maturity of Amount Deposited in Account is: " + maturity);
		    da.isAmountMatured();
		} else {
		    System.out.println("This account type doesn't support maturity calculation.");
		}
	}

	//Extracted Methods of Withdraw Amount
	private static void performWithdraw(Scanner sc, Account account) {
		System.out.println("Enter Amount to be Withdraw from the Account: ");
		double amount = sc.nextDouble();
		double draw = account.withdraw(amount);
		System.out.println("New Balance of account after Amount Withdrawn: " + draw);
	}

	// Extracted Methods of Deposit Amount
	private static void performDeposit(Scanner sc, Account account) {
		System.out.println("Enter Amount to be Deposited in to Account");
		double amount = sc.nextDouble();
		double newBalance = account.deposit(amount);
		System.out.println("New Balance of the Account After Deposit is: "+ newBalance);
	}

	//Extracted Account Creation Methods
	private static Account createAccount(Scanner sc) throws ParseException {
		System.out.println(" Create Your Account");
		System.out.println("\n***********************************\n");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Deposit Account");
		System.out.println("\n***********************************\n");
		System.out.println("Enter your Account as(savings/current/deposit)");
		String actype = sc.nextLine().toLowerCase();
		
		System.out.println("Enter Account Holder Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Minimum Balance");
		double balance = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the Date of Opening of New Account");
		String date = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate opendate = LocalDate.parse(date,formatter);
		
		switch(actype)
		{
		case "savings":
			return new SavingsAccount(name,balance,opendate);
		case "current":
			return new CurrentAccount(name,balance,opendate);
		case "deposit":

	        System.out.println("Enter the tenure of FD");
			int year = sc.nextInt();
			
			return new DepositAccount(name,balance,opendate,year);
		default:
			System.out.println("Invalid AccountType");
			return null;
		}
	}

}
