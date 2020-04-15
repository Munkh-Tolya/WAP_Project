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
		$(".remove").on("click",function(evt){
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
		});
	}
});
function showLoader(){
    $("#loader").show();
}
function hideLoader(){
    $("#loader").hide();
}