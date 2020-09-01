<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Customer</title>
</head>
<body>

<%response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); %>
<form action="fetch" method="post">
<table>
<tr><td><input type="text" name="customer_id" placeholder="Enter the customer_id to fetch"></td></tr>
<tr><td><select name="scheme">
<option>Select Any scheme</option><option>SB</option><option>MIS</option>
<option>TD</option><option>SCSS</option><option>RD</option>
</select></td></tr>
<tr><td><input type="submit" value="Fetch"></td></tr>
</table>
</form>

<h2><a href="home">Home</a></h2>
<h2><a href="logout">Logout</a></h2>
</body>
</html>