<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
</head>
<body>
<h3>Product Info:</h3>
<img src="img/<c:out value="${product.imagePath}"/>" alt="${product.imagePath}" style="max-width: 180px;"/>
<p>Name: "${product.name}"</p>
<p>Description: "${product.description}"</p>
<p>Price: "${product.price}"</p>
<p>Quantity: "${product.quantity}"</p>

</body>
</html>