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
 * Servlet implementation class UpdateCategoryServlet
 */
@WebServlet("/UpdateCategoryServlet")
public class UpdateCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession(false);
	        UserLogin user = (UserLogin) session.getAttribute("user");
	        if (user == null || !"admin".equalsIgnoreCase(user.getRole())) {
	            response.sendRedirect("index.html");
	            return;
	        }

	        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
	        String name = request.getParameter("categoryName");
	        String desc = request.getParameter("categoryDesc");
	        String img = request.getParameter("categoryImg");

	        Category category = new Category(categoryId, name, desc, img);
	        boolean success = new CategoryImpl().updateCategory(category);

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<!DOCTYPE html><html><head><title>Update Status</title>");
	        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
	        out.println("</head><body class='bg-light'><div class='container mt-5'>");

	        if (success) {
	            out.println("<div class='alert alert-success'>Category updated successfully.</div>");
	        } else {
	            out.println("<div class='alert alert-danger'>Failed to update category.</div>");
	        }

	        out.println("<a href='CategoryServlet' class='btn btn-primary'>Back to Categories</a>");
	        out.println("</div></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
