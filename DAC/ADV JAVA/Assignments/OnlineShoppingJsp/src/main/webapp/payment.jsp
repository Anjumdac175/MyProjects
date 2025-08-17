<%@page import="com.cdac.Pojo.Cart"%>
<%@page import="com.cdac.Pojo.UserLogin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
	crossorigin="anonymous"></script>
</head>
<body>

<%
UserLogin user = (UserLogin) session.getAttribute("user");
Cart cart = (Cart) session.getAttribute("cart");

if (user == null || cart == null || cart.allItems().isEmpty()) {
	response.sendRedirect("Login.jsp");
	return;
}
%>

<div class="container mt-5">
	<div class="row justify-content-center">
		<div class="col-md-6">
			<div class="card shadow">
				<div class="card-header bg-dark text-white text-center">
					<h4>Payment Details</h4>
				</div>
				<div class="card-body">
					<form action="PaymentServlet" method="post">
						<div class="mb-3">
							<label for="cardNumber" class="form-label">Card Number</label>
							<input type="text" class="form-control" id="cardNumber" name="cardNumber" required>
						</div>
						<div class="mb-3">
							<label for="cardHolder" class="form-label">Card Holder Name</label>
							<input type="text" class="form-control" id="cardHolder" name="cardHolder" required>
						</div>
						<div class="mb-3 row">
							<div class="col">
								<label for="expiryDate" class="form-label">Expiry Date (MM/YY)</label>
								<input type="text" class="form-control" id="expiryDate" name="expiryDate" required>
							</div>
						</div>

						<div class="mb-4 text-end">
							<h5>Total Amount: ₹ <%=cart.getTotalCartAmount() %></h5>
						</div>

						<div class="d-grid">
							<button type="submit" class="btn btn-success">Make Payment</button>
						</div>
					</form>
				</div>
				<div class="card-footer text-center">
					<a href="viewCart.jsp" class="btn btn-outline-secondary">Back to Cart</a>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>
