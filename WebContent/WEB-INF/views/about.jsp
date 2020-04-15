<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="ISO-8859-1">
   	 	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>CS472 WAP - Team Project - E-Commerce</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  
    	<!-- <link rel="stylesheet" href="WEB-INF/css/main.css"> -->
    	<link rel="stylesheet" href="css/about.css">
    	
	</head>
	<body>		
		<%@ include file="/WEB-INF/fragments/header.jsp" %>
			<div class="row">
			 	<div class="col-md-6 col-sm-6 col-xs-12">
					<img src="images/miu.jpg" alt="Trulli">
	        	</div>
		    	<div class="col-md-6 col-sm-6 col-xs-12">
			          <h1>  WAP Project: eshopping </h1>
			          <p>
			            This site is for the users and the site visitors and store customers purchase products and 
			            services from businesses. No customer should ever be taken for granted by any business and 
			            this rings especially true in ecommerce, where visitors can abandon a potential purchase with
			            a single click. Every aspect of a brand ecommerce presence should be tailored toward 
			            creating high quality, personalized experiences for each user and their individual 
			            customer journeys.
			            
			          </p>  
			          <p>
			             This Project was developed by members of Team: Munkh-Erdene.T, Namuun.S, Burmaa.E, Otgonbayar.M,
			            and O. Uuganbayar
			          </p>
			          
			           <button type="button" class="collapsible">How to become our partner</button>
						<div class="content">
						  <p>We cover the market with an ever-growing network of business and technology partners that we actively
						   support in terms of technical support, sales, and marketing. We are keen on promoting the highest 
						   possible return on partnerships. By providing the highest standard of client services, our partners
						   can rely on us as a stable source of income.</p>
						</div>
					     <button type="button" class="collapsible">Sell your product here</button>
						<div class="content">
						  <p>The world of eCommerce selling products and services through the internet, offers vast opportunity for
						   entrepreneurs. If you're interested in starting a business, selling online can be extremely rewarding. 
						   It can also provide a path to success without the risks involved in buying property and opening a physical store..</p>
						</div>	
						<button type="button" class="collapsible">Awesome quality</button>
						<div class="content">
						  <p>Perfecting product quality has numerous benefits for any company. The positive correlation between product
						   quality and sales should be reason enough to make quality a top priority in a business strategy. The trust, 
						   credibility, and loyalty that comes from happy customers builds repeat sales and ignites positive.</p>
						</div>	
								          
			    </div>
		    </div>
		  
		  </br>
		  </br>
		  </br>
	
		  <section class="brand-promises border-gray-ligth mb30">  
			<div class="row">
			
		           <div class="col-md-4 col-sm-4 col-xs-12">
						<div class="item bonus-plus has-sep">
							<h4>Pure quality</h4>
							<div class="desc">Get a bonus plus for buying more that three products</div>
						</div>
		           </div>
		           
		        	<div class="col-md-4 col-sm-4 col-xs-12">
						<div class="item free-shipping has-sep">
							<h4>Free Shipping</h4>
							<div class="desc">Free shipping on all orders over $99</div>
						</div>
					</div>
					
			    	<div class="col-md-4 col-sm-4 col-xs-12">
						<div class="item money-back-guarentee has-sep">
							<h4>Home delivery</h4>
							<div class="desc">100% money back guarantee</div>
						</div>
					</div>
		    
		         </div>
		    </div>     
		    
		    <section class="brand-promises border-gray-ligth mb30">  
		     	<div class="row">
						
						<div class="col-md-2 col-sm-3 col-xs-12">
						  <div class="item featured-products">
						    	<img src="images/image1.png" alt="Trulli" width="300" height="300">
						     	<h4></h4>
						    	<h4>Team member</h4>
						        <h5> Munkh-Erdene.T </h5>
						   </div>
						</div>
						<div class="col-md-2 col-sm-3 col-xs-12">
							<div class="item featured-products">
							     <img src="images/image3.jpg" alt="Trulli" width="300" height="300">
							     <h4></h4>
							     <h4>Team member</h4>
						         <h5> Namuun.S </h5>
						    </div>
						</div>
						
					  	<div class="col-md-2 col-sm-3 col-xs-12">
					  	    <div class="item featured-products">
						    	<img src="images/image4.jpg" alt="Trulli" width="300" height="300">
						    	    <h4></h4>
						    		<h4>Team member</h4>
						        	<h5> Burmaa.E </h5>
					    	</div>
						</div>
						
					    <div class="col-md-2 col-sm-3 col-xs-12">
					      <div class="item featured-products">
					    	<img src="images/image2.jpg" alt="Trulli" width="300" height="300">
					    		<h4></h4>
					    		<h4>Team member</h4>
						        <h5> Otgonbayar.M </h5>
					    	</div>
						</div>
						
						<div class="col-md-2 col-sm-3 col-xs-12">
						   <div class="item featured-products">
					    	<img src="images/image.jpg" alt="Trulli" width="300" height="300">
					    	    <h4></h4>
					    		<h4>Team member</h4>
						        <h5> Uuganbayar.O </h5>
						</div>
			     </div>			
			</div>
		
		<%-- <fieldset>
			<p>Categories:</p>
			<ul>
				<c:forEach var="category" items="${categories}">
					<li><a href="shop?category=${category.id}"><c:out value="${category.name}"/></a></li>
				</c:forEach>
			</ul>
			
		 --%>
		<!-- JQuery & app.js files are included in the footer element. -->
		<%@ include file="/WEB-INF/fragments/footer.jsp" %>		

	</body>
</html>
		
<script>
		var coll = document.getElementsByClassName("collapsible");
		var i;
		
		for (i = 0; i < coll.length; i++) {
		  coll[i].addEventListener("click", function() {
		    this.classList.toggle("active");
		    var content = this.nextElementSibling;
		    if (content.style.display === "block") {
		      content.style.display = "none";
		    } else {
		      content.style.display = "block";
		    }
		  });
		}
</script>