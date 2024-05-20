</ This is the jsp form which conatin the user info and save in to th Sql>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="customerservlet" method="get">
	<label>Name :</label>
	<input type="text" name="username">
	<br>
	<br>
	<label>Address :</label>
	<input type="text" name="address">
	<br>
	<br>
	<label>Mobile No :</label>
	<input type="number" name="mobileno">
	<br>
	<br>
	<label>Email ID :</label>
	<input type="text" name="email">
	<br>
	<br>
	<input type="submit" name="submit" value="Go!">
	</form>

</body>
</html>