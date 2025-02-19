<%@ page import="com.game.gameapp.User" %><%--
  Created by IntelliJ IDEA.
  User: natsu
  Date: 2/10/25
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Game Area</title>
</head>
<body>
    <h1>Welcome  <%= ((User)session.getAttribute("user")).getUsername() %></h1>
    <h2>Your highest score: <%= ((User)session.getAttribute("user")).getScore() %></h2>
    <h2>Highest user score: </h2>
</body>
</html>
