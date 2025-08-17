package com.cdac.Users;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchColumnsOfTable {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/dac";
		String username = "root";
		String password = "Nishadanjum@625";
		
		try(Scanner sc = new Scanner(System.in);
				Connection dbconnect = DriverManager.getConnection(url,username, password)){
			System.out.println("Enter Table Name: ");
			String tablename = sc.nextLine();
			
			String describetable = "DESCRIBE " + tablename;
			try(PreparedStatement columns = dbconnect.prepareStatement(describetable)){
				ResultSet rs = columns.executeQuery();
				boolean found = false;
				int i = 1;
				System.out.println("Columns in "+tablename+ " are : \n");
				while(rs.next()) {
					String cname = rs.getString("Field");
					System.out.println(i + "-" + cname);
					found = true;
					i++;
				}
				if(!found) {
					System.out.println("Table does not exists or table columns are not yet created: ");
				}
			}
			
			usingDatabaseMetaData(sc, dbconnect);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param sc
	 * @param dbconnect
	 * @throws SQLException
	 */
	private static void usingDatabaseMetaData(Scanner sc, Connection dbconnect) throws SQLException {
		System.out.println("Enter Table Name: ");
		String tablename = sc.nextLine();
		
		DatabaseMetaData columnnames = dbconnect.getMetaData();
		ResultSet rs = columnnames.getColumns(null, null, tablename, null);
		
		boolean found = false;
		int i = 1;
		System.out.println("Columns in "+tablename+ " are : \n");
		while(rs.next()) {
			String cname = rs.getString("COLUMN_NAME");
			System.out.println(i + "-" + cname);
			found = true;
			i++;
		}
		if(!found) {
			System.out.println("Table does not exists or table columns are not yet created: ");
		}
	}

}
