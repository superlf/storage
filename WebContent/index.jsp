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
		<h2>胖先生的个人博客:http://pangsir8983.github.io</h2>
		<h2>电话:15584123623</h2>
		<h2>QQ: 83604162</h2>
		
	</body>
</html>