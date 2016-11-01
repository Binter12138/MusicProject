<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>


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
				<li><a href="<c:url value='/SongServlet?method=viewSong&singerName=五月天'/>"><img src="music/images/1.jpg" class="1"></a></li>
				<li><a href="<c:url value='/SongServlet?method=viewSong&singerName=听见'/>"><img src="music/images/5.jpg" class="2"></a></li>
				<li><a href="<c:url value='/SongServlet?method=view&singerName=One Direction'/>"><img src="music/images/9.jpg" class="3"></a></li>
				<li><a href="javascript:;"><img src="music/images/13.jpg" class="4"></a></li>
				<li><a href="javascript:;"><img src="music/images/17.jpg" class="5"></a></li>
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
						<div></div>
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=薛之谦'/>"><img class="img" src="music/images/xuezhiqian.jpg" title="薛之谦"/></a>
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=林宥嘉'/>"><img class="img" src="music/images/linyoujia.jpg" title="林宥嘉"/></a>
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=陈奕迅'/>"><img class="img" src="music/images/chenyixun.jpg" title="陈奕迅"/></a>
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=邓紫棋'/>"><img class="img" class="img" src="music/images/dengziqi.jpg" title="邓紫棋"/></a>
					</div>                 
				</li>
				<li class="ti2">
					<h3>英语</h3>
					<div class="show">
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=Rihanna'/>"><img class="img" src="music/images/Riha.jpg" title="Rihanna"/></a>
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=Katy Perry'/>"><img class="img" src="music/images/kp.jpg" title="Katy Perry"/></a>
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=Alan Walker'/>"><img class="img" src="music/images/aw.jpg" title="Alan Walker"/></a>
						<a href="<c:url value='/SongServlet?method=viewSong&singerName=Justin Bieber'/>"><img class="img" src="music/images/jb.jpg" title="Justin Bieber"/></a>
					</div>
				</li>
				<li class="ti3">
					<h3>日语</h3>
					<div class="show">
						<a href="javascript:;"><img class="img" src="music/images/bqb.jpg" title="滨崎步"/></a>
						<a href="javascript:;"><img class="img" src="music/images/cmmy.jpg" title="倉木麻衣"/></a>
						<a href="javascript:;"><img class="img" src="music/images/glkz.jpg" title="高梨康治"/></a>
						<a href="javascript:;"><img class="img" src="music/images/51.jpg" title="久石让"/></a>
					</div>
				</li>
				<li class="ti4">
					<h3>韩语</h3>
					<div class="show">
						<a href="javascript:;"><img class="img" src="music/images/qzl.jpg" title="权志龙"/></a>
						<a href="javascript:;"><img class="img" src="music/images/xl.jpg" title="孝琳"/></a>
						<a href="javascript:;"><img class="img" src="music/images/xy.jpg" title="泫雅"/></a>
						<a href="javascript:;"><img class="img" src="music/images/sl.jpg" title="胜利"/></a>
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
			<li class="cs3"><a href="javascript:;">韩国</a></li>
			<li class="cs4"><a href="javascript:;">欧美</a></li>
			<li class="cs5"><a href="javascript:;">日本</a></li>
		</ul>
	</div>
	<div class="table" >
		<dl>
		
			<dt><a href="javascript:;"><img src="music/images/24.jpg"/><p class="txt"></p></a></dt>
			<dd><p><a class="musicsong" href="javascript:;">模特</a></p><a class="musicsinger" href="javascript:;">李荣浩</a></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/28.jpg"/><p class="txt"></p></a></dt>
			
			<dd><p><a class="musicsong" href="javascript:;">绅士</a></p><a class="musicsinger" href="javascript:;">薛之谦</a></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/47.jpg"/><p class="txt"></p></a></dt>
			<dd><p><a class="musicsong" href="javascript:;">おしえてナウカ、夢みるペチカ</a></p><a class="musicsinger" href="javascript:;">花澤香菜</a></dd>
		</dl>
		<dl>
	
		
			<dt><a href="javascript:;"><img src="music/images/26.jpg"/><p class="txt"></p></a></dt>
			<dd><p><a class="musicsong" href="javascript:;">初爱</a></p><a class="musicsinger" href="javascript:;">杨宗纬</a></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/39.jpg"/><p class="txt"></p></a></dt>
			<dd><p><a class="musicsong" href="javascript:;">See You Again</a></p><a class="musicsinger" href="javascript:;">查理</a></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/40.jpg"/><p class="txt"></p></a></dt>
			<dd><p><a class="musicsong" href="javascript:;">Only Girl</a></p><a class="musicsinger" href="javascript:;">蕾哈娜</a></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/51.jpg"/><p class="txt"></p></a></dt>
			<dd><p><a class="musicsong" href="javascript:;">天空之城</a></p><a class="musicsinger" href="javascript:;">久石譲</a></dd>
		</dl>
		<dl>
			<dt><a href="javascript:;"><img src="music/images/22.jpg"/><p class="txt"></p></a></dt>
			<dd><p><a class="musicsong" href="javascript:;">It's Love</a></p><a class="musicsinger" href="javascript:;">张碧晨</a></dd>
		</dl>
		
	</div>
</div>
<div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
<script type="text/javascript" src="music/js/index.js"></script>
<script>
//热门歌手事件
$(".img").click(function(){
	$(this).parent().attr("href","<c:url value='/SongServlet?method=viewSong&singerName='/>"+$(this).attr("title"));
});
</script>
</body>


</html>
