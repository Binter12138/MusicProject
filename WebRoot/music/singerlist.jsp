<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>歌手</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/songers.css" type="text/css" rel="Stylesheet" />

  </head>
  
  <body>
  
	<div id="singers_model">
	<div id="music_songers">
		<center><h1>———————热门歌手——————</h1></center>
		<dl class="singer_list_txt">				
			<c:forEach items="${singername }" var="s">
			<dd class="singer_txt">
			
			
				<div>

					
					<center><a href="<c:url value='/SongServlet?method=viewSong&singerName=${s.singername }&image=${s.singerimage }'/>"><img src="<c:url value='/music/files/${s.singerimage }'/>"/></a></center>
					
					<center><h3><a id="sname" href="<c:url value='/SongServlet?method=viewSong&singerName=${s.singername }&image=${s.singerimage }'/>">${s.singername }</a></h3></center>
					
				</div>
				
			</dd>					
			</c:forEach>
		</dl>


		<center class="bottom_foot">
			<a href="javascript:;" >1</a>
			<a href="javascript:;" >2</a>
			<a href="javascript:;" >3</a>
			<a href="javascript:;" >4</a>
			<a href="javascript:;" >5</a>
		</center>
	</div>
</div>
<div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
  </body>
</html>
