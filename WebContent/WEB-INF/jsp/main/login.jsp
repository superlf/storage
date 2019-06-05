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
		<base href="${basePath}">
		<meta charset="UTF-8">
		<title>欢迎登录后台管理系统</title>
        <link href="css/admin/css/login.css" rel="stylesheet" type="text/css"/>
        <script language="JavaScript" src="js/admin/js/jquery.js"></script>
        <script language="JavaScript" src="js/commons/login.js"></script>
        <script language="javascript">
            $(function () {
                $('.loginbox').css({'position': 'absolute', 'left': ($(window).width()-692)/2});
                $(window).resize(function () {
                    $('.loginbox').css({'position': 'absolute', 'left': ($(window).width()-692)/2});
                })
            });
        </script>
	</head>
	<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
	    <!--导航条 -->
        <div class="logintop">
            <span>欢迎登陆后台管理系统</span>
            <ul><li>superlfx@163.com</li></ul>
        </div>
        <div class="loginbody">
        <span class="systemlogo"></span>
            <form action="sys/login" method="post" id="loginForm">
                <div class="loginbox loginbox3">
                    <ul>
                        <li>
                            <input id="account" name="account" type="text" class="loginuser" value="wukong" placeholder="请输入账号信息" onfocus="true"/>
                        </li>
                        <li>
                            <input id="password" name="password" type="password" class="loginpwd"value="wukong" placeholder="请输入密码"/>
                        </li>
    <!--                     <li class="yzm">
                        <span>
                            <input name="code" id="code" type="text" placeholder="请输入验证码信息"/>
                        </span>应设置img标签,显示验证码
                            <cite>PANG</cite>
                        </li> -->
                        <li>
                            <input type="submit" class="loginbtn" value="登录"/>
                            <label style="color: darkred;"></label>
                        </li>
                    </ul>
                </div>
            </form>
        </div>
        <div class="loginbm">版权所有@2019<a href="https://github.com/superlfx">superlfx </a> 仅供学习交流，勿用于任何商业用途</div>
	</body>
</html>