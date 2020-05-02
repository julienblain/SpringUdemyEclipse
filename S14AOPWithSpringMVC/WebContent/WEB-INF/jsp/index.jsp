<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

	Hey User, May i know your name ?
	<form action="hello" method="POST">
		<input type="text" name="name" placeholder="Enter your name">
		<input type="submit" value="Submit">
	</form>
</body>
</html>