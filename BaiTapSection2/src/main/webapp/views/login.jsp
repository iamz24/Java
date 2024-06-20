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
      		<input type="text" id="username" name="username" placeholder="username">
     	</div>
       	<div>
       		<label for="password">Password:</label>
    		<input type="password" name="password" id="password" placeholder="password">
     	</div>
  		<div>
       		<button type="submit">Login</button>
    	</div>
	</form>
</body>
</html>