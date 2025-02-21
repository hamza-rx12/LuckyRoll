<jsp:useBean id="user" scope="request" type="com.luckyroll.luckyroll.Model.User"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
    <h1>Welcome ${user.username},</h1>
    <h1>Menu:</h1>
    <ol>
        <li>
            <a href="${pageContext.request.contextPath}/game">Play</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/score">View score</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/switch-account">Switch account</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/sign-out">Sign out</a>
        </li>

    </ol>
</body>
</html>
