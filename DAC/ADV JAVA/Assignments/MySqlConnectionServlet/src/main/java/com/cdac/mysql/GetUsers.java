package com.cdac.mysql;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/GetUsers")
public class GetUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetUsers() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3310/cdac";
			String username = "root";
			String password = "cdac";
			String sqlQuery = "SELECT * FROM cdac_users";

			try (Connection dbconnect = DriverManager.getConnection(url, username, password);
					PreparedStatement ps = dbconnect.prepareStatement(sqlQuery)) {
				PrintWriter out = response.getWriter();
				ResultSet rs = ps.executeQuery();

				out.println("<table border ='1' >");
				while (rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3) + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
