<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payment Result</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
        crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card shadow text-center">
                <div class="card-header bg-dark text-white">
                    <h3>Payment Status</h3>
                </div>
                <div class="card-body">
                    <%
                        String message = (String) request.getAttribute("message");
                        if (message != null && !message.isEmpty()) {
                    %>
                        <div class="alert alert-info" role="alert">
                            <h4><%= message %></h4>
                        </div>
                    <%
                        } else {
                    %>
                        <div class="alert alert-warning">
                            <h4>No message received.</h4>
                        </div>
                    <%
                        }
                    %>
                    <a href="Product.jsp" class="btn btn-primary mt-3">Continue Shopping</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
