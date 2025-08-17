package com.cdac.acts.Account.AccountImp;

import java.util.Scanner;

public interface AccountManagable {

	void addAccount(Scanner sc);
	void displayAccounts();
	void Deposit(Scanner sc);
	void Withdraw(Scanner sc);
	void sortByAccountNoDesc();
	void sortByAccountBalanceDesc();
	
}
