<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en-US">
  <head>
    <base href="<%=basePath%>">
    

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>500 - 对不起，服务器内部错误！- 音乐熊</title>
	<link rel="stylesheet" type="text/css" href="errorpages/css500/main.css">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
<body>
<div id="wrapper"><a class="logo" href="/"></a>
  <div id="main">
    <div id="header">
      <h1><span class="icon">!</span>500<span class="sub">Internal Server Error</span></h1>
    </div>
    <div id="content">
      <h2>服务器内部错误！</h2>
      <p>当您看到这个页面,表示服务器内部错误,此网站可能遇到技术问题,无法执行您的请求,请稍后重试,感谢您的支持!</p>
      <div class="utilities">
          <div class="input-container" style="font: 13px 'TeXGyreScholaRegular', Arial, sans-serif;color: #696969; text-shadow: 0 1px white;text-decoration: none;">
            <span id="totalSecond" style="color:red">5</span>秒后自动跳转…
          </div>
        <a class="button right" href="music/index.jsp" onClick="history.go(-1);return true;">返回...</a>
        <div class="clear"></div>
      </div>
    </div>
    <div id="footer">
      <ul>
        <li><a href="music/index.jsp">网站首页</a></li>

      </ul>
    </div>
  </div>
</div>
</body>
	<script language="javascript" type="text/javascript">
var second = document.getElementById('totalSecond').textContent;


if (navigator.appName.indexOf("Explorer") > -1)
{
second = document.getElementById('totalSecond').innerText; 
} else
{
second = document.getElementById('totalSecond').textContent; 
}




setInterval("redirect()", 1000); 
function redirect()
{
if (second < 0)
{


location.href = 'music/index.jsp'; 
} else
{
if (navigator.appName.indexOf("Explorer") > -1)
{
document.getElementById('totalSecond').innerText = second--; 
} else
{
document.getElementById('totalSecond').textContent = second--; 
}
}
}
</script>
</html>
