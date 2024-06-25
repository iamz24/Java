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
	<h1>Hello, <%=session.getAttribute("name")%></h1>
	<form action="<%=request.getContextPath()%>/log-out" method="get">
		<div>
			<button type="submit">Log out</button>
		</div>
	</form>
	<form action="<%=request.getContextPath()%>/user/service/search" method="get">
        <div>
            <label for="searchName">Search Name:</label>
            <input type="text" name="searchName" id="searchName" placeholder="Search name">
            <button type="submit">Search</button>
        </div>
    </form>
      <table border="1px">
        <thead>
            <tr>
                <th>NAME</th>
                <th>AGE</th>
                <th>ACTIONS</th>
            </tr>
        </thead>
        <tbody>
        	<% List<User> listUser = (List<User>)request.getAttribute("listUser");%>
            <%for(User user : listUser) { %> <!-- code java phải được viết ở trên thẻ tr để đảm bảo tính block -->
            <tr>
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