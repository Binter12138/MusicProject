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
    
    <title>管理员登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/login.css" type="text/css" rel="Stylesheet" />

	<style type="text/css">
	
		 #lop p{
		
			font-size:30px;
			margin-left:450px;
		}
	
		#lop{
			padding-top:100px;
		}
	</style>
  </head>
  
  <body>
    <div id="login">
    			<div  id="lop"><p>管理员登录</p></div>
	<form id="formid"  name= "myform" method = 'post'  action = "<c:url value='/UserServlet?method=loginManager'/>" onsubmit = "return checkUser();" >
		<table  width="100%" border="0">
		
			<tr>
				<td align="right">用户名:</td>
				<td colspan="2"><input type="text" name="username" class="username"/></td>
				<td><p style="color:red">${error }</p></td>
			</tr>
			<tr>
				<td align="right">密码:</td>
				<td colspan="2"><input type="password" name="password" class="password" value=""/></td>
				<td class="tis"></td>				
			</tr>
		
			<tr>
				<td></td>
				<td colspan="2"> <input type="submit" value="登录" class="btn2"  /></td>
				<td class="tis"></td>
			</tr>
		</table>
</form>
</div>
<div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>
  </body>
</html>
