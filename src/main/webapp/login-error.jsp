<%@ page import="static java.lang.Thread.sleep" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: natsu
  Date: 2/10/25
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Failed</title>
    <script src="assets/js/countdown.js"></script>
</head>
<body>
    <%
        PrintWriter out1 = response.getWriter();
        out1.println("<h2>Username or password wrong!</h2>");
        out1.println("<h2>You will be redirect to menu in <span id=\"countdown\">5</span> seconds.");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//        dispatcher.forward(request, response);
//        out1.println("<script>");
//        out1.println("setTimeout(function() { window.location.href = 'index.jsp'; }, 5000);");
//        out1.println("</script>");

    %>
</body>
</html>
