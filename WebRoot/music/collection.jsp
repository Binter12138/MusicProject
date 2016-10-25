<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>收藏</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/follow.css" type="text/css" rel="Stylesheet" />
  </head>
  
  <body>
    <div id="follow_model">
		<ul>
			<li>
				<div>
					<center><img src="music/images/bg.jpg"/></center>
					<center class="myname">${username }</center>
					<center><a class="frame_singer" href="javascript:;">关注</a>|<a class="frame_song" href="javascript:;">收藏</a></center>
				</div>
			</li>
		</ul>
	</div>
	<div class="song_table">
		<h2>我的收藏</h2>
		<table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<th>序号</th>
				<td>歌曲</td>
				<td>歌手</td>
				<th>时长</th>
			</tr>
			<c:forEach items="${userCollection }" var="ss">
				<tr>
				<th>1</th>
				<td>
					<a href="<c:url value='/SingerServlet?method=findsinger&path=${ss.songpath }&singername=${ss.singername }&songname=${ss.songname}'/>">${ss.songname }</a>
				</td>
				<td><a href="<c:url value='/SongServlet?method=viewSong&singerName=${ss.singername }'/>">${ss.singername }</a></td>
				 
			
				<th>xxxx</th>
			</tr>
			
			</c:forEach>
			
		</table>
	</div>
	<div id="footer">
		<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
	</div>
	<script type="text/javascript" src="music/js/jquery.min.js"></script>
	<script type="text/javascript" src="music/js/header.js"></script>
	<script type="text/javascript" src="music/js/follow.js"></script>
  </body>
</html>
