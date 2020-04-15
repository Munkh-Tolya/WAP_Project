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
});