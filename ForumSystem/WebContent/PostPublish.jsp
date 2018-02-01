<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>发帖</title>
</head>

<body>
	<div>
		<table>
			<s:form action="Post_createPost">
				<tr>
					<td>帖子标题：</td>
					<td><s:textfield name="post.pcontent"></s:textfield></td>
				</tr>
				<tr>
					<td colspan="2"><s:submit value="创建"></s:submit></td>
				</tr>
			</s:form>
		</table>
	</div>
	<s:debug></s:debug>
</body>
</html>