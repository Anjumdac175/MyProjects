package com.cdac.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserTable {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/dac";
		String username = "root";
		String password = "Nishadanjum@625";
		try(Connection dbconnect = DriverManager.getConnection(url, username, password)){
			
			String menu = "\n------USER MENU--------\n"+
							"\n1. Register a User" +
							"\n2. List All Users Based on City"+
							"\n3. Update Password of User"+
							"\n4. List All Users Based on UserName"+
							"\n5. List of All Users in Table"+
							"\n6. Exit from Program"+
							"\n------------------------------------\n";
						
			
			while(true) {
				
				System.out.println(menu);
		
				System.out.println("Enter your choice..\n");
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice) {
				case 1:
					registerUser(sc, dbconnect);
					break;
				case 2:
					searchByCity(sc, dbconnect);
					break;
				case 3:
					updatePassword(sc, dbconnect);
					break;
				case 4:
					searchByUserName(sc, dbconnect);
					break;
				case 5:
					allUsers(dbconnect);
					break;
				case 6:
					System.out.println("Exit from the Program..");
					System.exit(0);
				default:
					System.out.println("Invalid option....");
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		sc.close();
	}

	/**
	 * @param dbconnect
	 * @throws SQLException
	 */
	private static void allUsers(Connection dbconnect) throws SQLException {
		System.out.println("List of All Users in Table are: \n");
		String allUsers = "SELECT * FROM Users"; 
		try(PreparedStatement psUsers = dbconnect.prepareStatement(allUsers)){
			ResultSet rsUsers = psUsers.executeQuery();
			while(rsUsers.next()) {
				System.out.println("\nUserName: " + rsUsers.getString(1));
				System.out.println("\nPassword: " + rsUsers.getString(2));
				System.out.println("\nName: " + rsUsers.getString(3));
				System.out.println("\nEmail: " + rsUsers.getString(4));
				System.out.println("\nCity: " + rsUsers.getString(5));
				System.out.println("\n------------------------------------------");
			}
		}
	}

	/**
	 * @param sc
	 * @param dbconnect
	 * @throws SQLException
	 */
	private static void searchByUserName(Scanner sc, Connection dbconnect) throws SQLException {
		System.out.println("Enter the Username you want to search:");
		String uname = sc.nextLine();
		String searchUname = "SELECT * FROM Users WHERE UserName = ?";
		try(PreparedStatement searchuser = dbconnect.prepareStatement(searchUname)){
			searchuser.setString(1, uname);
			ResultSet rs = searchuser.executeQuery();
			boolean found = false;
				System.out.println("User found..\n");
				System.out.println("Details of "+uname+" are: \n");
				while(rs.next()) {
					found =  true;
					System.out.println("\nUserName: " + rs.getString(1));
					System.out.println("\nPassword: " + rs.getString(2));
					System.out.println("\nName: " + rs.getString(3));
					System.out.println("\nEmail: " + rs.getString(4));
					System.out.println("\nCity: " + rs.getString(5));
					System.out.println("\n------------------------------------------");
				}
				if(!found){
					System.out.println("User not Found...\n");
				}
			}
	}

	/**
	 * @param sc
	 * @param dbconnect
	 * @throws SQLException
	 */
	private static void updatePassword(Scanner sc, Connection dbconnect) throws SQLException {
		System.out.println("Enter the UserName for which you want to change the password: ");
		String uname = sc.nextLine();
					
		System.out.println("Enter the new Password: ");
		String changepswd = sc.nextLine();
		String updateQuery = "UPDATE Users SET Password = ? WHERE UserName= ? "; 
		try(PreparedStatement psupdate = dbconnect.prepareStatement(updateQuery)){
			
			psupdate.setString(1,changepswd);
			psupdate.setString(2, uname);
			
			int rows = psupdate.executeUpdate();
			if(rows >0) {
				System.out.println("Password Updated Successfully");
			}else {
				System.out.println("User not Found to Update");
			}
		}
	}

	/**
	 * @param sc
	 * @param dbconnect
	 * @throws SQLException
	 */
	private static void searchByCity(Scanner sc, Connection dbconnect) throws SQLException {
		System.out.println("Enter the city which you want search ?..");
		String searchCity = sc.nextLine();
		
		String selectcity = "SELECT * FROM Users WHERE City = ?";
		try(PreparedStatement pscity = dbconnect.prepareStatement(selectcity)){
			
			pscity.setString(1, searchCity);
			ResultSet rscity = pscity.executeQuery();
			boolean found = false;
				System.out.println("User Found\n");
				System.out.println("Users belongs to  " + searchCity+" are: \n");
				
					while(rscity.next()) {
					System.out.println("UserName: "	+ rscity.getString(1) +"\n");
					System.out.println("Password: "	+ rscity.getString(2) +"\n");
					System.out.println("Name: "	+ rscity.getString(3) +"\n");
					System.out.println("Email: "	+ rscity.getString(4) +"\n");
					System.out.println("City: "	+ rscity.getString(5) +"\n");
					System.out.println("\n------------------------------------------");
						
					}
				if(!found){
					System.out.println("User not Found...\n");
				}
			}
	}

	/**
	 * @param sc
	 * @param dbconnect
	 * @throws SQLException
	 */
	private static void registerUser(Scanner sc, Connection dbconnect) throws SQLException {
		System.out.println("\nEnter Username: ");
		String userName = sc.nextLine();
		System.out.println("\nEnter Password: ");
		String pswd = sc.nextLine();
		System.out.println("\nEnter Name: ");
		String name = sc.nextLine();
		System.out.println("\nEnter Email: ");
		String mail = sc.nextLine();
		System.out.println("\nEnter City: ");
		String city = sc.nextLine();
		
		String insertQuery = "INSERT INTO Users(UserName, Password, Name, Email, City) values(?,?,?,?,?)";
		try(PreparedStatement psinsert = dbconnect.prepareStatement(insertQuery)){
			psinsert.setString(1, userName);
			psinsert.setString(2, pswd);
			psinsert.setString(3, name);
			psinsert.setString(4, mail);
			psinsert.setString(5, city);
			psinsert.executeUpdate();

			System.out.println("User Registered");
		}
	}

}
