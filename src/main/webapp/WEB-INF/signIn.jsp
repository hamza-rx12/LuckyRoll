<%--<jsp:useBean id="user" scope="request" type="com.luckyroll.luckyroll.Model.User"/>--%>
<%--<%@ taglib uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs/c-rt" prefix="c" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign in to LuckyRoll</title>
</head>
<body
        style="display: flex;
        justify-content: center;
        align-items: center;
        height: 60vh;
        flex-direction: column;
        text-align: center;">

    <h2>${requestScope.user_not_found}</h2>

    <form name="sign-in" action="${pageContext.request.contextPath}/sign-in" method="post">
        <label for="username">Username</label><br>
        <input type="text" id="username" name="username" placeholder="enter username"><br>
        <label for="pass">Password:</label><br>
        <input type="text" id="pass" name="password" placeholder="enter password"><br><br>
        <input type="submit" value="Sign in">
    </form>
    <a href="${pageContext.request.contextPath}/sign-up">
        <button>Sign up</button>
    </a>
</body>
</html>
