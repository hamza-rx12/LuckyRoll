<jsp:useBean id="user" scope="request" type="com.luckyroll.luckyroll.Model.User"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
    <h1>Welcome to your account ${user.username}</h1>
</body>
</html>
