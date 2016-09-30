$(document).ready(function() {
	$(".header_a").hover(function() {
            $(this).css("color","#31c27c");
        }, function() {
            $(this).css("color","black");
        });
	$(".header_a2").hover(function() {
            $(this).css("background","#086538");
        }, function() {
            $(this).css("background","#31c27c");
        });
	$(".text").click(function(){
		$(this).css("border","none");
	});
	$(".btn").hover(function() {
            $(this).css("opacity","1");
        }, function() {
            $(this).css("opacity","0.6");
        });
	$("#header_song .header_a").click(function(){
		$("#header_song ul").children().children().css("background","white");
		$(this).css("background","#e8eae9");
	});
	
})