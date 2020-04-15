<header>
	<div id="toolbar">
		<div class="container">
			<div class="float-right">
				<a href="/admin" class="link-wishlist up">Admin</a>				
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<div id="top">
		<div class="container">		
			<a href="<c:url value="/"/>" class="logo"><img src="images/logo.png" /></a>
			<a class="card-link" href="<c:url value="/about-us"/>"><i class="material-icons">shopping_cart</i><span id="itemCount">0</span></a>
			<span id="helpline">
				<span>Helpline</span>
				<span class="phone">(800) 369-6480</span>
			</span>
			<div class="clearfix"></div>
		</div>   		
	</div>	
	<div class="bg-orange">
		<div class="container">
			<ul class="nav">
	   			<li class="nav-item active">
		        	<a class="nav-link" href="<c:url value="/"/>">Home <span class="sr-only">(current)</span></a>
		      	</li>
   				<li class="nav-item dropdown">
			        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			         Shop
			        </a>
			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
			        <c:forEach var="category" items="${categories}" varStatus="loopCounter">	
						<a href="<c:url value="/shop?category=${category.id}"/>" class="dropdown-item" >
							<c:out value = "${category.name}" />
						</a>										             	
			      	</c:forEach>
			        </div>
		      	</li>
		      	<li class="nav-item">
		        	<a class="nav-link" href="<c:url value="/about-us"/>">About Us</a>
		      	</li>
		      	<li class="nav-item">
		        	<a class="nav-link" href="<c:url value="/cotact"/>">Contact</a>
		      	</li>
   			</ul>
		</div>
	</div>
</header>