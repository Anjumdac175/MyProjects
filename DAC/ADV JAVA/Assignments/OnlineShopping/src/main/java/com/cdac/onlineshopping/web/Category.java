package com.cdac.onlineshopping.web;

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
 * Servlet implementation class Category
 */
@WebServlet("/Category")
public class Category extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection dbconnect;
    
    @Override
  public void init(ServletConfig config) throws ServletException {
  	super.init(config);
  	
  	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/dac";
			String username = "root";
			String password = "Nishadanjum@625";
//			
			
			dbconnect = DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new ServletException("Database Not connected",e);	
		}
  	
  }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>CategoryId</th>");
		out.println("<th>CategoryName</th>");
		out.println("<th>CategoryDescription</th>");
		out.println("<th>Image</th>");
		
		String sqlQuery = "SELECT * FROM Category";
		
		try(PreparedStatement psCategory = dbconnect.prepareStatement(sqlQuery);
				ResultSet rsCategory = psCategory.executeQuery()){
			
				while(rsCategory.next()) {
				out.println("<tr>");
				out.println("<td><a href='Products?categoryId=" + rsCategory.getInt("categoryId") + "'>" + rsCategory.getInt("categoryId") + "</a></td>");
				out.println("<td>"+ rsCategory.getString(2) +"</td>");
				out.println("<td>"+ rsCategory.getString(3) +"</td>");
				out.println("<td><img src='Images/" + rsCategory.getString(4) + "' height='60px' width='60px'/></td>");
				out.println("<tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ServletException("Database Not connected",e);	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void destroy() {
		if(dbconnect != null) {
			try {
				dbconnect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
