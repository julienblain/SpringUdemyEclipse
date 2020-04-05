<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>
</head>
<body>

<form:form action="displayUserInfo" modelAttribute="user">
	<p>
	<!-- le path permet de lier les attributs du model avec l'input -->
		Name : <form:input path="name"/> 
		Gender : Male <form:radiobutton path="gender"/>
				 Female <form:radiobutton path="gender"/>
	</p>
	<input type="submit" value="submit">
</form:form>

</body>
</html>