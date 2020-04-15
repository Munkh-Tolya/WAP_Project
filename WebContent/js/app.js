"use strict";
/**
 * app.js
 */
$(function(){
	
	if($('.carousel-wrap').hasClass('active')){
		console.log("here");
		$('.carousel').carousel({
			interval: 5000
		});
	}
	
	if($('#cart').hasClass('active')){
		/*$(".remove").on("click",function(evt){
			evt.preventDefault();
			const dataItem = $(this).data("item");
			const itemRow = $('#item-'+dataItem);
			console.log($(itemRow).find('.total').html());
			const itemPrice = parseFloat($(itemRow).find('.total').html().replace("$",""));
			let gTotal = parseFloat($('#grandTotal').html());
			showLoader();
            fetch("cart/remove", 
            {  method: 'POST',  
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded',
                },
                body: 'item='+dataItem
            })
            .then(res=>{
                if(res.ok){
	                itemRow.remove();
	                gTotal -= itemPrice;
	                $('#grandTotal').html(gTotal);
                }else{
                	alert("Please try again!");
                }
            })
            .catch(error => showFailureInfo())
            .then(hideLoader); 
		});*/
		
		$(".remove").on("click",function(evt){
			evt.preventDefault();
			const productId = $(this).data("item");
			const itemRow = $('#item-'+productId);
			console.log($(itemRow).find('.total').html());
			const itemPrice = parseFloat($(itemRow).find('.total').html().replace("$",""));
			let gTotal = parseFloat($('#grandTotal').html());
			showLoader();
			
			$.ajax("http://localhost:8081/wap_project/shop",{
				method:"POST",
				data: {"cmd":"removeProductFromCard",
						"productId":productId,
						"quantity":1},
				dataType: "json"
			})
			.done(function(response){
				if(response.success){
					itemRow.remove();
	                gTotal -= itemPrice;
	                $('#grandTotal').html(gTotal);
				}else{
					alert(response.message);
				}
			})
			.fail(function(){
				alert("Failed to remove this product from the shopping card!");
			})
		});
	}
});
function showLoader(){
    $("#loader").show();
}
function hideLoader(){
    $("#loader").hide();
}