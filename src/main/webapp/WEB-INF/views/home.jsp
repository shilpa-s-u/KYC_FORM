<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home of kyc form</title>
</head>
<body>

<%response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); %>
<h1 style="color:blue">kyc home</h1>
<h2><a href="add">Enroll New Customer</a></h2>
<h2><a href="find">Find Customer</a></h2>
<h2><a href="list">Listing Customer</a></h2>
<h2><a href="logout">Logout</a></h2>
</body>
</html>