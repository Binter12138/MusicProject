<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<html>
<head>
 <base href="<%=basePath%>">
<title>MyMusic注册</title>
<link href="music/css/header.css" type="text/css" rel="Stylesheet" />
<link href="music/css/regist.css" type="text/css" rel="Stylesheet" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<script type="text/javascript">
		function changeImage()
		{
			var img = document.getElementById("verCode");
			img.src="<c:url value='/VerCodeServlet'/>?xxx="+new Date().getTime();
		};
		function checkpassword()
		{
			var userpassword = document.getElementById("userpassword");
			var errorpassword = document.getElementById("errorpassword");
			if(userpasswrod.value=="" || userpassword.value==null){
				
				errorpassword.innerHTML = "密码不能为空";
			}else if(userpassword.value.length<6 || userpassword.value.length>20){
				errorpassword.innerHTML="密码要在6~20数字或字母";
			}
			else{
				errorpassword.innerHTML = "<img src='music/images/dagou.png'/>";
				
			}
		};
		function createXMLHttpRequest() {
			try {
				return new XMLHttpRequest();//大多数浏览器
			} catch (e) {
				try {
					return ActvieXObject("Msxml2.XMLHTTP");//IE6.0
				} catch (e) {
					try {
						return ActvieXObject("Microsoft.XMLHTTP");//IE5.5及更早版本	
					} catch (e) {
						
						throw e;
					}
				}
			}
		};

	
		window.onload = function() {
			// 获取文本框，给它的失去焦点事件注册监听
			var userEle = document.getElementById("userEle");
			var emailEle = document.getElementById("emailEle");
			var userpassword = document.getElementById("userpassword");
			
			
			
			function checkpassword()
			{
				var userpassword = document.getElementById("userpassword");
				var errorpassword = document.getElementById("errorpassword");
				if(userpasswrod.value=="" || userpassword.value==null){
					
					errorpassword.innerHTML = "密码不能为空";
				}else if(userpassword.value.length<6 || userpassword.value.length>20){
					errorpassword.innerHTML="密码要在6~20数字或字母";
				}
				else{
					errorpassword.innerHTML = "<img src='music/images/dagou.png'/>";
					
				}
			};
			emailEle.onblur = function(){
				var xmlHttp = createXMLHttpRequest();
				//2.打开连接
				xmlHttp.open("POST", "<c:url value='/RegistServlet'/>", true);
				//3.设置请求头：Content-Type
				xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
				//4.发送请求，给出请求体
				xmlHttp.send("email=" + emailEle.value+"&action=checkUserEmail");
				
				//5.给xmlHttp的onreadystatechange事件注册监听
				xmlHttp.onreadystatechange = function() {
					if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {//双重判断
						
						var text = xmlHttp.responseText;
						var s = document.getElementById("errorEmail");
						var reg = /^(\w+)@(\w+)(\.)(\w+)$/;
						 if(emailEle.value =="" || emailEle.value== null){
								s.innerHTML = "邮箱不能为空";

								} 
							 else if(!emailEle.value.match(reg))
							 {
							 	s.innerHTML = "邮箱格式错误";
							 
							 
							 }
						 
							 else if(text == "true")
							 	{
							 
								s.innerHTML = "<img src='music/images/dagou.png'/>";
								}
						 	else if(text == "false")
						 		{
								s.innerHTML = "邮箱已经被注册";
								}
						 	
					}
				
				};
			};
			userEle.onblur = function() {
				
				
				//1.得到异步对象
				var xmlHttp = createXMLHttpRequest();
				//2.打开连接
				xmlHttp.open("POST", "<c:url value='/RegistServlet'/>", true);
				//3.设置请求头：Content-Type
				xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
				//4.发送请求，给出请求体
				xmlHttp.send("username=" + userEle.value+"&action=checkUserName");
				
				//5.给xmlHttp的onreadystatechange事件注册监听
				xmlHttp.onreadystatechange = function() {
					if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {//双重判断
						
						var text = xmlHttp.responseText;
						var s = document.getElementById("errorp");
						 if(userEle.value =="" || userEle.value== null){
								s.innerHTML = "用户名不能为空";

								} 
							 else if(userEle.value.length>10)
								{
									s.innerHTML = "用户名过长1~10之间";
								
								}					 
							 else if(text == "true")
							 	{
							 
								s.innerHTML = "<img src='music/images/dagou.png'/>";
								}
						 	else if(text == "false")
						 		{
								s.innerHTML = "用户已经被注册";
								}
						
					}
				
				};
			};
		};

	</script>
