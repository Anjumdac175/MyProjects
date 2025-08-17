package com.cdac.acts.Account.AccountInherit;
import java.time.LocalDate;



public class SavingsAccount extends Account{

	public SavingsAccount(String accountHolderName, double balance, LocalDate dop) {
		super(accountHolderName, balance, dop);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateMaturity(double rate) {
		
		double maturity = getBalance()+(getBalance()*rate*1);
		
		return maturity;
	}

}
