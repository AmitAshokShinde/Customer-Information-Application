</ This is the produt Search jsp if search their name in the form the servelt featch the data from the sql and display on page />
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
	<label>Customer Name :</label>
	<input type="text" name="name">
	<br>
	<br>
	<input type="submit" name="submit" value="Search">
	</form>

</body>
</html>