</head>
<body>


<div id="header_song">
	<ul>
		<li><a href="music/index.jsp" class="header_a">首页</a></li>
		<li><a href="javascript:;" class="header_a">歌手</a></li>
		<li><a href="javascript:;" class="header_a">专辑</a></li>
		<li><a href="javascript:;" class="header_a">排行榜</a></li>
	</ul>
</div>
<div id="registered">
	<form id="formid"  name= "myform" method = 'post'  action = "<c:url value='/RegistServlet'/>" onsubmit = "return checkUser();" >
	<input type="hidden" name="action" value="regist" />
		<table  width="100%" border="0">
			<tr>
				<td align="right">用户名:</td>
				<td colspan="2"><input type="text" name="username" id="userEle" class="username" value="${user.username }"/></td>
				<td style="color:red"><p id="errorp"></p></td>
			</tr>
			<tr>
				<td align="right">密码:</td>
				<td colspan="2"><input type="password" name="password" id="userpassword" class="passwords"  value="${user.password }"/></td>
				<td class="tis" style="color:red"><p id="errorpassword"></p></td>
			</tr>
			<tr>
				<td align="right">确认密码:</td>
				<td colspan="2"><input type="password" name="repassword" class="psw" value="${user.repassword }"/></td>
				<td class="mtis" style="color:red"><p id="errorrepassword"></td>
			</tr>
			<tr>
				<td align="right">性别:</td>
				<td colspan="2" class="sex">
					<input type="radio" name="sex" value="男" /><div class="man"></div>
					<input type="radio" name="sex" value="女" /><div class="girl"></div>
				</td>
				<td class="tis"></td>
			</tr>
			<tr>
				<td align="right">邮箱:</td>
				<td colspan="2"><input type="text" name="email" id="emailEle" class="username" value="${user.email }"/></td>
				<td style="color:red"><p id="errorEmail"></p></td>
			</tr>
			<tr>
				<td align="right">出生日期:</td>
				<td colspan="2" class="sex">
					<select name="YYYY" id="yy">
						<option value="" class="data">请选择 年</option>
					</select>
					<select name="MM" id="mm">
						<option value="" class="data">选择 月</option>
					</select>
					<select name="DD" id="dd">
						<option value="" class="data">选择 日</option>
					</select>
				</td>
				<td class="tis"></td>
			</tr>
			<tr>
				<td align="right">验证码:</td>
				<td><input type="text" name="vercode" class="vft"/></td>
				<td><img width="80px" id="verCode" src="<c:url value='/VerCodeServlet'/>" border="1"/><a href="javascript:changeImage()">换一张</a></td>
				<td class="tis" style="color:red"> ${message }</td>
			</tr>
			<tr>
				<td> </td>
				<td colspan="2"> <input type="submit" value="注册" class="btn2"  /></td>
				<td class="tis" > </td>
			</tr>
		</table>
</form>
</div>
<div id="footer">
	<div>本网站属于私人定制网站----由cy、czb、ltj、lzc制作而成</div>
</div>
<script type="text/javascript" src="music/js/jquery.min.js"></script>
<script type="text/javascript" src="music/js/header.js"></script>
<script type="text/javascript" src="music/js/regist.js"></script>


</body>
</html>