<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers List</title>
</head>
<body>

<%response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); %>
${msg }
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="hai"%>
<table border="4" cellspacing="4" cellpadding="4">
<tr><th>customer_id</th><th>scheme</th><th>name_of_depositor</th><th>address</th><th>date_of_birth</th><th>pan_no</th>
<th>proof_of_identity</th><th>proof_of_address</th><th>place</th><th>signature_of_depositor</th><th>signature_of_postmaster</th>
<th>Actions</th></tr>
<hai:forEach var="yet" items="${every }">
<tr>
<td>${yet.customer_id }</td><td>${yet.scheme }</td><td>${yet.name_of_depositor }</td><td>${yet.address }</td>
<td>${yet.date_of_birth }</td><td>${yet.pan_no }</td><td>${yet.proof_of_identity }</td><td>${yet.proof_of_address }</td>
<td>${yet.place }</td><td>${yet.signature_of_depositor }</td><td>${yet.signature_of_postmaster }</td>
<td><ul>
<li><a href="update?id=${yet.customer_id }">Update</a></li>
<li><a href="remove?id=${yet.customer_id }">Delete</a></li>
</ul></td>
</tr>
</hai:forEach>
</table>
<h3><a href="report?form=pdf">Generate As PDF</a></h3>
<h3><a href="report?form=html">Generate As HTML</a></h3>

<h2><a href="home">Home</a></h2>
<h2><a href="logout">Logout</a></h2>
</body>
</html>