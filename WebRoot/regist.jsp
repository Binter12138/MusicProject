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
    
    <title>My JSP 'regist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function changeImage()
		{
			var img = document.getElementById("verCode");
			img.src="<c:url value='/VerCodeServlet'/>?xxx="+new Date().getTime();
		}
	
	</script>

  </head>
  
  <body>
  <h1>注册</h1>
  <p style="color:red;">${message }</p>
  	<form action="<c:url value='/RegistServlet'/>" method="post">
  	
  		用户名：<input type="text" name="username" value="${user.username }"/><br/>
  		密码：<input type="password" name="password" value="${user.password }"/><br/>
  		性别：<input type="text" name="sex" value="${user.sex }"/><br/>
  		出生日期：<input type="text" name="brithday" value="${user.brithday }"/><br/>
  		验证码：<input type="text" name="vercode"  value="${user.vercode }" size="3"/>
  		<img  id="verCode" src="<c:url value='/VerCodeServlet'/>" border="1">
  		<a href="javascript:changeImage()">换一张</a><br>
  		<input type="submit" value="注册"/>
  	
  	</form>
  
  </body>
</html>
