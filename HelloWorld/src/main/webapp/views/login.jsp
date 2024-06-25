<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="/HelloWorld/login" method="post">
		<%-- action sẽ là trang nó sẽ chuyển tới trên server backend để thực thi logic --%>
		<div>
			<label for="Username">Username</label> 
			<input type="text" id="Username" name="Username" placeholder="Username">
		</div>
		<div>
			<label for="Password">Password</label> 
			<input type="password" id="Password" name="Password" placeholder="Password">
		</div>
		<div>
			<button type="submit">Login</button>
		</div>
	</form>
</body>
</html>