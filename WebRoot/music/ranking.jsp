<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>排行榜</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/head.css" type="text/css" rel="Stylesheet" />


  </head>
  
 <body>



<div id="ranking">
	<div  class="mod_toplist">
		<div class="toplist__hd">
			<h1 class="toplist__tit">华语热歌榜</h1>	
		</div>
	</div>  
	<div class="mod_songlist">
		 <ul class="songlist_header">
			<li class ="songlist_header_number">序号</li>
			<li class ="songlist_header_name">歌手</li>
			<li class ="songlist_header_author">歌名</li>
			<li class ="songlist_header_time">时长</li>
			</ul>
		 
		 <c:forEach items="${rankSong }" var="r">
				<div class ="aaa">
			 <div class="songlist__number  songlist__number--top">1</div>
			 <div class="a">
			<span class="songlist__songname_txt">${r.singername }</span>
			</div>
			 <div class="songlist__artist">
			   <a class="singer_name" href="<c:url value='/SingerServlet?method=findsinger&path=${r.path }&songname=${r.songname}&singername=${r.singername }'/>" style="text-align:left">${r.songname }</a>
			   </div>
			   <!--图标-->
			 <div class="mod_list_menu">
				<a href="<c:url value='/SingerServlet?method=findsinger&path=${r.path }&songname=${r.songname}&singername=${r.singername }'/>"><img class="play"src="music/images/play48.png"/></a>
				<a href="<c:url value='/UserCollectionServlet?method=collection&songname=${r.songname}&singername=${r.singername }&username=${username }&songpath=${str.path }'/>"><img class="play" src="music/images/plus49.png"/></a>
				<a href="javascript:;"><img class="play" src="music/images/download.png"/></a>
			 </div>
			 <div class="songlist__time">03:05</div>
			 </div>
		  </c:forEach>
		 

	</div>
</div>
<div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>


</body>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
</html>
