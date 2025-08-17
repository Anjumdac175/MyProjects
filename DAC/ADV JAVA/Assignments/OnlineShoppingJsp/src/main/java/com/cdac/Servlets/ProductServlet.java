package com.cdac.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.cdac.DAO.ProductDAO;
import com.cdac.DAOImpl.ProductDAOImpl;
import com.cdac.Pojo.Product;

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
		
		String catId = request.getParameter("categoryId");
		if(catId != null && !catId.isEmpty()) {
			try {
				int catID = Integer.parseInt(catId);
				ProductDAO dao = new ProductDAOImpl();
				List<Product> productList = dao.getProductsByCategoryId(catID);
				request.setAttribute("products", productList);
				request.getRequestDispatcher("Product.jsp").forward(request, response);
			}catch(NumberFormatException e) {
				response.getWriter().println("Invalid CategoryID");
				
			}
		}else {
			response.sendRedirect("CategoryServlet");
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
