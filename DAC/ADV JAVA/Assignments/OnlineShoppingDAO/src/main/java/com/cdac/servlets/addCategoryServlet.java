package com.cdac.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.cdac.daoimpl.CategoryImpl;
import com.cdac.pojos.Category;
import com.cdac.pojos.UserLogin;

/**
 * Servlet implementation class addCategoryServlet
 */
@WebServlet("/addCategoryServlet")
public class addCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		UserLogin user = (UserLogin) session.getAttribute("user");
		if(user == null || !user.getRole().equalsIgnoreCase("admin")) {
			response.sendRedirect("index.html");
			return;
		}
		
		String catname = request.getParameter("cname");
		String catDesc = request.getParameter("cdesc");
		String catimage = request.getParameter("cimage");
		
		Category category = new Category(null,catname,catDesc,catimage);
		boolean added = new CategoryImpl().addCategory(category);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(added ? "<h3>Category is added Successfully</h3>":"<h3>Failed while Adding</h3>");
		out.println("<h4><a href='AdminDashboard.html'>Admin Dashboard</a></h4>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
