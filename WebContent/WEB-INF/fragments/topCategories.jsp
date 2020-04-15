<section id="topCategories" class="border-gray">
	<h4>Top Categories</h4>
	<div class="cat-list">
		<ul>
		<c:forEach var="category" items="${categories}" varStatus="loopCounter">
			<c:if test="${loopCounter.count<7}">
				<li>
					<a href="<c:url value="/shop?category=${category.id}"/>" <c:if test="${loopCounter.count==1}" >class="noborder"</c:if> >
						<c:out value = "${category.name}" />
					</a>
				</li>
		     </c:if>	         	
      	</c:forEach>				
		</ul>
	</div>
</section>