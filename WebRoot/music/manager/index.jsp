<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
 
    <title>后台首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="music/manager/css/style.css" />
	<script type="text/javascript" src="music/manager/js/jquery-1.6.min.js"></script>
	<script type="text/javascript" src="music/manager/js/index.js"></script>
	<style type="text/css">
	body{
	
		background:gray;
	}
	</style>
	</head>

  
  
 <body>
<div class="nav-top">
	<span>后台管理系统</span>
    <div class="nav-topright">
        <span>您好：管理员</span><span>注销</span>
    </div>
</div>
<div class="nav-down">
	<div class="leftmenu1">
        <div class="menu-oc"><img src="music/manager/images/menu-all.png" /></div>
    	<ul>
        	<li>
            	<a class="a_list a_list1">歌曲管理</a>
                <div class="menu_list menu_list_first">
                	<a href="<c:url value='/music/manager/addsong.jsp'/>">添加歌曲</a>
                    <a href="#">删除歌曲</a>
                    <a href="#">修改歌曲</a>
                    <a href="#">查看歌曲</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list2">歌手管理</a>
                <div class="menu_list">
                	<a href="<c:url value='/music/manager/addsinger.jsp'/>">添加歌手</a>
                    <a href="#">删除歌手</a>
                    <a href="#">修改歌手</a>
                    <a href="#">查看歌手</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list3">用户管理</a>
                <div class="menu_list">
                	<a href="#">添加用户</a>
                    <a href="#">删除用户</a>
                    <a href="#">修改用户</a>
                    <a href="#">查看用户</a>
                </div>
            </li>
        
        </ul>
    </div>
    <div class="leftmenu2">
    	<div class="menu-oc1"><img src="music/manager/images/menu-all.png" /></div>
        <ul>
        	<li>
            	<a class="j_a_list j_a_list1"></a>
                <div class="j_menu_list j_menu_list_first">
                	
                	<a id="addsong" onclick="addsongs();">添加歌曲</a>
                    <a href="#">删除歌曲</a>
                    <a href="#">修改歌曲</a>
                    <a href="#">查看歌曲</a>
                </div>
            </li>
            <li>
            	<a class="j_a_list j_a_list2"></a>
                <div class="j_menu_list">
                	<a href="<c:url value='/music/manager/addsinger.jsp'/>">添加歌手</a>
                    <a href="#">删除歌手</a>
                    <a href="#">修改歌手</a>
                    <a href="#">查看歌手</a>
                </div>
            </li>
            <li>
            	<a class="j_a_list j_a_list3"></a>
                <div class="j_menu_list">
                	<a href="#">添加用户</a>
                    <a href="#">删除用户</a>
                    <a href="#">修改用户</a>
                    <a href="#">查看用户</a>
                </div>
            </li>
        </ul>
        
    </div>
    <div>
    	<iframe id="iframe" src="" width="1500px" height="800px"></iframe>
    </div>
  
</div>


</body>
<script type="text/javascript">
	function addsongs()
	{
		var iframe = document.getElementById("iframe");
		
		iframe.src="<c:url value='/music/manager/addsong.jsp'/>";
	}
	
	
</script>
</html>
