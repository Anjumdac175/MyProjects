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
	<title>User Login</title>
</head>
<body>
 
 	<div class="container mt-5">
	 	<div class="row justify-content-center">
	 		<div class = col-5>
	 			<div class="card shadow">
	 				<div class="card-header bg-primary text-light text-center">
	 					<h3>Authentication Page</h3>
	 				</div>
	 				<div class="card-body">
	 					<form action="AuthenticateServlet" method="post">
	 						<div class="mb-3">
									<label class="form-label fw-semibold">UserName</label> <input
									type="text" class="form-control" name="uname"
									placeholder="Enter your Name" required>
							</div>
							<div class="mb-3">
									<label class="form-label fw-semibold">Password</label> <input
									type="password" class="form-control" name="pswd"
									placeholder="Enter your password" required>
							</div>
		 					<div class="text-center">
								<button type="submit" class="btn btn-primary w-50">Login</button>
							</div>
	 					
	 					</form>
	 				
	 				</div>
	 				 <div class="card-footer text-muted text-center">
                        © 2025 MyShop
                    </div>
	 			</div>
	 		</div>
	 	</div>
 	</div>
</body>
</html>