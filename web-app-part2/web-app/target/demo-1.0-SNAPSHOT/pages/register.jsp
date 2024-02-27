<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h1>${key}</h1>--%>
<%
    String userName= null;
    Cookie[] cookies = request.getCookies();
    if(cookies!=null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("user")){
                userName = cookie.getValue();
            }
        }
    }
%>

<h1>Hello <%=userName%>! Login Successful!!</h1>
</body>
</html>
</html>