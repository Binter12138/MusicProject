<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>${singern }</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/songer.css" type="text/css" rel="Stylesheet" />
<%
	String singerimage = request.getParameter("image");
%>
  </head>
  
  <body>
    <div id="songer_model">
	<div class="songer_header">
		<img src="music/files/<%=singerimage%>"/>
		<div class="songer_right">
		
			<h1>${singern }</h1>
		
				<p>简介:${singerinfo }</p>
			
			
			
			<a href="javascript:;" class="playall">
				<div class="playimg">▷播放所有歌曲</div>
			</a>
			
			<!-- if语句判断未关注执行 -->
			<div class="focusimg1"><span>+</span><div>关注</div></div>
			
			<!-- if语句判断已关注执行<div class="focusimg2"><span>+</span><div>已关注</div></div> -->
			
		</div>
	</div>
	
	<div class="song_table">
		<h2>全部歌曲</h2>
		<table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<th>序号</th>
				<th>歌曲</th>
				<th>专辑</th>
				<th>时长</th>
			</tr>
			<c:forEach items="${songname }" var="str">
			<tr>
				<th>1</th>
				<td>
					<a href="javascript:;">${str.songname }</a>
					<div class="slogo">
						<a href="<c:url value='/SingerServlet?method=findsinger&path=${str.path }&songname=${str.songname}&singername=${str.singername }'/>">
							<div class="slogo1"></div>
						</a>
						<a href="<c:url value='/UserCollectionServlet?method=collection&songname=${str.songname}&singername=${str.singername }&username=${username }&songpath=${str.path }'/>">
							<div class="slogo2"></div>
						</a>
						<a href="javascript:;">
							<div class="slogo3"></div>
						</a>
					</div>
				</td>
				<td><a href="javascript:;">${str.album }</a></td>
				<td></td>
			 </c:forEach>
		</table>
	</div>
</div>
    <div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
<script type="text/javascript" src="music/js/songer.js"></script>
  </body>
</html>
