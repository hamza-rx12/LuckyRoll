<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up to LuckyRoll</title>
</head>
<body
        style="display: flex;
        justify-content: center;
        align-items: center;
        height: 60vh;
        flex-direction: column;
        text-align: center;">

    <form name="sign-up" action="sign-up" method="post">
        <label for="email">Email</label><br>
        <input type="text" id="email" name="email" placeholder="enter email"><br>
        <label for="username">Username</label><br>
        <input type="text" id="username" name="username" placeholder="enter username"><br>
        <label for="pass">Password:</label><br>
        <input type="text" id="pass" name="password" placeholder="enter password"><br>
        <label for="passconf">Confirm password:</label><br>
        <input type="text" id="passconf" name="passconf" placeholder="confirm password"><br><br>
        <input type="submit" value="Register">
    </form>

</body>
</html>
