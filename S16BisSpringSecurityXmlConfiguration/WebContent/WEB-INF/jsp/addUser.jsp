<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>

<!-- attention mapping with annotation driven -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/files/css/style.css">

</head>
<body>
<h1>Submit your informations</h1>
<hr>
<form:form action="addUser" modelAttribute="user">
	<p>
		Name : <form:input path="name" /> 
		<form:errors path="name" cssStyle="color : red" /> 
	</p>
	<p>	
		Email : <form:input path="email" /> 
				<form:errors path="email" cssStyle="color : red" />
	</p>
	<p>
		Password : <form:input path="password" type="password" /> 
	</p>
	<input type="submit" value="submit">
</form:form>

</body>
</html>