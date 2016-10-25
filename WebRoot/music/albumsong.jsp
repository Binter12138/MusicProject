<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>专辑</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="music/css/head.css" type="text/css" rel="Stylesheet" />
		<style type="text/css">
		#xuhao{
			margin-left:600px;
			margin-top:100px;
		
		}
		.songlist_header_time{
			margin-right:337px;
			padding-left:220px;
			color: #DA471B;
			}
		.album{
			position:absolute;
			margin-left:685px;
			margin-top:-43px;
		}
		</style>
  </head>
  
  <body>
  <div class="mod_songlist">
		 <ul class="songlist_header">
			<li class ="songlist_header_number">序号</li>
			<li class ="songlist_header_name">歌手</li>
			<li class ="songlist_header_author">歌名</li>
			<li class ="songlist_header_author">专辑</li>
			<li class ="songlist_header_time">时长</li>
			</ul>
		
			<div class ="aaa">
				 
		  	
	<c:forEach items="${message }" var="str">
		  	
		  <div class="songlist__number  songlist__number--top">1</div>
		  			   
		 <div class="a">
		<p class="songlist__songname_txt" >${str.singername }</p>
		</div>
		 <div class="songlist__artist">
		   <p class="singer_name" style="text-align:left">${str.songname}</p>
			
		  </div>
		  <div class="album">
		  	<a>${str.album }</a>
		  </div>

		   <!--图标-->
		 <div class="mod_list_menu">
		 
		<a href="<c:url value='/SingerServlet?method=findsinger&path=${str.path }&songname=${str.songname}&singername=${str.singername }'/>"><img class="play"src="music/images/play48.png"/></a>
		<a href="<c:url value='/UserCollectionServlet?method=collection&songname=${str.songname}&singername=${str.singername }&username=${username }&songpath=${str.path }'/>"><img class="play" src="music/images/plus49.png"/></a>
		<a href="#"><img class="play" src="music/images/download.png"/></a>
		 </div>
		 <div class="songlist__time">03:05</div>
		
 	 </c:forEach>

		 </div>
			
	<div id="xuhao">
	<a href="#">1</a>
	<a href="#">2</a>
	<a href="#">3</a>
	<a href="#">4</a>
	<a href="#">5</a>
	<a href="#">下一页</a>
	<a href="#">尾页</a>
	</div>
</div>
    <div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
	</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
  </body>
  	
</html>
