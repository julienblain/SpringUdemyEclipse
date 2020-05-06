<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>Access denied</p>
<p>Follow the link to navigate to homepage</p>
<c:url var="homepage" value="/"/>
<a href="${homepage }">Follow me</a>
</body>
</html>