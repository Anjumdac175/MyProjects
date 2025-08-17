package com.cdac.acts.Account.AccountInherit;


import java.time.LocalDate;
import java.time.Period;


public class DepositAccount extends Account {

	private int years;
	

	public DepositAccount() {
		super();
		this.years = 0;
		
	}


	public DepositAccount(String accountHolderName, double balance, LocalDate dop,int years) {
		super(accountHolderName, balance, dop);
		this.years = years;
	}


	@Override
	public double calculateMaturity(double rate) {
		double maturity = getBalance()+getBalance()*rate*years;
		return maturity;
	}

	public void isAmountMatured() {
		 LocalDate dop = getDop();
	        if (dop == null) {
	            System.out.println("Date of opening is not available.");
	            return;
	        }

		LocalDate today = LocalDate.now();
		Period age = Period.between(dop, today);
		//System.out.println("date of opening is:"+getDop());
		if(age.getYears() >= 5)
		{
			System.out.println("Your Amount is matured and You Can Withdraw your FD amount!!!! ");
		}
		else
		{
			System.out.println("Your Amount is not matured so You Cannot Withdraw your FD amount!!!! ");
		}
	}
}
