<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>开始挑战javaWeb</h1>
	<hr>
	<!--HTML注释，客户端可见-->
	<%--jsp注释，客户端不可见--%>
	<%
		//脚本注释
		/*
			多行脚本注释
		*/
		out.println("这是脚本语言");
	%>
	<%!
		String s = "孙彦珺";
		int add(int x,int y)
		{
			return x+y;
		}
	%>
	<br>
	你好么？<%=s%><br>
	x+y=<%=add(10,5)%><br>
	
</body>
</html>