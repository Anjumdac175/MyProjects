package com.cdac.acts.Account.AccountInherit;

import java.time.LocalDate;

import com.cdac.acts.Account.AccountImp.Depositable;
import com.cdac.acts.Account.AccountImp.Maturable;
import com.cdac.acts.Account.AccountImp.Withdrawable;


public abstract class Account implements Depositable,Withdrawable,Maturable{

	private static long accno= 250240120175L;
	private long acno;
	private String accountHolderName;
	private double balance;
	private LocalDate dop;
	
	public Account() {
		
	}

	public Account(String accountHolderName, double balance,LocalDate dop) {
		this.acno = accno++;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.dop = dop;
	}

	public abstract double calculateMaturity(double rate); // abstract class
	
	public static long getAccno() {
		return accno;
	}

	public static void setAccno(long accno) {
		Account.accno = accno;
	}

	public long getAcno() {
		return acno;
	}

	public void setAcno(long acno) {
		this.acno = acno;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDop() {
		return dop;
	}

	public void setDop(LocalDate dop) {
		this.dop = dop;
	}

	@Override
	public double deposit(double amount) {
		if(amount>0)
		{
			balance = balance+amount;
		}
		return balance;
	}
	@Override
	public double withdraw(double amount) {
		
		if(amount>0 && balance >= amount)
		{
			balance = balance-amount;
			return balance;
		}
		else 
		{
			System.out.println("Insufficient Balance");
			return balance;
		}
		
		
	}

	@Override
	public String toString() {
		return "Account [Account Number: " + acno + ", accountHolderName: " + accountHolderName + ", balance: " + balance + ", Date of Opening: "
				+ dop + "]";
	}
	
}
