<%@page import="java.util.List"%>
<%@page import="com.cdac.Pojo.Product"%>
<%@page import="com.cdac.Pojo.UserLogin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
	crossorigin="anonymous"></script>
<title>Products List</title>
</head>
<body>

	<%
	UserLogin user = (UserLogin) session.getAttribute("user");
	if (user == null) {
		response.sendRedirect("Login.jsp");
		return;
	}
	%>

	<div class="container mt-5">
		<div
			class="d-flex justify-content-between align-items-center mt-4 border-bottom">
			<h3>
				Welcome
				<%=user.getUsername()%>!
			</h3>
			<form action="LogoutServlet" method="post">
				<button type="submit" class="btn btn-danger">Logout</button>
			</form>
		</div>
		<div class="row justify-content-center p-3">
			<div class="col-8">
				<div class="card shadow text-center bg-light">
					<div class="card-header text-light bg-dark">
						<h3>Products List</h3>
						<%
						List<Product> products = (List<Product>) request.getAttribute("products");
						if (products != null && !products.isEmpty()) {
						%>
					</div>
					<div class="card-body">
						<table class="table table-stripped">
							<thead class="table-secondary">
								<tr>
									<td>Product Name</td>
									<td>Product Description</td>
									<td>Product Image</td>
									<td>Price</td>
									<td>Add to Cart</td>
								</tr>
							</thead>
							<tbody>
								<%
								for (Product p : products) {
								%>
								<tr>
									<td><%=p.getProductName()%></td>
									<td><%=p.getProductDes()%></td>
									<td><img src="<%=p.getProductimg()%>" width="100"
										height="80" class="rounded shadow-sm" /></td>
									<td><%=p.getPrice()%></td>
									<td>
										<form action="AddToCartServlet" method="post"
											class="d-flex align-items-center gap-2">
											<input type="hidden" name="productId"
												value="<%=p.getProductId()%>" /> <input type="number"
												class="form-control form-control-sm" name="quantity"
												value="1" min="1" style="width: 60px" required />
											<button type="submit" class="btn btn-warning shadow">Add
												to Cart</button>
										</form>
									</td>
								<%
								}
								%>
							</tbody>
						</table>
						<%
						} else {
						%>
						<div class="alert alert-warning">No product found in this
							Category</div>
						<% } %>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>