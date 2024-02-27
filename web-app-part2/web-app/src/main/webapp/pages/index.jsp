<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Registration page" %></h1>
<br/>

<form action ="<%=request.getContextPath()%>/registration" method="post">
    Username: <input type="text" name="username" placeholder="Enter user name"><br>
    <br>
    Password: <input type="password"  name="pwd" placeholder="Enter password"><br> <br>
    <input type="submit" value="Register" >
</form>

<a href="<%=request.getContextPath()%>/logout">Logout</a>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>
