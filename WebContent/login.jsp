<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
body
{
   background: aqua;
}
.login-container
{
  height: 300px;
  width: 400px;
  background: yellow;
}
</style>
</head>
<body>
<form action="./LoginController" method="post">
<center>
<div class="login-container">
   <h1>Login Here!</h1>
   <table>
   <tr>
   <td>Username: </td>
   <td><input type="text" name="username"/></td>
   </tr>
   <tr>
   <td>Password: </td>
   <td><input type="password" name="pass"/></td>
   </tr>
   <tr>
   <td></td>
   <td><input type="submit" value="Login"/></td>
   </tr>
   </table>
</div>
</center>
</form>
</body>
</html>