<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setAttribute("requestName", "requestValue");
    request.getSession().setAttribute("sessionName", "sessionValue");
    request.getSession().getServletContext().setAttribute("contextName", "contextValue");
    request.setAttribute("requestName", "requestValue");
    request.removeAttribute("requestName");
    
    request.getSession().setAttribute("currentUser", new com.imooc.entity.User());
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这是初始化值的界面</h1>
	<hr>
	<button onclick="location.href='<%=request.getContextPath()%>/init.jsp'">Init</button>
	<button onclick="location.href='<%=request.getContextPath()%>/destory.jsp'">Destory</button>
</body>
</html>