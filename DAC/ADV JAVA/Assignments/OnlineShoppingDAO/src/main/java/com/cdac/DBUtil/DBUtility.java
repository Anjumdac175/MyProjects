package com.cdac.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
public static Connection getConnection() {
		Connection conn=null;
		String url = "jdbc:mysql://localhost/dac";
		String username = "root";
		String password = "Nishadanjum@625";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			
			System.out.println("Connection established successfully");
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}

}
