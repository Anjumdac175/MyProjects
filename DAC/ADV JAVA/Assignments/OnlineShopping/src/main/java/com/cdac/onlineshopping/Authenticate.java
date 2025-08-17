package com.cdac.onlineshopping;

import jakarta.servlet.ServletConfig;
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

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String UserName = request.getParameter("uname");
		String Password = request.getParameter("pswd");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost/dac";
		String username = "root";
		String password = "Nishadanjum@625";
		String sqlQuery = "SELECT UserName, Password FROM Users WHERE UserName=? AND Password=?";

		try (Connection dbconnect = DriverManager.getConnection(url, username, password);
				PreparedStatement psAuthenticator = dbconnect.prepareStatement(sqlQuery)) {
			psAuthenticator.setString(1, UserName);
			psAuthenticator.setString(2, Password);

			ResultSet rsAuthenticate = psAuthenticator.executeQuery();
			if (rsAuthenticate.next()) {
//				out.println("<font color='green'>Welcome to Online Shopping Website</font>");
				response.sendRedirect("Category");
			} else {
				out.println("<font color='red'>Invalid UserName/Password </font>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
