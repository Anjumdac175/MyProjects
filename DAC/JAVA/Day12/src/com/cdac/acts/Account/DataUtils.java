package com.cdac.acts.Account;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {

	public static List<Account> getAccountsList() throws InvalidDataException {
		List<Account> accounts = new ArrayList<>();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate opendate = LocalDate.parse("21-05-2019", format);
		LocalDate opendate1 = LocalDate.parse("01-04-2020", format);
		LocalDate opendate2 = LocalDate.parse("12-07-2021", format);
		LocalDate opendate3 = LocalDate.parse("16-08-2022", format);
		LocalDate opendate4 = LocalDate.parse("25-11-2023", format);
		accounts.add(new Account("Anjum",opendate,25000.00));
		accounts.add(new Account("Shreya",opendate1,30000.00));
		accounts.add(new Account("Ankita",opendate2,32000.00));
		accounts.add(new Account("Pranjal",opendate3,22000.00));
		accounts.add(new Account("Nupur",opendate4,15000.00));
		
		return accounts;
	}
}
