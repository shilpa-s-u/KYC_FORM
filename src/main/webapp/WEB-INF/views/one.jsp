<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SAMPLE PAGE</title>
</head>
<body>

<%response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); %>
<h1>Welcome to know you customer form</h1>

<h2>${user }</h2>

<h2><a href="home">Home</a></h2>
<h2><a href="logout">Logout</a></h2>
</body>
</html>