<%@page import="controller.HelloController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Servlet</title>
</head>
<body>
	<p>Đây là một web servlet</p>
	<% 
		String ip = request.getRemoteAddr();
		int x = 10;
		Object obj = request.getAttribute("msg"); //tạo một đối tượng với dữ liệu từ key msg
		String s = (String) obj; //ép kiểu vì key msg là một đối tượng kiểu string
	%>

	<div><%=ip %></div>
	<%=x %>
	<%= s %>
</body>
</html>