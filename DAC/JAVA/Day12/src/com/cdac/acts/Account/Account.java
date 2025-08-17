package com.cdac.acts.Account;

import java.time.LocalDate;

public class Account {

	private static Long accNo = 250240120175L;
	private Long acno;
	private String accName;
	private LocalDate dateofOpening;
	private Double balance;
	
	public Account() {
		
	}
	
	public Account(String accName,LocalDate dateofOpening,Double balance) throws InvalidDataException {
		this.acno = accNo++;
		this.accName = accName;
		this.dateofOpening = dateofOpening;
		this.balance = balance;
		
		if (dateofOpening.isAfter(LocalDate.now()))
		{
			throw new InvalidDataException("Date of Opening of Account should not be in the Future");
		}

		if(balance<1000)
		{
			throw new InvalidDataException("Amount Should not be less than 1000");
		}
	}

	public static Long getAccNo() {
		return accNo;
	}

	public static void setAccNo(Long accNo) {
		Account.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public LocalDate getDateofOpening() {
		return dateofOpening;
	}
	
	public void setDateofOpening(LocalDate dateofOpening) {
		this.dateofOpening = dateofOpening;
	}
	
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getAcno() {
		return acno;
	}

	public void setAcno(Long acno) {
		this.acno = acno;
	}
	
	public String toString() {
		return "Account: \n" + "Account No: "+acno
				+"\nAccount Holder Name: "+accName
				+"\nDate of Opening Account: "+dateofOpening
				+"\nAccount Balance: "+balance+"\n";
	}
}
