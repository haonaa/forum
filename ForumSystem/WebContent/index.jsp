<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Test</title>
</head>

<body>
	<h1>Test Successful !!</h1>
	
	<h3 style="color: red;">
		<s:property value="post.pcontent"></s:property>
	</h3>
	<s:debug></s:debug>
</body>
</html>