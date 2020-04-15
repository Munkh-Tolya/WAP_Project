<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cardTotal" value="0" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	  <fieldset>
	    <legend>Shopping card:</legend>
		<c:forEach var="item" items="${shoppingCard.items}">
			<p>${item.product.name} - ${item.quantity} X ${item.product.price}</p>
			<c:set var="cardTotal" value="${cardTotal + item.price}" scope="page"/>
		</c:forEach>
		<b>Total:</b> <c:out value="$${cardTotal}"></c:out>
	  </fieldset>
	
	<p>Categories:</p>
	<ul>
		<c:forEach var="category" items="${categories}">
    		<li><a href="shop?category=${category.id}"><c:out value="${category.name}"/></a></li>
		</c:forEach>
	</ul>
	<br/>
	<p>Products:</p>
	<ul>
		<c:forEach var="product" items="${products}">
    		<li>
    			<c:out value="${product.name}"/>
				<img src="<c:out value="${product.imagePath}"/>" alt="${product.imagePath}" style="max-width: 180px;"/>
				<button class="addToCard" value="${product.id}">add to card</button>
    		</li>
		</c:forEach>
		
	</ul>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.0.min.js"></script>
    <script src="js/shopping.js"></script>
</body>
</html>