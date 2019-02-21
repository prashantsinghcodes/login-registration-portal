<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<style>
body
{
   background: aqua;
}
.form-container
{
	width: 400px;
	height: 400px;
	background: pink;
	margin-top: 100px;
}
input
{
	margin-top: 10px;
}

</style>
</head>
<body>
<form method="post" action="./RegistrationController">
  <center>
  <div class="form-container">
  <table>
        <h1>Register Here!</h1>
  		<tr>
  		<td>Name:</td> <td><input type="text" name="name" placeholder="Name..."/></td>
  		</tr>
  		<tr>
  		<td>Username:</td><td><input type="text" name="username" placeholder="Username..."/></td>
  		</tr>
  		<tr>
  		<td>Password:</td><td><input type="text" name="pass" placeholder="Password..."/></td>
  		</tr>
  		<tr>
  		<td>Mobile:</td><td><input type="text" name="mobile" placeholder="Mobile..."/></td>
  		</tr>
  		<tr>
  		<td></td>
  		<td><input type="submit" value="Submit"/></td>
  		</tr>
  	</table>	
  </div>
  </center>
</form>
</body>
</html>