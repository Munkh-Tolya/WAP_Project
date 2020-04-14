<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Categories:</p>
	<ul>
		<c:forEach var="category" items="${categories}">
    		<li><c:out value="${category.name}"/></li>
		</c:forEach>
	</ul>
	<br/>
	<p>Products:</p>
	<ul>
		<c:forEach var="product" items="${products}">
    		<li>
    			<c:out value="${product.name}"/>
				<img src="img/<c:out value="${product.imagePath}"/>" alt="${product.imagePath}" style="max-width: 180px;"/>
				<button class="addToCard">add to card</button>
    		</li>
		</c:forEach>
		
	</ul>

</body>
</html>