<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
</head>
<body>
	<%
		User user = (User)request.getAttribute("user");
	%>
    <form action="<%=request.getContextPath()%>/user/service/edit?id=<%=user.getId()%>" method="post">
        <div>
            <label for="name">Name:</label>
            <input readonly type="text" name="name" id="name" placeholder="Name" value="<%=user.getName() %>">
        </div>
        <div>
            <label for="age">Age:</label>
            <input type="number" name="age" id="age" placeholder="Age">
        </div>
        <div>
        	<button type="submit">Update</button>
        </div>
   </form>	
</body>
</html>