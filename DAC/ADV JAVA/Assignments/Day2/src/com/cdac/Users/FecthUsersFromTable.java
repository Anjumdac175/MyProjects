package com.cdac.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FecthUsersFromTable {

	public static void main(String[] args) {
		
		
		//Loading Drivers of mysql to connect through jdbc
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a JDBC connection to the database to access
			
			String url = "jdbc:mysql://localhost:3306/dac";
			String username = "root";
			String password = "Nishadanjum@625";
		
			Connection dbConnect = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Estalished Successfully");
			Statement smtSelect = dbConnect.createStatement();
			ResultSet rsQuery  = smtSelect.executeQuery("SELECT * FROM Users");
			while(rsQuery.next()) {
				String userName = rsQuery.getString("UserName");
				String pswd = rsQuery.getString("Password");
				String name = rsQuery.getString("Name");
				String mail = rsQuery.getString("Email");
				String city = rsQuery.getString("City");
				System.out.println("[User - UserName: "+userName+" Password: " +pswd+" Name: "+name+" Email: "+mail+" City: "+city+"]");
			}
			
			
			if(rsQuery != null) {
				rsQuery.close();
			}
			if(smtSelect != null) {
				smtSelect.close();
			}
			if(dbConnect != null) {
				dbConnect.close();
			}
			System.out.println("Query Executed Successfully and Connections Closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
