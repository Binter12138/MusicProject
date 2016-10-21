<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'songer.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/songer.css" type="text/css" rel="Stylesheet" />

  </head>
  
  <body>
    <div id="songer_model">
	<div class="songer_header">
		<img src="music/images/1.png"/>
		<div class="songer_right">
		
			<h1>${singern }</h1>
			<c:forEach items="${singerinfo }" var="sin">
				<p>简介:${sin.singerinfo }</p>
			</c:forEach>
			
			
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
				<td>歌曲</td>
				<td>专辑</td>
				<th>时长</th>
			</tr>
			<c:forEach items="${songname }" var="str">
			<tr>
				<th>1</th>
				<td>
					<a href="javascript:;">${str.songname }</a>
					
				</td>
				<td><a href="javascript:;">${str.album }</a></td>
				<th></th>
			 </c:forEach>
			<tr>
				<th>2</th>
				<td>
					<a href="javascript:;">xxxx</a>
					<div class="slogo">
						<a href="javascript:;"><div class="slogo1"></div></a>
						<a href="javascript:;"><div class="slogo2"></div></a>
						<a href="javascript:;"><div class="slogo3"></div></a>
					</div>
				</td>
				<td><a href="javascript:;">xxxx</a></td>
				<th>xxxx</th>
			</tr>
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
