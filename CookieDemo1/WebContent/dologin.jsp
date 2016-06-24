<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" import="java.net.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登陆成功</h1>
	<hr>
	<br>
	<br>
	<br>
	<%
		request.setCharacterEncoding("utf-8");
		//首先判断用户是否选择了记住登陆状态
		String[] isUseCookie = request.getParameterValues("isUseCookie");
		if(isUseCookie!=null&&isUseCookie.length>0){
			//把用户名和密码保存在Cookie对象里面
			String username = URLEncoder.encode(request.getParameter("username"), "utf-8");
			//使用URLEncoder解决无法在Cookie当中保存中文字符串问题
			String password = URLEncoder.encode(request.getParameter("password"),"utf-8");
			
			Cookie usernameCookie = new Cookie("userName",username);
			Cookie passwordCookie = new Cookie("passWord",password);
			//设置最大生存期限为10天
			usernameCookie.setMaxAge(864000);
			passwordCookie.setMaxAge(864000);
			response.addCookie(usernameCookie);
			response.addCookie(passwordCookie);
		}else{
			Cookie[] cookies = request.getCookies();
			if(cookies!=null&&cookies.length>0){
				for(Cookie c:cookies){
					if(c.getName().equals("userName")||c.getName().equals("passWord")){
						c.setMaxAge(0);//设置Cookie失效
						response.addCookie(c);//重新保存。
					}
				}
			}
		}
	%>
	<a href="users.jsp" target="_blank">查看用户信息</a>
</body>
</html>