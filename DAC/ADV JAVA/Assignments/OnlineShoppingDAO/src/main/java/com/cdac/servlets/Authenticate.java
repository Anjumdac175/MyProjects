package com.cdac.servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.cdac.daoimpl.UserLoginImpl;
import com.cdac.pojos.UserLogin;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String paswd = request.getParameter("pswd");
		String role = request.getParameter("role");
		UserLogin user = new UserLoginImpl().Authentication(username, paswd, role);
		PrintWriter out = response.getWriter();
		
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			if(user.getRole().equalsIgnoreCase("Admin")) {
				response.sendRedirect("AdminDashboard.html");
			}else {
				response.sendRedirect("CategoryServlet");	
			}
		}else {
			
			response.setContentType("text/html");
			
			out.println("<h3 style='color:red;'>Invalid UserName/ Password</h3>");
			out.println("<a href='index.html'>Try Again..</a>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
