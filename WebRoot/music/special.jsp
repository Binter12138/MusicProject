<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>专辑</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
	<link href="music/css/special.css" type="text/css" rel="Stylesheet" />

  </head>
  
  <body>

	<div id = "plate3">
	<center><h1>———————全部专辑——————</h1></center>
	<div class="table" >
	
	<c:forEach items="${album }" var="al">
	
		<dl>
			<dt><a href="<c:url value='/SongServlet?method=viewalbumsong&albumname=${al.albumname }'/>"><img src="<c:url value='/music/files/${al.albunimage }'/>"/><p class="txt"></p></a></dt>
			<dd><a href="<c:url value='/SongServlet?method=viewalbumsong&albumname=${al.albumname }'/>">${al.albumname }</a></dd>
			<dd class="singer"><a href="javascript:;">${al.singername }</a></dd>
			
		</dl>
	
	</c:forEach>
	
		
	</div>

</div>
<div id = "plate3_1">
		<img src="music/images/kkkbbb.png" style="width:1200px;height:20px;opacity:0;"/>
		<center class="bottom_foot">
			<a href="javascript:;" ></a>
			<a href="javascript:;" >1</a>
			<a href="javascript:;" >2</a>
			<a href="javascript:;" >3</a>
			<a href="javascript:;" >4</a>
			<a href="javascript:;" >5</a>
			<a href="javascript:;" >&gt</a>
		</center>
	</div>

<div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
<script type="text/javascript" src="music/js/special.js"></script>

  </body>
</html>
