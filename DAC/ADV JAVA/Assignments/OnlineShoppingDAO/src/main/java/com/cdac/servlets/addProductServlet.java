package com.cdac.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.cdac.daoimpl.ProductImpl;
import com.cdac.pojos.Product;
import com.cdac.pojos.UserLogin;

/**
 * Servlet implementation class addProductServlet
 */
@WebServlet("/addProductServlet")
public class addProductServlet extends HttpServlet {
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
		
		String pdtname = request.getParameter("pname");
		String pdtdesc = request.getParameter("pdesc");
		String pdtimage = request.getParameter("pimage");
		Double pdtprice = Double.parseDouble(request.getParameter("price"));
		Integer pdtCategoryId = Integer.parseInt(request.getParameter("catId"));
		
		Product product = new Product(pdtname, pdtdesc, pdtimage,pdtprice,pdtCategoryId);
		boolean added = new ProductImpl().addProduct(product);
		
		PrintWriter out = response.getWriter();
		out.println(added?"<h3>Products are added into the card successfully</h3>":"<h3>Failed to add products</h3>");
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
