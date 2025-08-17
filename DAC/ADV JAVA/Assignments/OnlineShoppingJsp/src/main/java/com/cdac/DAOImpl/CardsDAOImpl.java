package com.cdac.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cdac.DAO.CardsDAO;
import com.cdac.DBUtility.DBUtility;

public class CardsDAOImpl implements CardsDAO{
	Connection conn = DBUtility.getConnection();
	    public boolean validateCard(String cardNumber) {
	        try {
	        	PreparedStatement ps = conn.prepareStatement( "SELECT * FROM Cards WHERE card_number=?");
	            ps.setString(1, cardNumber);
	            ResultSet rs = ps.executeQuery();
	            return rs.next();
	        } catch (Exception e) { e.printStackTrace(); }
	        return false;
	    }

	    public boolean deductAmount(String cardNumber, double amount) {
	        try {
	            PreparedStatement ps = conn.prepareStatement(
	              "UPDATE Cards SET balance = balance - ? WHERE card_number=? AND balance >= ?");
	            ps.setDouble(1, amount);
	            ps.setString(2, cardNumber);
	            ps.setDouble(3, amount);
	            return ps.executeUpdate() == 1;
	        } catch (Exception e) { e.printStackTrace(); }
	        return false;
	    }
}
