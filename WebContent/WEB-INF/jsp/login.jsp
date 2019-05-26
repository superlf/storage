<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	pageContext.setAttribute("path", path);
	pageContext.setAttribute("basePath", basePath);
%>
<!DOCTYPE HTML>
<html>
	<head>

		<base href="basePath">
		<meta charset="UTF-8">
		<title>H5模版:</title>
	</head>
	<body>
		<h2>登陆页面</h2>
        <form action="sys/login" method="post">
            <input type="text" name = "account" id = "account">
            <input type="password" name = "password" id = "password">
            <input type="submit" value="登陆" >
        </form>
		
	</body>
</html>