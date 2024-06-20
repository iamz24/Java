<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="UTF-8">
        <title>Register</title>
        <link rel="stylesheet" href="./style.css">
    </head>

    <body>
        <form action="<%=request.getContextPath()%>/register" method="post">
            <div>
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" placeholder="username">
            </div>
            <div>
                <label for="password">Password:</label>
                <input type="password" name="password" id="password" placeholder="password">
            </div>
            <div>
                <label for="re-password">Re-password:</label>
                <input type="password" name="re-password" id="re-password" placeholder="re-enter password">
            </div>
            <div>
                <button type="submit">register</button>
            </div>
        </form>
    </body>
</html>