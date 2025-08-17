package com.cdac.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnection {

	public static void main(String[] args) {
		
		Connection dbconnect = null;
		String url = "jdbc:mysql://localhost:3306/dac";
		String username = "root";
		String password = "Nishadanjum@625";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbconnect = DriverManager.getConnection(url,username,password);
			
			System.out.println("Connected Successfully");
			
			Statement stmselect = dbconnect.createStatement();
			ResultSet rs = stmselect.executeQuery("SELECT * FROM User");
			
			while(rs.next()) {
				int id = rs.getInt("Id");
				String uname = rs.getString("UserName");
				String pswd = rs.getString("Password");
				String name = rs.getString("Name");
				String email = rs.getString("Email");
				String city = rs.getString("City");
				System.out.println("[ Id: " +id + " ,UserName: " + uname +
						" ,Password: " + pswd + " ,Name: " + name + " ,Email: " + email + " ,City: " + city + "]");
			}
			
			rs.close();
			stmselect.close();
			dbconnect.close();
			System.out.println("Query Executed successfully and closed");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
