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
<form:form action="displayUserInfo" modelAttribute="user">
	<p>
	<!-- le path permet de lier les attributs du model avec l'input ; items donne les valeurs du mappage controler-->
		Name : <form:input path="name" required="true"/> 
		Gender : <form:radiobuttons path="gender" items="${genderMap}" required="true"/>
	</p>
	
	<p>Country :
	<!-- 
		<form:select path="country">
			<form:option value="India" label="Inde"></form:option>
			<form:option value="France"></form:option>
		</form:select>
	 -->
	 
	 	<form:select path="country" items="${countryMap }">
	 		
	 	</form:select>
		
	</p>
	
	<p>Introduction : 
		<form:textarea path="introduction" required="true"/>
	</p>
	
	<p>Visited Countries :
		Italie <form:checkbox path="visitedCountries" value="Italie"/>
		Espagne <form:checkbox path="visitedCountries" value="Espagne"/>
		Japon <form:checkbox path="visitedCountries" value="Japon"/>
	</p>
	
	<input type="submit" value="submit">
</form:form>

</body>
</html>