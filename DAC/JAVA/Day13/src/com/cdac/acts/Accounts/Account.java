package com.cdac.acts.Accounts;

import java.time.LocalDate;

import com.cdac.acts.Accounts.Exceptions.MinimumBalanceException;

public class Account {
	
	private Long accNO;
	private String accName;
	private LocalDate dateOfOpening;
	private Double balance;
	
	public Account() {
	}

	public Account(Long accNO, String accName, LocalDate dateOfOpening, Double balance) {
		this.accNO = accNO;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}

	public Long getAccNO() {
		return accNO;
	}

	public void setAccNO(Long accNO) {
		this.accNO = accNO;
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void Deposit(double amount){
		balance = balance+amount;
	}
	
	public void Withdraw(double amount) throws MinimumBalanceException {
		
		if(balance-amount < 1000){
			throw new MinimumBalanceException("Balance should be greater than 1000");
		}
		else {
			balance = balance-amount;
		}
	}

	public void calInterest() {
		balance = balance+balance *0.12;
	}
	
	@Override
	public String toString() {
		return "Account: \n"
				+ "accNO: " + accNO 
				+ "\naccName: " + accName
				+"\ndateOfOpening: " + dateOfOpening 
				+ "\nbalance: "+ balance + "\n";
	}
	
	

}
