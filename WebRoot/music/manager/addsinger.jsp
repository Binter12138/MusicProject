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
    
    <title>MyMusic添加歌手</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/login.css" type="text/css" rel="Stylesheet" />

	<style type="text/css">
		
		#singers{
			width:500px;
			height:30px;
		}
		tr td{
			padding-top:20px;
			
		}
		table{
		algin:center;
		margin:auto;
		}
		#subsinger{
			width:100px;
			height:30px;
			background:green;
		
		}
		
	#addsinger{
		margin-top:50px;
	}
	#rd{
		margin-left:50px;
	
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
			<input type="text" class="text" value=""/>
			<input type="button" class="btn">
		</div>
		<div class="login">
			<ul>
				<li><a href="regist.html" class="header_a2">注册</a></li>
				<li><a href="login.html" class="header_a">登入</a></li>
			</ul>
		</div>	
	</div>
	
	<div id="header_song">
		<ul>
			<li><a href="index.html" class="header_a">首页</a></li>
			<li><a href="javascript:;" class="header_a">歌手</a></li>
			<li><a href="javascript:;" class="header_a">专辑</a></li>
			<li><a href="ranking.html" class="header_a">排行榜</a></li>
		</ul>
	</div>
	<div id="addsinger">
		<form  action="<c:url value='/SingerServlet?method=addSinger'/>" id="formid"  name= "myform" method = 'post' onsubmit = "return checkUser();" enctype="multipart/form-data">
			<table>
				<tr>
					<td>歌手</td>
					<td><input type="text" id="singers" name="singername"/></td>
					<td><p style="color:red">${addsingername }</p></td>
				</tr>
				<tr>
					<td>性别</td>
					<td><input type="radio" id="rd" name="sex" value="男"/>男
						<input type="radio" id="rd" name="sex" value="女"/>女
					</td>
				
				</tr>
				<tr>
					<td>简介</td>
					<td><input type="text" id="singers" name="singerinfo"/></td>
				</tr>
				<tr>
					<td>地域</td>
					<td><input type="radio" id="rd" value="华语" name="singerregion"/>华语
						<input type="radio" id="rd" value="欧美" name="singerregion"/>欧美
						<input type="radio" id="rd" value="日韩" name="singerregion"/>日韩
					</td>
				</tr>
				<tr>
					<td>关注度</td>
					<td><input type="text"  id="singers" name="singerattention"/></td>
				
				</tr>
				<tr>
					<td>图片</td>
					<td><input type="file" id="singers" value="选择图片" name="singerimage"/></td>
				
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" id="subsinger" value="保存"/></td>
					
				</tr>
				
			</table>
			
		</form>
	
	
	</div>
  <script type="music/text/javascript" src="music/js/jquery.min.js"></script>
	<script type="music/text/javascript" src="music/js/header.js"></script>
  </body>
</html>
