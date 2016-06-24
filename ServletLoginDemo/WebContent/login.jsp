<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登陆界面</h1>
	<hr>
	<div id="box">
		<form action="servlet/LoginServlet" method="post">
			<p class="main">
				<lable>用户名：</lable>
				<input type="text" name="username" value=""/>
				<lable>密码：</lable>
				<input type="password" name="password" valud="">
			</p>
			<p class="space">
				<input type="submit" value="登陆" />
			</p>
		</form>
	</div>
</body>
</html>