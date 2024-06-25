<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Detail</title>
</head>
<body>
	<%
		Object obj = request.getAttribute("person"); //lấy ra
		Person p = (Person) obj;
		int id = p.getId();
		String name = p.getName();
	%>
	<h2>Thong tin dang ky</h2>
	<p>
		ID:
		<%=id %></p>
	<p>
		Name:
		<%=name %></p>
</body>
</html>