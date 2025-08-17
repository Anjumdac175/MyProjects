package com.cdac.servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.cdac.daoimpl.CategoryImpl;
import com.cdac.pojos.Category;
import com.cdac.pojos.UserLogin;


/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("user") == null) {
			response.sendRedirect("index.html");
			return;
		}
		
		UserLogin user = (UserLogin) session.getAttribute("user");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><head><title> Product Categories</title></head><body>");
		out.println("<div style='text-align:right; color:green'>");
		out.println("Logged as: <b>"+ user.getUsername() +"</b> | <a href='LogoutServlet'>Logout</a>");
		out.println("</div><hr>");
		out.println("<table border='1'><tr>"
				+ "<td>Category Name</td>"
				+ "<td>Category Description</td>"
				+ "<td>Category ImageUrl</td></tr>");
		List<Category> list = new CategoryImpl().getAllCategory();
		for(Category c : list) {
			out.println(String.format("<tr><td><a href='ProductServlet?categoryId=%d' style='text-decoration:none; color:inherit;'>%s</a></td><td>%s</td><td><img src='%s' width='100' height='100'/></td>", 
					c.getCategoryId(),c.getCategoryName(),c.getCategoryDesc(), c.getCategoryImg()));
			
			 // Only show edit link to admin
		    if ("admin".equalsIgnoreCase(user.getRole())) {
		        out.printf("<td><a href='LoadCategoryFormServlet?categoryId=%d'>Edit</a></td>", c.getCategoryId());
		    }
		}
		
		out.println("</tr></table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
