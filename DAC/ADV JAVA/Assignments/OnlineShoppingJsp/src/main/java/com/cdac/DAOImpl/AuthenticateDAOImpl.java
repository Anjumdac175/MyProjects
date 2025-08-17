package com.cdac.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cdac.DAO.UserDAO;
import com.cdac.DBUtility.DBUtility;
import com.cdac.Pojo.UserLogin;

public class AuthenticateDAOImpl implements UserDAO {

	@Override
	public UserLogin authenticate(String username, String password) {
		
		try(Connection dbconnect = DBUtility.getConnection();
				PreparedStatement psAuthenticate =  dbconnect.prepareStatement("SELECT username, password FROM customers WHERE username=? AND password=?")){
					
				psAuthenticate.setString(1, username);
				psAuthenticate.setString(2, password);
				
				ResultSet rsAuthenticate = psAuthenticate.executeQuery();
				
				if(rsAuthenticate.next()) {
					return new UserLogin(rsAuthenticate.getString("username"), rsAuthenticate.getString("password"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return null;
	}

}
