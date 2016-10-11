<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>播放</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
@charset "utf-8";
body{margin:0;}
.Music { background: url(music/images/bg.jpg) -500px 0; padding: 30px 0 0; height:750px;}
.Music audio{margin: -193px 0px 0 516px;}
#player{height: 32px;position: relative;width:32px; margin-left:516px;margin-top: -193px;opacity: 0;}
.MusicPlaySound { background: url(music/images/yybw.png); width: 536px; height: 524px; margin: 0 auto; position: relative; overflow:hidden; }
.MusicPlayBg { }
.MusicPlaySound>img { position: absolute; left: 50%; }
.MusicPlayBg { top: 61px; margin-left: -207px; }
.MusicPlayProcess { top: 57px;  margin-left: -211px;}
.MusicPlayBox{ position:absolute; width:415px; height:417px; left:50%; top:61px; margin-left:-209px;}
.MusicPlayBox .title{ margin:45px auto 0; text-align:center; color:#fff;}
.MusicPlayBox .name{ margin:5px auto 0; text-align:center; font-size:24px; color:#33ffff;}
.MusicPicName{ width:120px; position:absolute; left:50%; top:50%; margin:-60px 0 0 -60px; border-radius:100%;}
.MusicPicButton{cursor:pointer; position:absolute; left:50%; top:50%; margin:-27px 0 0 -27px;}

.MusicPlayBox .icon{cursor: pointer;width: 20px;height: 21px;display: block;position: absolute;color: #fff;text-align: center;top: 196px;font-size: 14px;}
.MusicPlayBox .Prev{background: url(music/images/player.png) 0 -30px;left: 121px;}
.MusicPlayBox .Next{background: url(music/images/player.png) 0 -51px;right: 121px;}
.MusicPlayProcess.rotate{animation:rotate 30s infinite linear;}
.MusicPlayProcess.pause{animation-play-state:paused;
-webkit-animation-play-state:paused;}
.MusicPicName.PicNameRotate{animation:rotate 4s infinite linear;}
.MusicPicName.pause{animation-play-state:paused;
-webkit-animation-play-state:paused;}
@keyframes rotate{
	from{ transform:rotate(0deg)}
	to{ transform:rotate(360deg)}
	
}
</style>
  </head>
  
  <body>
  <%
  	String p = request.getParameter("path");
  String n = request.getParameter("songname");
  String sg = request.getParameter("singername");
  	
  %>
<div class="Music">
  <div class="MusicPlaySound"> 
  <img class="MusicPlayBg" src="music/images/zsy.png" /> 
  <img class="MusicPlayProcess rotate" src="music/images/yyjd.png" />
    <div class="MusicPlayBox">
      <h3 class="title"><%=n %></h3>
      <p class="name"><%=sg %></p>
      <div class="MusicPic"> <img class="MusicPicName PicNameRotate" src="music/images/yifan.jpg" /> <img class="MusicPicButton" src="music/images/pause.png" /> </div>
      <div class="Prev icon"></div>
      <div class="Next icon"></div>
    </div>
  </div>
  <audio src="<%=p %>" autoplay="autoplay" controls="controls"></audio>
  			
  			  	
  <div id="player"></div>
</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script>
$(function(){
    var play=1;
    $(".MusicPicButton,#player").click(function(){
        if(play==0){
            $(".MusicPicButton").attr("src","music/images/pause.png");
            $(".MusicPlayProcess").removeClass("pause");
            $(".MusicPicName").removeClass("pause"); 
            $("audio")[0].play();
			console.log($("audio").get(0).duration);
            play=1;
        }else{
            $(".MusicPicButton").attr("src","music/images/play1.png");
            $(".MusicPlayProcess").addClass("pause");
            $(".MusicPicName").addClass("pause");   
            play=0;
			console.log($("#player"));
            $("audio")[0].pause();
			//console.log($("audio").get(0).currentTime);
        }
        
    });
	$(".Prev").click(function(){
		$("audio").attr("src","http://59.56.30.96/m10.music.126.net/20161009205852/1c9aa4be9bfafa378503f31d32c36103/ymusic/5e8c/9fbd/460a/63af292aec1f060e9a1c23a8c1bbff95.mp3");
	});
	$(".Next").click(function(){
		$("audio").attr("src","http://59.56.30.108/m10.music.126.net/20161009205947/5d7cb1e74dac158e1cb19df2acb5938d/ymusic/3caa/2bb1/b665/afa5abf4fbbe61a9528cf9ec1faca960.mp3");
		
	});
	$(".Next").click(function(){
		
		$("h3").text("<%=n %>");
	});
});
</script>
</body>
</html>
