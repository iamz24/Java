<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Information</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/update-information" method="post">
        <div>
            <label for="name">Name:</label>
            <input type="text" name="name" id="name" placeholder="Name">
        </div>
        <div>
            <label for="age">Age:</label>
            <input type="number" name="age" id="age" placeholder="Age">
        </div>
        <div>
        	<button type="submit">Done</button>
        </div>
   </form>	
</body>
</html>