<%@page import="com.cdac.Pojo.UserLogin"%>
<%@page import="com.cdac.Pojo.CartItems"%>
<%@page import="java.util.List"%>
<%@page import="com.cdac.Pojo.Cart"%>
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
<title>View Cart</title>
</head>
<body>

<%
UserLogin user = (UserLogin) session.getAttribute("user");
if (user == null) {
    response.sendRedirect("Login.jsp");
    return;
}
Cart cart = (Cart) session.getAttribute("cart");
%>

<div class="container mt-5">
    <div class="d-flex justify-content-between align-items-center mt-4 border-bottom">
        <h3>Welcome <%=user.getCustomerName()%>!</h3>
        <form action="LogoutServlet" method="post">
            <button type="submit" class="btn btn-danger">Logout</button>
        </form>
    </div>

    <div class="row justify-content-center p-3">
        <div class="col-8">
            <div class="card shadow text-center bg-light">
                <div class="card-header text-light bg-dark">
                    <h3>Your Cart</h3>
                </div>

                <div class="card-body">
                <%
                if (cart == null || cart.allItems().isEmpty()) {
                %>
                    <h2>Your Cart is Empty</h2>
                <%
                } else {
                    List<CartItems> citems = cart.allItems();
                %>
                    <table class="table table-striped">
                        <thead class="table-secondary">
                            <tr>
                                <th>Product Name</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
                        for (CartItems items : citems) {
                        %>
                            <tr>
                                <td><%=items.getProduct().getProductName()%></td>
                                <td><%=items.getProduct().getPrice()%></td>
                                <td><%=items.getQuantity()%></td>
                                <td><%=items.getTotalPrice()%></td>
                            </tr>
                        <%
                        }
                        %>
                            <tr>
                                <td colspan="3" align="right"><strong>Grand Total:</strong></td>
                                <td><strong>₹ <%=cart.getTotalCartAmount() %></strong></td>
                            </tr>
                        </tbody>
                    </table>
                    <br>
                    <a href="Product.jsp" class="btn btn-outline-primary">Continue Shopping</a>
                    <a href="payment.jsp" class="btn btn-success ms-2">Proceed to Payment</a>
                <%
                }
                %>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
