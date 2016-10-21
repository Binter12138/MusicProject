$(function(){
	$(".frame_singer").click(function(){
		$("#iframe").children().attr("src","follow_singer.html");
	});
	$(".frame_song").click(function(){
		$("#iframe").children().attr("src","follow_music.html");
	});

})