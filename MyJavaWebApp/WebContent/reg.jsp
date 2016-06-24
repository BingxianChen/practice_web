<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>用户注册</h1>
	<hr>
	<form action="response.jsp" name="regform" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username"></td>
			</tr>
			 <tr>
				<td>爱好：</td>
				<td>
					<input type="checkbox" name="favourite" value="read">阅读
					<input type="checkbox" name="favourite" value="music">唱歌
					<input type="checkbox" name="favourite" value="movice">看电影
					<input type="checkbox" name="favourite" value="internet">上网
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<a href="request.jsp?username=孙彦珺">测试url传递参数</a>
</body>
</html>