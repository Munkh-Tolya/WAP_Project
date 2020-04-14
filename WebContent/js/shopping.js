"use strict";
$(function(){
	$('.addToCard').on('click',addProduct);
});

function addProduct(event){
	event.preventDefault();
	const productId = $(this).attr("value");
	alert(productId);
}


