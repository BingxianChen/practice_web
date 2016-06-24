<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String username ="";
		String password ="";
		username = request.getParameter("username");
		password = request.getParameter("password");
		//如果用户名和密码输入正确
		if("孙彦珺".equals(username)&&"123456".equals(password)){
			session.setAttribute("loginUser", username);
			request.getRequestDispatcher("login_success.jsp").forward(request,response);
		}
		else{
			response.sendRedirect("login_failure.jsp");
		}
	%>
</body>
</html>