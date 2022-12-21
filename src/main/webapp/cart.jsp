<%@ page import="model.Cart" %><%--
  Created by IntelliJ IDEA.
  User: timur
  Date: 09.12.2022
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p>
        Наименование: <%= cart.getName();%>
    </p>
    <p>
        Количество: <%= cart.getQuantity();%>
    </p>
</body>
</html>
