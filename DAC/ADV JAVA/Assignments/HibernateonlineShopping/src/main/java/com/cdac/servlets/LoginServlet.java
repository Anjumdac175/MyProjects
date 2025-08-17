package com.cdac.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.cdac.dao.UserDAO;
import com.cdac.daoimpl.UserDAOImpl;
import com.cdac.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     UserDAO userdao = new UserDAOImpl();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pswd");
		
		User user = userdao.GetUser(username, password);
		if(user !=null) {
			HttpSession session = request.getSession();
			session.setAttribute("name",user.getName());
		
			if("admin".equalsIgnoreCase(user.getRole())) {
				response.sendRedirect("AdminDashboard.jsp");
			}else {
				response.sendRedirect("UserDashboard.jsp");
			}
		}else {
			request.setAttribute("Error:", "Invalid UserName and Password");
			request.getRequestDispatcher("jsppages/Login.jsp").forward(request, response);
		}
	}

}
