<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Letting to Update</title>
</head>
<body>
<form action="alter" method="post">
<table>
<tr><td><input type="text" name="customer_id" value="${fetched.customer_id }"></td></tr>
<tr><td><input type="text" name="scheme" value="${fetched.scheme}"></td></tr>
<tr><td><input type="text" name="name_of_depositor" value="${fetched.name_of_depositor }"></td></tr>
<tr><td><input type="text" name="address" value="${fetched.address }"></td></tr>
<tr><td><input type="text" name="date_of_birth" value="${fetched.date_of_birth }"></td></tr>
<tr><td><input type="text" name="pan_no" value="${fetched.pan_no}"></td></tr>
<tr><td><input type="text" name="proof_of_identity" value="${fetched.proof_of_identity }"></td></tr>
<tr><td><input type="text" name="proof_of_address" value="${fetched.proof_of_address }"></td></tr>
<tr><td><input type="text" name="place" value="${fetched.place }"></td></tr>
<tr><td><input type="text" name="signatute_of_depositor" value="${fetched.signatute_of_depositor }"></td></tr>
<tr><td><input type="text" name="signatute_of_postmaster" value="${fetched.signatute_of_postmaster }"></td></tr>

<tr><td><input type="submit" value="Update"></td></tr>
</table>
</form>
</body>
</html>