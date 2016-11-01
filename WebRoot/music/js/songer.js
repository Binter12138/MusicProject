$(function(){
	$(".focusimg1").hover(function(){
		$(this).css("background","#ededed");
	},function(){
		$(this).css("background","#f8f9f8");
	});
	
	$(".focusimg2").hover(function(){
		$(this).css("background","#ededed");
	},function(){
		$(this).css("background","#f8f9f8");
	});
	
	$(".playimg").hover(function(){
		$(this).css("background","#086538");
	},function(){
		$(this).css("background","#31c27c");
	});
	
	$(".song_table td").hover(function(){
		$(this).children(".slogo").css("display","block");
	},function(){
		$(this).children(".slogo").css("display","none");
	});
	
	$(".slogo1").hover(over,out);
	$(".slogo2").hover(over,out);
	$(".slogo3").hover(over,out);
	
	function over(){
		$(this).css("opacity","1");
	}
	function out(){
		$(this).css("opacity","0");
	}
});