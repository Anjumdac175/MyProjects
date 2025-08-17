<%@page import="com.cdac.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin DashBoard</title>
</head>
<body>
	<%
		User user = (User) session.getAttribute("user");
		if(user == null){
			response.sendRedirect("Login.jsp");
			return;
		}
		
	%>
	<h2>Welcome! Admin <%= user.getName() %></h2>

</body>
</html>