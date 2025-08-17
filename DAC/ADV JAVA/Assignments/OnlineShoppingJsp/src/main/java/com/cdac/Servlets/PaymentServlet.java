package com.cdac.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.cdac.DAO.CardsDAO;
import com.cdac.DAO.transactionDAO;
import com.cdac.DAOImpl.CardsDAOImpl;
import com.cdac.DAOImpl.transactionDAOImpl;
import com.cdac.Pojo.Cart;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String cardNumber = request.getParameter("cardNumber");

	        HttpSession session = request.getSession();
	        Cart cart = (Cart) session.getAttribute("cart");
	        double totalAmount = cart.getTotalCartAmount();

	        CardsDAO cardDAO = new CardsDAOImpl();
	        if (cardDAO.validateCard(cardNumber)) {
	            if (cardDAO.deductAmount(cardNumber, totalAmount)) {
	                // log transaction
	                transactionDAO tdao = new transactionDAOImpl();
	                tdao.saveTransaction((Integer) session.getAttribute("userId"), totalAmount);

	                session.setAttribute("cart", cart);
	                request.setAttribute("message", "Payment Successful!");
	            } else {
	                request.setAttribute("message", "Insufficient balance.");
	            }
	        } else {
	            request.setAttribute("message", "Invalid card details.");
	        }

	        request.getRequestDispatcher("paymentResult.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
