<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Test</title>
<style type="text/css">
	body{
		margin: 0px;
		height: 0px;
	}
	.toph1{
		float: left;
	}
	.topp{
		float: right;
	}
	.topdiv{
		width: 100%;
		border: 1px solid;
		height: auto;
		float: left;
	}
	.gamebody{
		font-size: 36px;
		color: green;
		font-weight: 600;
	}
	
</style>
</head>

<body>
	<div class="topdiv">
		<span class="toph1">
			<span class="gamebody">GameBody</span>
			 综合游戏论坛
		</span>
		<span class="topp">
			<a href="login.jsp">登录</a>/<a href="register.jsp">注册</a>
		</span>
	</div>
	
	<s:debug></s:debug>
</body>
</html>