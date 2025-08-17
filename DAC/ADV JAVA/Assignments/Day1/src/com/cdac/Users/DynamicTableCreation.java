package com.cdac.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicTableCreation {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/dac";
		String username = "root";
		String password = "Nishadanjum@625";
		
		try(Scanner sc = new Scanner(System.in);
			Connection dbconnect = DriverManager.getConnection(url,username,password);
				Statement stmcreate = dbconnect.createStatement()){
			System.out.println("Enter New Table Name:\n");
			String tablename = sc.nextLine();
			
			System.out.println("Enter the No of Columns need to be Added\n");
			int columnsize = sc.nextInt();
			sc.nextLine();
			
			List<String> columns = new ArrayList<>();
			List<String> primaryKeys = new ArrayList<>();
			
			for(int i = 1; i <= columnsize; i++) {
				System.out.println("Enter Column Name: ");
				String columnName = sc.nextLine();
				
				System.out.println("Enter Datatype from INT, VARCHAR(100),FLOAT");
				String datatype = sc.nextLine();
				
				System.out.println("Add primary Key (yes/no) ?..");
				String pk = sc.nextLine();
				
				columns.add(columnName + " " + datatype);
				if(pk.equalsIgnoreCase("yes")) {
					primaryKeys.add(columnName);
				}
			}
			
			StringBuilder sb = new StringBuilder("CREATE TABLE ");
			sb.append(tablename+" (");
			
			for(int i = 0; i < columns.size(); i++) {
				sb.append(columns.get(i));
				if(i<columns.size() - 1) {
					sb.append(",");
				}
			}
			
			//for Primary key adding at end
			if(!primaryKeys.isEmpty()) {
				sb.append(", PRIMARY KEY (");
				for(int i = 0; i < primaryKeys.size(); i++) {
					sb.append(primaryKeys.get(i));
					if(i < primaryKeys.size() - 1) {
						sb.append(",");
					}
				}
				sb.append(")"); // this primary keys closing brace
			}
			
			sb.append(")"); // this create tables closing brace;
			
			System.out.println("Table: " + sb.toString());
			
			stmcreate.executeUpdate(sb.toString());
			System.out.println("Table Create Successfully");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
