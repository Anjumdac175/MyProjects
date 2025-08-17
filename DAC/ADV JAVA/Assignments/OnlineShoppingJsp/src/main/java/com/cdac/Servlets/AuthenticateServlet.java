package com.cdac.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.cdac.DAOImpl.AuthenticateDAOImpl;
import com.cdac.Pojo.UserLogin;

/**
 * Servlet implementation class AuthenticateServlet
 */
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pswd");
		
		UserLogin user = new AuthenticateDAOImpl().authenticate(username, password);
		
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("CategoryServlet");
		}else {
			response.getWriter().println("Invalid Login Credentials");
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
