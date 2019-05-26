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
		<title>管理系统</title>
        <link rel="stylesheet" href="css/admin/css2/admin.css" type="text/css"/>
        <link href="css/admin/css/Font-Awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="js/admin/js/jquery.js"></script>
        <script type="text/javascript" src="js/admin/js/admin.js"></script>
	</head>
	<body>
        <div class="backAdmin">
        <div class="top">
        <!-- logo  -->
        <div class="topleft">
            <a target="_top"><img src="img/admin/images/logo.png" title="系统首页"/></a>
        </div>

        <!-- 首页导航 -->
            <ul class="nav">
                <li><a href="default.html" target="rightFrame" class="selected"><img src="img/admin/images/icon01.png" title="工作台"/>
                    <h2>工作台</h2></a>
                </li>
                <li><a href="javascript:;" target="rightFrame"><img src="img/admin/images/icon02.png" title="模型管理"/>
                    <h2>模型管理</h2>
                </a>
                </li>
                <li><a href="imglist.html" target="rightFrame"><img src="img/admin/images/icon03.png" title="模块设计"/>
                    <h2>模块设计</h2></a>
                </li>
                <li><a href="tools.html" target="rightFrame"><img src="img/admin/images/icon04.png" title="常用工具"/>
                    <h2>常用工具</h2></a>
                </li>
                <li><a href="computer.html" target="rightFrame"><img src="img/admin/images/icon05.png" title="文件管理"/>
                    <h2>文件管理</h2></a>
                </li>
                <li><a href="tab.html" target="rightFrame"><img src="img/admin/images/icon06.png" title="系统设置"/>
                    <h2>系统设置</h2></a>
                </li>
            </ul>

            <div class="topright">
                <ul>
                 
                    <li><a href="javascript:;" id="loginOut">安全退出</a></li>
                </ul>
    
                <div class="user">
                    <img src="img/admin/images/user_photo.png" alt="用户头像"/>
                    <span>码迷码迷吽</span>
                    <b>5</b>
                </div>
            </div>
        </div>

        <div class="left">
            <div class="lefttop">
                <i class="icon-cloud icon-large pull-left icon-border"></i>
                <span>信息导航</span>
            </div>

            <dl class="leftmenu">

                <dd>
                    <div class="title">
                        <i class="icon-gears icon-large pull-left icon-border"></i>
                        <span>模版使用</span>
                    </div>
                    <ul class="menuson">
                        <li class="active"><i class="icon-home"></i><a href="index.html" target="rightFrame">首页模版</a></li>
                        <li><i class="icon-table"></i><a href="01.基本表格操作.html" target="rightFrame">01.基本表格模版</a></li>
                        <li><i class="icon-github-sign"></i><a href="imgtable.html" target="rightFrame">图片数据表</a></li>
                        <li><i class="icon-html5"></i><a href="form.html" target="rightFrame">添加编辑</a></li>
                        <li><i class="icon-windows"></i><a href="imglist.html" target="rightFrame">图片列表</a></li>
                        <li><i class="icon-google-plus"></i><a href="imglist1.html" target="rightFrame">自定义</a></li>
                        <li><i class="icon-android"></i><a href="tools.html" target="rightFrame">常用工具</a></li>
                        <li><i class="icon-css3"></i><a href="filelist.html" target="rightFrame">信息管理</a></li>
                        <li><i class="icon-skype"></i><a href="tab.html" target="rightFrame">Tab页</a></li>
                        <li><i class="icon-weibo"></i><a href="error.html" target="rightFrame">404页面</a></li>
                    </ul>
                </dd>
                <dd>
                    <div class="title">
                        <i class="icon-calendar icon-large pull-left icon-border"></i>
                        <span>基本表格</span>
                    </div>
                    <ul class="menuson">
                        <li>
                            <i class="icon-list"></i>
                            <a href="01.表格基本样式.html" target="rightFrame">表格基本样式</a>
                        </li>
                        <li>
                            <i class="icon-list"></i>
                            <a href="02.图像基本样式.html" target="rightFrame">图片表格样式</a>
                        </li>
                        <li>
                            <i class="icon-list"></i>
                            <a href="03.图像展示样式.html" target="rightFrame">图像展示样式</a>
                        </li>
                        <li>
                            <i class="icon-list"></i>
                            <a href="04.图像按钮操作样式.html" target="rightFrame">图像按钮操作样式</a>
                        </li>
                        <li>
                            <i class="icon-list"></i>
                            <a href="05.课程列表.html" target="rightFrame">课程列表</a>
                        </li>
                        <li>
                            <i class="icon-list"></i>
                            <a href="06.文件列表.html" target="rightFrame">文件列表</a>
                        </li>
                        <li>
                            <i class="icon-list"></i>
                            <a href="07.我的电脑.html" target="rightFrame">我的电脑</a>
                        </li>
                    </ul>
                </dd>


                <dd>
                    <div class="title">
                        <i class="icon-user-md icon-large pull-left icon-border"></i>
                        <span>流程方面</span>
                    </div>
                    <ul class="menuson">
                        <li><i class="icon-list"></i><a href="08.流程导向.html" target="rightFrame">流程图</a></li>
                        <li><i class="icon-adn"></i><a href="09.xi.html" target="rightFrame">项目申报</a></li>
                        <li><i class="icon-apple"></i><a href="search.html" target="rightFrame">档案列表显示</a></li>
                        <li><i class="icon-camera-retro"></i><a href="tech.html" target="rightFrame">技术支持</a></li>
                    </ul>
                </dd>


                <dd>
                    <div class="title">
                        <i class="icon-edit icon-large pull-left icon-border"></i>
                        <span>编辑器</span>
                    </div>
                    <ul class="menuson">
                        <li><i class="icon-list"></i><a href="#">自定义</a></li>
                        <li><i class="icon-list"></i><a href="#">常用资料</a></li>
                        <li><i class="icon-list"></i><a href="#">信息列表</a></li>
                        <li><i class="icon-list"></i><a href="#">其他</a></li>
                    </ul>
                </dd>


                <dd>
                    <div class="title">
                        <i class="icon-calendar icon-large pull-left icon-border"></i>
                        <span>插件说明</span>
                    </div>
                    <ul class="menuson">
                        <li><i class="icon-list"></i><a href="demo/layer01.html" target="rightFrame">Layer的简单入门</a></li>
                        <li><i class="icon-list"></i><a href="#">常用资料</a></li>
                        <li><i class="icon-list"></i><a href="#">信息列表</a></li>
                        <li><i class="icon-list"></i><a href="#">其他</a></li>
                    </ul>
                </dd>

            </dl>


        </div>
        <div class="right">
            <div class="inner">
                <!-- 设置iframe -->
                <iframe id="rightFrame" name="rightFrame" class="mainIframe" scrolling="no" frameborder="0" src="index.html"
                        onload="initIframe()"></iframe>
            </div>
        </div>
        <div class="bottom">
            <span>superlfx。仅供学习交流，请勿用于任何商业用途</span>
            <i> 版权所有 @https://github.com/superlf </i>
        </div>
    </div>
        
        
                
		<%-- <h2>${sessionScope.session_user.userName }</h2>
        <a href="javascript:;" id="loginOut">安全退出</a> --%>		
        
     
        <script type="text/javascript" src="js/admin/js/jquery.js"></script>
        <script type="text/javascript" src="js/admin/js/admin.js"></script>
        <script type="text/javascript" src="js/js/login.js"></script>
	</body>
</html>