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
    
    <title>修改专辑</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<%
		String albumname = request.getParameter("albumname");
		String singername = request.getParameter("singername");
	
	%>
  </head>
  
  <body>
    <form action="<c:url value='/AlbumServlet?method=modifyAlbum'/>" method="post">
    	
    	专辑名：<input type="text" name="albumName" value="<%=albumname%>"/>
    	歌手名：<input type="text" name="singerName" value="<%=singername%>"/>
    	<input type="submit" value="保存修改"/>
    </form>
  </body>
</html>
