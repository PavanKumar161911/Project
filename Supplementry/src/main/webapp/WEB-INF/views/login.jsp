<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Login</title></head>
<body>
    <h2>User Login</h2>
    <form method="post" action="/login">
        Username: <input type="text" name="username" required><br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Login">
    </form>
    <p style="color:red;"><%= request.getAttribute("error") %></p>
    <p style="color:green;"><%= request.getAttribute("msg") %></p>
</body>
</html>
