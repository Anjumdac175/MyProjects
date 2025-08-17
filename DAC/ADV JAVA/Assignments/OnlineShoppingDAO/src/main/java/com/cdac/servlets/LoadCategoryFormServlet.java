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
 * Servlet implementation class LoadCategoryFormServlet
 */
@WebServlet("/LoadCategoryFormServlet")
public class LoadCategoryFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HttpSession session = request.getSession(false);
	        UserLogin user = (UserLogin) session.getAttribute("user");

	        if (user == null || !"admin".equalsIgnoreCase(user.getRole())) {
	            response.sendRedirect("index.html");
	            return;
	        }

	        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
	        Category category = null;
	        for (Category c : new CategoryImpl().getAllCategory()) {
	            if (c.getCategoryId().equals(categoryId)) {
	                category = c;
	                break;
	            }
	        }

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        if (category != null) {
	            out.println("<html><head><title>Update Category</title></head><body>");
	            out.println("<h2>Update Category</h2>");
	            out.println("<form method='post' action='UpdateCategoryServlet'>");
	            out.println("<input type='hidden' name='categoryId' value='" + category.getCategoryId() + "'/>");
	            out.println("Name: <input type='text' name='categoryName' value='" + category.getCategoryName() + "' required><br><br>");
	            out.println("Description: <input type='text' name='categoryDesc' value='" + category.getCategoryDesc() + "' required><br><br>");
	            out.println("Image URL: <input type='text' name='categoryImg' value='" + category.getCategoryImg() + "' required><br><br>");
	            out.println("<input type='submit' value='Update Category'>");
	            out.println("</form><br><a href='CategoryServlet'>Back</a></body></html>");
	        } else {
	            out.println("<h3>Category not found.</h3>");
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
