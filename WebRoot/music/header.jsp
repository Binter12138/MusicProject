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
    
    <title>My JSP 'header.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	
	
  </head>
  
 <div id="header">
	<img src="music/images/logo.jpg" class="logo"/>
	<ul class="header_ul">
		<li class="li"><a href="javascript:;">音乐馆</a></li>
		<li><a href="<c:url value='/UserCollectionServlet?method=findUserCollection'/>" class="header_a">我的音乐</a></li>
		
	</ul>
	<div class="header_text">
		
		<input type="text" class="text" id="vvv" name="singerName" value=""/>
		
		<a class="btn" id="aaa" href="JavaScript:singername();"></a>
		
	</div>
	<div class="login">
		<ul>
			<c:choose>
				<c:when test="${ empty username }">
					<li><a href="<c:url value='/music/regist.jsp'/>" class="header_a2">注册</a></li>
					<li><a href="<c:url value='/music/login.jsp'/>" class="header_a">登录</a></li>
				</c:when>
				<c:otherwise>
					<li><h3>欢迎用户：${username }</h3></li>
					<li><a href="javascript:;" id="out" class="header_a">退出</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>	
</div>
  </body>
 
</html>
