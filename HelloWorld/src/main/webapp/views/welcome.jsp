<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Panel</title>
</head>
<body>
	<%
		HttpSession sessions = request.getSession();
		String user = (String)session.getAttribute("loginUser");
	%>
	<h1>
		WELCOME <%= user %>!
	</h1>

</body>
</html>