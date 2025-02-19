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

    <form name="sign-in" action="sign-in" method="post">
        <label for="username">Username</label><br>
        <input type="text" id="username" name="username" placeholder="enter username"><br>
        <label for="pass">Password:</label><br>
        <input type="text" id="pass" name="password" placeholder="enter password"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
