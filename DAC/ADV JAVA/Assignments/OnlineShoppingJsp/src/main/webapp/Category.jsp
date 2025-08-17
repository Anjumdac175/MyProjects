<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="com.cdac.Pojo.UserLogin" 
    import="com.cdac.Pojo.Category" 
    import="java.util.List" 
    session="true" %>
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
	<title>Products Category</title>
</head>
<body>
	<%
		UserLogin user = (UserLogin) session.getAttribute("user");
	if(user == null){
		response.sendRedirect("Login.jsp");
		return;
	}
	%>
	
	<div class="container mt-5">
	<!-- Header for Session username and Logout -->
	<div class="d-flex justify-content-between allign-items-center mb-4 border-bottom">
		<h3>Welcome, <%= user.getUsername() %>!</h3>
		<form action="LogoutServlet" method="post">
			<button type="submit" class="btn btn-danger">Logout</button>
		</form>
	</div>
	<!-- Displaying Category List -->
		<div class="row justify-content-center">
			<div class="col-6">
				<div class="card shadow text-center bg-light">
					<div class="card-header text-light bg-dark">
						<h3>Category List</h3>
					</div>
					<div class="card-body">
						<table class="table table-stripped">
						<thead class="table-secondary">
							<tr>
								<th>Category Name</th>
								<th>Category Description</th> 
								<th>Category Image</th>
								<th>Show Products</th>
							</tr>
						</thead>
							<tbody>
							<%
							 
							List<Category> categories = (List<Category>)request.getAttribute("categories");
							for(Category c : categories){
							%>
							<tr>
								<td><%= c.getCategoryName() %></td>
								<td><%= c.getCategoryDesc() %></td>
								<td><img src="<%= c.getCategoryImg() %>" alt="electronics.image" width="100" height="80" class="rounded shadow-sm"></img></td>
								 <td><a href="ProductServlet?categoryId=<%= c.getCategoryId() %>" class="btn btn-sm btn-outline-info">View</a></td>
							</tr>
							<% } %>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>