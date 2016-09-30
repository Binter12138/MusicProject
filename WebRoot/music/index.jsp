<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>MyMusic音乐熊</title>
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/index.css" type="text/css" rel="Stylesheet" />
	  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

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
			<li><a href="music/regist.jsp" class="header_a2">注册</a></li>
			<li><a href="music/login.jsp" class="header_a">登录</a></li>
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
<div id="plate1">
	<div class="wrap">
		<h1>-------新歌首发-------</h1>
		<div class="choose">
			<ul>
				<li><a href="javascript:;" class="choose1">全部</a></li>
				<li><a href="javascript:;" class="choose2">华语</a></li>
				<li><a href="javascript:;" class="choose3">欧美</a></li>
				<li><a href="javascript:;" class="choose4">韩国</a></li>
				<li><a href="javascript:;" class="choose5">日本</a></li>
			</ul>
		</div>
		<div class = "slide">
			<ul>
				<li><a href="#"><img src="music/images/1.png" class="1"></a></li>
				<li><a href="#"><img src="music/images/5.png" class="2"></a></li>
				<li><a href="#"><img src="music/images/9.png" class="3"></a></li>
				<li><a href="#"><img src="music/images/13.png" class="4"></a></li>
				<li><a href="#"><img src="music/images/17.png" class="5"></a></li>
			</ul>
			<div class="arrow">
				<a href="javascript:;" class="prev"></a>
				<a href="javascript:;" class="next"></a>
			</div>	
		</div>
	</div>
</div>
<div id="plate2">
	<h1>-------热门歌手-------</h1>
	<div class="flash">
		<div class="con">
			<ul>
				<li class="current ti1">
					<h3>华语</h3>
					<div class="show">
						<a href="javascript:;"><img src="music/images/1.png"/></a>
						<a href="javascript:;"><img src="music/images/2.png"/></a>
						<a href="javascript:;"><img src="music/images/3.png"/></a>
						<a href="javascript:;"><img src="music/images/4.png"/></a>
					</div>                 
				</li>
				<li class="ti2">
					<h3>英语</h3>
					<div class="show">
						<a href="javascript:;"><img src="music/images/5.png"/></a>
						<a href="javascript:;"><img src="music/images/6.png"/></a>
						<a href="javascript:;"><img src="music/images/7.png"/></a>
						<a href="javascript:;"><img src="music/images/8.png"/></a>
					</div>
				</li>
				<li class="ti3">
					<h3>日语</h3>
					<div class="show">
						<a href="javascript:;"><img src="music/images/1.png"/></a>
						<a href="javascript:;"><img src="music/images/3.png"/></a>
						<a href="javascript:;"><img src="music/images/5.png"/></a>
						<a href="javascript:;"><img src="music/images/7.png"/></a>
					</div>
				</li>
				<li class="ti4">
					<h3>韩语</h3>
					<div class="show">
						<a href="javascript:;"><img src="music/images/2.png"/></a>
						<a href="javascript:;"><img src="music/images/4.png"/></a>
						<a href="javascript:;"><img src="music/images/6.png"/></a>
						<a href="javascript:;"><img src="music/images/8.png"/></a>
					</div>
				</li>
			</ul>
		</div>
	</div>
</div>
<div id = "plate3">
	<h1>-------热门歌曲-------</h1>
	<div class="cs">
		<ul>
			<li class="cs1"><a href="javascript:;">全部</a></li>
			<li class="cs2"><a href="javascript:;">内地</a></li>
			<li class="cs3"><a href="javascript:;">港台</a></li>
			<li class="cs4"><a href="javascript:;">欧美</a></li>
			<li class="cs5"><a href="javascript:;">日韩</a></li>
		</ul>
	</div>
	<div class="table" >
		<dl>
			<dt><a href="javascript:;"><img src="music/images/5.png"/></a><div class="txt"></div></dt>
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/6.png"/></a><div class="txt"></div></dt>
			
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/7.png"/></a><div class="txt"></div></dt>
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/8.png"/></a><div class="txt"></div></dt>
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/9.png"/></a><div class="txt"></div></dt>
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/10.png"/></a><div class="txt"></div></dt>
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/11.png"/></a><div class="txt"></div></dt>
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/12.png"/></a><div class="txt"></div></dt>
			<dd><p><a href="javascript:;">国11</a></p></dd>
		</dl>
		
	</div>
</div>
<div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
<script type="text/javascript" src="music/js/index.js"></script>

</body>

</html>
