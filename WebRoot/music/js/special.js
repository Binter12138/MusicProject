$(function(){
	$(".table dt").hover(function(){
		$(this).find(".txt").stop().animate({height:"260px"},200);
	},function(){
		$(this).find(".txt").stop().animate({height:"0px"},200);

	})
	
	$(".table dd a").hover(function(){
		$(this).css("color","#31c27c");
	},function(){
		$(this).css("color","");
	})
})