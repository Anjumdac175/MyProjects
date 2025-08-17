package com.cdac.acts.Accounts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.security.auth.login.AccountNotFoundException;

import com.cdac.acts.Accounts.Exceptions.MinimumBalanceException;

public class AccountManager {

	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	static List<Account> accounts = new CopyOnWriteArrayList<>();
	
	//Menu item first one Add account method
	public void addAccount(Scanner sc){
		System.out.println("Enter Account Number: ");
		Long accno = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter Account Holder Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Date of Opening of the Account: ");
		String dop = sc.nextLine();
		LocalDate openDate = LocalDate.parse(dop,format);
		
		System.out.println("Enter Minimum Balance: ");
		Double balance = sc.nextDouble();
		sc.nextLine();
		
		accounts.add(new Account(accno,name,openDate,balance));
		System.out.println("Account Added Successfully!!................");
	}
	
	
	//menu item second one for display accounts
	public void displayAllAccounts() {
		System.out.println("\nAll Accounts Details are: ");
		for(Account acc: accounts){
			System.out.println(acc);
		}
	}
	
	//menu item third one to display details of account for the given accno
	public void displayDetailsByAccountNo(Scanner sc) {
		
		System.out.println("Enter the Account Number for which details to be shown");
		Long accnumber = sc.nextLong();
		 try {
			 Account accountno = searchAccount(accnumber);
			 System.out.println(accountno);
		 }catch(AccountNotFoundException e) {
			 System.out.println(e.getMessage());
		 }
	}
	
	public void fundTransfer(Scanner sc) throws AccountNotFoundException {
		System.out.println("Enter the Account number from which Amount to be Transfered: ");
		Long accnumber = sc.nextLong();
		
		System.out.println("Enter the Account Number to which Amount is to be Tranfered: ");
		Long accnumber1 = sc.nextLong();
		
		System.out.println("Enter Amount to be Transfered: ");
		Double transamount = sc.nextDouble();
		try {
			
			Account fromAcc = searchAccount(accnumber);
			Account toAcc = searchAccount(accnumber1);

			try{
				fromAcc.Withdraw(transamount);
				toAcc.Deposit(transamount);
				System.out.println("Amount Transfered Successfully..............");
			}catch(MinimumBalanceException e) {
				System.out.println(e.getMessage());
			}
		} catch(Exception e) {
			System.out.println("Amount Transfer Failed....................");
		}
		
	}
	
	//remove account from list
	public void removeAccount(Scanner sc)
	{
		System.out.println("Enter Account Number which is to be removed from the Account List:");
		Long accnumber = sc.nextLong();
		
		try {
			Account removeacc = searchAccount(accnumber);
			accounts.remove(removeacc);
			System.out.println("Account Removed Successfully");
			
		}catch(AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Apply interest to all Accounts
	public void applyInterest() {
		for(Account acc: accounts) {
			acc.calInterest();
			System.out.println("Interest is applied for All Accounts...........");
		}
	}
	
	//To show how ConcurrentModificationException will handle by CopyOnWriteArrayList
	public void checkConcurrentModificationSafeRemoval() {
		for(Account acc:accounts) {
			if(acc.getBalance() < 2000) {
				System.out.println("Removing Account: "+acc.getAccNO()+"With Account Balance is: "+acc.getBalance());
				System.out.println(acc);
			}
		}
	}
	
	private static Account searchAccount(Long accNo) throws AccountNotFoundException{
		
		for(Account acc:accounts) {
			if(acc.getAccNO().equals(accNo)) {
				return acc;
			}
		}
		throw new AccountNotFoundException("Given Account Number is not found");
	}
	
	public List<Account> getAllAccounts() {
		return accounts;
	}
}
