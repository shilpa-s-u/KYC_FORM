<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log into KYC FORM</title>
</head>
<body>
${msg }
<form action="log" method="post">
<table>
<tr><td>Enter the User name</td>
<td><input type="text" name="user" placeholder="Username"></td></tr>
<tr><td>Enter the Password</td>
<td><input type="password" name="pass" placeholder="Password"></td>
</tr>
<tr>
<td><input type="submit" value="Login"></td>
<td><input type="reset" value="Clear"></td>
</tr>
<tr>
<td>
<h2><a href="add">Enroll New Customer</a></h2>
</td>
</tr>
</table>
</form>
</body>
</html>