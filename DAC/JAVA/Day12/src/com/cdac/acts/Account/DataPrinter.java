package com.cdac.acts.Account;

import java.util.Iterator;
import java.util.List;



public class DataPrinter{

	public static void printData(List<Account> accounts) {
		Iterator<Account> itr = accounts.iterator();
		System.out.println("Account Details are: ");
		System.out.println("\n************************8\n");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
