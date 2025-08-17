package com.cdac.DAO;

public interface CardsDAO {
	    boolean validateCard(String cardNumber);
	    boolean deductAmount(String cardNumber, double amount);
}
