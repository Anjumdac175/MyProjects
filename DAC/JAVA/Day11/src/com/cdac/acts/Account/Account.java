package com.cdac.acts.Account;

import java.time.LocalDate;

import com.cdac.acts.Account.AccountImp.Depositable;
import com.cdac.acts.Account.AccountImp.Withdrawable;

public class Account implements Depositable,Withdrawable {

	private static long accno =250240120175L;
	private long acno;
	private String accName;
	private LocalDate dateOfOpening;
	private double balance;
	
	
	public Account() {
	}


	public Account(String accName, LocalDate dateOfOpening, double balance) {
		this.acno = accno++;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
		
		if(balance<=1000)
		{
			throw new IllegalArgumentException("Balance must be more than 1000");
		}
	}


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


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}


	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
 

	@Override
	public double withdraw(double amount){
		
		if(amount>0 && balance>amount)
		{
			balance = balance-amount;
		}
		return balance;
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
	public String toString() {
		return "Account [acno: " + acno + ", accName: " + accName + ", dateOfOpening: " + dateOfOpening + ", balance: "
				+ balance + "]";
	}
	
	
}
