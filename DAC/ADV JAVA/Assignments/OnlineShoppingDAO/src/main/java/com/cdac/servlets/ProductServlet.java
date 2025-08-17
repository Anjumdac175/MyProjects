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

import com.cdac.daoimpl.ProductImpl;
import com.cdac.pojos.Product;
import com.cdac.pojos.UserLogin;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
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
			
		PrintWriter out = response.getWriter();
		out.println("<html><body><head><title>Products</title></head><body>");
		
		out.println("<div style='text-align:right;color=green'>");
		out.println("Logged as <b>" +  user.getUsername() + "</b> |<a href='LogoutServlet'>Logout</a>");
		out.println("</div><hr>");
		
		
		out.println("<table border='1'><tr><th>Product Name</th><th>Product Description</th><th>Product Image Url</th><th>Price</th>");
		
		Integer catId =Integer.parseInt(request.getParameter("categoryId"));
		List<Product> list = new ProductImpl().getByCategoryId(catId);
		for(Product p : list) {
			out.println(String.format("<tr><td>%s</td><td>%s</td><td><img src='%s' width='100' height='100'/></td><td>%.2f</td></tr>", 
					p.getProductName(), p.getProductDes(), p.getProductimg(), p.getPrice()));
		}
		out.println("</table></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
