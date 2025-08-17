package com.cdac.mypack;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = -6490618027215121324L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello from Servlet</h1>");
	}
}