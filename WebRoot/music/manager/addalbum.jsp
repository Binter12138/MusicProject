<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加专辑</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<style type="text/css">
	div{
		margin-left:400px ;
		margin-top:100px;
	
	}
	</style>

  </head>
  
  <body>
    <div id="header">
	<img src="music/images/logo.jpg" class="logo"/>
	<ul class="header_ul">
		<li class="li"><a href="javascript:;">音乐馆</a></li>
		<li><a href="javascript:;" class="header_a">我的音乐</a></li>
		
	</ul>
	<div class="header_text">
		<input type="text" class="text" value="陈奕迅"/>
		<input type="button" class="btn">
	</div>
	<div class="login">
		<ul>
			<li><span>您好：${admin }</span></li>
			<li><a href="<c:url value='/UserServlet?method=exitManager'/>" class="header_a">注销</a></li>
		</ul>
	</div>	
</div>
	  <div>
		  
		  <form action="<c:url value='/AlbumServlet?method=addAlbum'/>" method="post" enctype="multipart/form-data">
		  <table>
		    <tr>
				<td style="text-align:right;padding: 10px;">专辑名称:</td>
				<td><input type="text" name="album" style="width: 300px;height:30px"/></td>
			</tr>
			<tr>
				<td style="text-align:right;padding: 10px;">歌手名:</td>
				<td><input type="text" name="singername" style="width: 300px;height:30px"/></td>
			</tr>
			<tr>
				<td style="text-align:right;padding: 10px;">专辑图片:</td>
				<td><input type="file" value="选择图片" name="albumimage"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="添加" style="background:green;border:0;padding: 5px 10px;color: wheat;padding: 10px;"/></td>
			</tr>
		  </table>
		  </form>
		  
	  </div>

  </body>
</html>
