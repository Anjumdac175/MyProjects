package com.cdac.acts.Account.AccountInherit;

import java.time.LocalDate;



public class CurrentAccount extends Account {


	public CurrentAccount(String accountHolderName, double balance, LocalDate dop) {
		super(accountHolderName, balance, dop);

	}

	@Override
	public double calculateMaturity(double rate) {
		double interest = getBalance();// current account don't have maturity
		return interest;
	}

	
}
