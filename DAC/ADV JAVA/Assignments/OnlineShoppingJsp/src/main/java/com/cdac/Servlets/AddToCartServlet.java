package com.cdac.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.cdac.DAO.ProductDAO;
import com.cdac.DAOImpl.ProductDAOImpl;
import com.cdac.Pojo.Cart;
import com.cdac.Pojo.Product;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String productIdStr = request.getParameter("productId");
		String quantityStr = request.getParameter("quantity");
		
//		System.out.println("productId: " + request.getParameter("productId"));
//		System.out.println("quantity: " + request.getParameter("quantity"));


//		// ✅ Defensive check to prevent NumberFormatException
//		if (productIdStr == null || quantityStr == null) {
//			response.sendRedirect("error.jsp"); // or redirect back with error message
//			return;
//		}

		try {
			int productId = Integer.parseInt(productIdStr);
			int quantity = Integer.parseInt(quantityStr);

			ProductDAO productDao = new ProductDAOImpl();
			Product product = productDao.getProductById(productId);

			if (product == null) {
				response.sendRedirect("error.jsp"); // or return with product not found
				return;
			}

			HttpSession session = request.getSession();
			Cart cart = (Cart) session.getAttribute("cart");

			if (cart == null) {
				cart = new Cart();
			}

			cart.addItems(product, quantity);
			session.setAttribute("cart", cart);

			response.sendRedirect("ViewCart.jsp"); 

		} catch (NumberFormatException e) {
			response.getWriter().println("Missing parameters or invalid input.");

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
