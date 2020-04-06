<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserInfo</title>
</head>
<body>
	<p>Name : ${user.name }</p>
	<p>Gender : ${user.gender }</p>
	<p>Country : ${user.country }</p>
	<p>Introduction : ${user.introduction }</p>
	<p>Visited Countries :</p>
	<ul>
		<c:forEach items="${user.visitedCountries }" var="item">
		<li>${item }</li>
		</c:forEach>
	</ul>
		
	
</body>
</html>