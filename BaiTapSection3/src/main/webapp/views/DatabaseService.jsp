<!DOCTYPE html>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Database Service</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/user/service/search" method="get">
        <div>
            <label for="searchName">Search Name:</label>
            <input type="text" name="searchName" id="searchName" placeholder="Search name">
            <button type="submit">Search</button>
        </div>
    </form>
    <form action="<%=request.getContextPath()%>/user/service/add" method="post">
        <div>
            <label for="name">Name:</label>
            <input type="text" name="name" id="name" placeholder="Name">
        </div>
        <div>
            <label for="age">Age:</label>
            <input type="number" name="age" id="age" placeholder="Age">
        </div>
        <div>
        	<button type="submit">Add</button>
        </div>
   </form>
   
      <table border="1px">
        <thead>
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>AGE</th>
                <th>ACTIONS</th>
            </tr>
        </thead>
        <tbody>
        	<% List<User> listUser = (List<User>)request.getAttribute("listUser");%>
            <%for(User user : listUser) { %> <!-- code java phải được viết ở trên thẻ tr để đảm bảo tính block -->
            <tr>
                <td><%=user.getId() %></td>
                <td><%=user.getName() %></td>
                <td><%=user.getAge() %></td>
                <td>
                	<a href="<%=request.getContextPath()%>/user/service/delete?id=<%=user.getId()%>">Delete</a>
                	<a href="<%=request.getContextPath()%>/user/service/edit?id=<%=user.getId()%>">Edit</a>
                </td>
            </tr>
            <%} %>
        </tbody>
   </table>
</body>
</html>