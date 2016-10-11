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
    
     <title>MyMusic登入</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/login.css" type="text/css" rel="Stylesheet" />

  </head>
 <body>
  <div id="header">
	<img src="music/images/logo.jpg" class="logo"/>
	<ul class="header_ul">
		<li class="li"><a href="javascript:;">音乐馆</a></li>
		<li><a href="javascript:;" class="header_a">我的音乐</a></li>
		
	</ul>
	<div class="header_text">
		<input type="text" class="text" value=""/>
		<input type="button" class="btn">
	</div>
	<div class="login">
		<ul>
			<li><a href="music/regist.jsp" class="header_a2">注册</a></li>
			<li><a href="music/login.jsp" class="header_a">登录</a></li>
		</ul>
	</div>	
</div>

<div id="header_song">
	<ul>
		<li><a href="music/index.jsp" class="header_a">首页</a></li>
		<li><a href="javascript:;" class="header_a">歌手</a></li>
		<li><a href="javascript:;" class="header_a">专辑</a></li>
		<li><a href="javascript:;" class="header_a">排行榜</a></li>
	</ul>
</div>
<div id="login">
	<form id="formid"  name= "myform" method = 'post'  action = "<c:url value='/LoginServlet'/>" onsubmit = "return checkUser();" >
		<table  width="100%" border="0">
			<tr>
				<td align="right">用户名:</td>
				<td colspan="2"><input type="text" name="username" class="username"/></td>
				<td><p style="color:red">${message }</p></td>
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
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
</body>

</html>
