package com.cdac.acts.Account.AccountComparators;

import java.util.Comparator;

import com.cdac.acts.Account.Account;

public class sortByNameComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		
		return o1.getAccName().compareTo(o2.getAccName()) ;
	}

}
