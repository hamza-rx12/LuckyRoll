<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game</title>
</head>
<body>
  <h1>Good luck, have both fun and money ${sessionScope.user.username}!</h1>
  <h2>Rule 1: "roll the dice and whenever you get the same number twice in a row you get 20pts"</h2>
  <h2>Rule 2: "you get 10 chances"</h2>
  <h2>Rule 3: "test your luck with no complains"</h2>
  <br>
  <br>
  <button onclick="window.location.href='${pageContext.request.contextPath}/switch-account'">
<%--    <a href="${pageContext.request.contextPath}/game">Roll</a>--%>
    Roll
  </button>

<%--  <c:if test="${sessionScope.clicked}">--%>
<%--    <h2>You got: </h2>--%>
<%--    <h2>Previous: </h2>--%>
<%--    <h2>Score: </h2>--%>
<%--  </c:if>--%>


</body>
</html>
