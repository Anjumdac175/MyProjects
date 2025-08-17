package com.cdac.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cdac.DBUtil.DBUtility;
import com.cdac.dao.LoginDAO;
import com.cdac.pojos.UserLogin;

public class UserLoginImpl implements LoginDAO {

	@Override
	public UserLogin Authentication(String username, String password, String role) {
		try(Connection dbconnect = DBUtility.getConnection();
			PreparedStatement psLogin = dbconnect.prepareStatement("SELECT * FROM customers WHERE username=? AND password=? AND role=?")){
			
			psLogin.setString(1, username);
			psLogin.setString(2, password);
			psLogin.setString(3, role);
			ResultSet rsLogin = psLogin.executeQuery();
			if(rsLogin.next()) {
				return new UserLogin(rsLogin.getString("username"),rsLogin.getString("password"), rsLogin.getString("role"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}
