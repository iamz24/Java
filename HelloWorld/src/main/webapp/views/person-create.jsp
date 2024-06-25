<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Person</title>
</head>
<body>
	<div>
		<form action="/HelloWorld/person/create" method="post">
			<%-- action gọi ngược lại 1 đường dẫn trên server để xử lý --%>
			<label for="id">Id: </label> <input type="text" id="id" name="id"
				placeholder="id"> <label for="name">Name: </label> <input
				type="text" id="name" name="name" placeholder="name">
			<button type="submit">Save</button>
			<%-- name dùng để gọi khi làm backend --%>
		</form>
	</div>
</body>
</html>