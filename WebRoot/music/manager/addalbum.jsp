<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>


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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	div{
		margin-left:500px ;
		margin-top:100px;
	
	}
	</style>

  </head>
  
  <body>
	  <div>
		  <form action="<c:url value='/AlbumServlet'/>" method="post" enctype="multipart/form-data">
			  专辑名称:<input type="text" name="album"/><br/>
			  歌手名:<input type="text" name="singername"/><br>
			  专辑图片:<input type="file" value="选择图片" name="albumimage"/><br>
		  			<input type="submit" value="添加"/>
		  </form>
	  </div>
  </body>
</html>
