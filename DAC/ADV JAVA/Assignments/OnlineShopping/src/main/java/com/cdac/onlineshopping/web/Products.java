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
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private Connection dbconnect;
      private ResultSet rsProducts;
      
      @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/dac";
			String username = "root";
			String password = "Nishadanjum@625";
			
			dbconnect = DriverManager.getConnection(url,username, password);
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
		out.println("<table border='1'");
		out.println("<tr>");
		out.println("<th>Product Name</th>");
		out.println("<th>Product Descriprion</th>");
		out.println("<th>Product Image</th>");
		out.println("</tr>");
		
		String sqlQuery = "SELECT * FROM  Products where categoryId=?";
		try(PreparedStatement psProducts = dbconnect.prepareStatement(sqlQuery)){
			
			String tempId = request.getParameter("categoryId");
			int categoryId = Integer.parseInt(tempId);
			psProducts.setInt(1, categoryId);
			
			rsProducts = psProducts.executeQuery();
			
			while(rsProducts.next()) {
				out.println("<tr>");
				out.println("<td>"+rsProducts.getString(1)+"</td>");
				out.println("<td>"+rsProducts.getString(2)+"</td>");
				out.println("<td><img src='Images/" + rsProducts.getString(3) + "' height='60px' width='60px'/></td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
		} catch (SQLException e) {
			e.printStackTrace();
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
		
		try {
			if(rsProducts != null) {
				rsProducts.close();
			}
			if(dbconnect != null) {
				dbconnect.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
