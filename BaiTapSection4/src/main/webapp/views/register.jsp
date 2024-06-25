<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/register" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" name="username" id="username" placeholder="Username">
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" name="password" id="password" placeholder="Password">
        </div>
        <div>
            <label for="re-pass">Re-password:</label>
            <input type="password" name="re-pass" id="re-pass" placeholder="Re-password">
        </div>
        <div>
            <button type="submit">Register</button>
        </div>
    </form>	
</body>
</html>