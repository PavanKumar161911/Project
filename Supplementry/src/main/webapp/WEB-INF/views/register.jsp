<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Register</title></head>
<body>
    <h2>User Registration</h2>
    <form method="post" action="/register">
        First Name: <input type="text" name="firstname" required><br>
        Last Name: <input type="text" name="lastname" required><br>
        Username: <input type="text" name="username" required><br>
        Password: <input type="password" name="password" required><br>
        Phone: <input type="text" name="phoneno" required><br>
        Email: <input type="email" name="email" required><br>
        <input type="submit" value="Register">
    </form>
    <p style="color:red;"><%= request.getAttribute("error") %></p>
</body>
</html>
