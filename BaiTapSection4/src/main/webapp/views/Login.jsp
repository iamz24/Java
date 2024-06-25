<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/login" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" name="username" id="username" placeholder="Username">
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" name="password" id="password" placeholder="Password">
        </div>
        <div>
            <button type="submit">Login</button>
        </div>
        <div>
        	<a href="<%=request.getContextPath()%>/register">Don't have an account? Register</a>
        </div>
    </form>	
</body>
</html>