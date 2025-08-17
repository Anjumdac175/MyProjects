package com.cdac.acts.Account;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.Account.AccountImp.AccountManagable;

public class AccountManager implements AccountManagable{
	List<Account> accounts = new ArrayList<>();
	
	@Override
	public void addAccount(Scanner sc){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			System.out.println("\nEnter the Name of the Account Holder");
			String name = sc.nextLine();
			System.out.println("\nEnter the Date of Opening of Account");
			String dop = sc.nextLine();
			LocalDate opendate = LocalDate.parse(dop, format);
			System.out.println("\nEnter the Minimum Balance of Account");
			Double balance = sc.nextDouble();
			sc.nextLine();
			accounts.add(new Account(name,opendate,balance));
			
		}catch(InvalidDataException e) {
			System.out.println("Error!!!"+ e.getMessage());
		}
	}
	

	@Override
	public void displayAccounts() {
		DataPrinter.printData(accounts);
		
	}

	@Override
	public void Deposit(Scanner sc) {
		
		System.out.println("Enter the Account number you want to Deposit Amount");
		Long acno = sc.nextLong();
		System.out.println("Enter the Amount to be Deposited");
		Double bal = sc.nextDouble();
		boolean found = false;
		for(Account ac: accounts) {
			if(ac.getAcno().equals(acno))
			{
				found = true;
				if(bal>0)
				{
					ac.setBalance(ac.getBalance()+bal);
					System.out.println("New Balance After Amount Depoisted is: " + ac.getBalance());
				}
				else
				{
					System.out.println("Deposit amount should not be Zero!!!");
				}
				break;
			}
		}
		if(!found) {
			System.out.println("Account Not Found");
		}
	}

	@Override
	public void Withdraw(Scanner sc) {
		System.out.println("Enter the Account no from which you want to be withdraw amount");
		Long acno = sc.nextLong();
		System.out.println("Enter the Amount to be Withdraw");
		Double bal = sc.nextDouble();
		boolean found = false;
		for(Account ac: accounts) {
			if(ac.getAcno().equals(acno)) 
			{
				found = true;
				if(bal>0 && ac.getBalance()>bal)
				{
					ac.setBalance(ac.getBalance()-bal);
					System.out.println("New Balance After Withdraw Amount is: "+ac.getBalance());
				}
				else {
					System.out.println("Withdraw amount should be greater than Balance Amount!!!!");
				}
				break;
			}
		}
		if(!found) {
			System.out.println("Account Not Found");
		}
		
	}

	@Override
	public void sortByAccountNoDesc() {
		accounts.sort((ac1,ac2) -> Long.compare(ac2.getAcno(),ac1.getAcno()));
		System.out.println("Sorted Array by Account Number by Descending Order...");
		
	}

	@Override
	public void sortByAccountBalanceDesc() {
		accounts.sort((ac1,ac2) -> Double.compare(ac2.getBalance(),ac1.getBalance()));
		System.out.println("Sorted Array by Account Balance by Descending Order.......");
		
	}

	
	public List<Account> getAccounts() {
	    return accounts;
	}

}
