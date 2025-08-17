<%@page import="com.cdac.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
</head>
<body>
	<%
		User user = (User) session.getAttribute("user");
		if(user == null){
			response.sendRedirect("Login.jsp");
			return;
		}
	
	%>
	
	<h2>Welcome! User <%= user.getName() %></h2>
</body>
</html>