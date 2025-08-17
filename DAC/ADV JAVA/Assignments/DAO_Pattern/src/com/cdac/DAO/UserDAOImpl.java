package com.cdac.DAO;

//import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserDAOImpl implements UserDAO {
	
	private Connection getConnection() {
		
		Connection dbconnect = null;
		try {
				Properties props = new Properties();
//				FileInputStream FIS = new FileInputStream("C:/Users/MAHAMMADSuhail SHAIk/WBJ/DAO_Pattern/src/database.properties");
//				props.load(FIS);
				 InputStream input = getClass().getClassLoader().getResourceAsStream("database.properties");

			        if (input == null) {
			            throw new RuntimeException("database.properties not found in classpath");
			        }
			        
			        props.load(input);
				
				String url = props.getProperty("database.url");
				String username = props.getProperty("database.username");
				String password = props.getProperty("database.password");
				
				dbconnect = DriverManager.getConnection(url,username,password);
				
		}catch (Exception e) {
	        e.printStackTrace();
	      }
		
		return dbconnect;
	}

	@Override
	public List<Users> getAllUsers() {
		
		List<Users> userList = new ArrayList<>();
		
		try(Connection dbconnect = getConnection();
				Statement stSelect = dbconnect.createStatement();
				ResultSet rs = stSelect.executeQuery("SELECT * FROM Users")){
			
			while(rs.next()) {
				Users user = new Users(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				userList.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userList;
	}

}
