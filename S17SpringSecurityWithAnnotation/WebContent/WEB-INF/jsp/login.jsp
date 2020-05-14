<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><head><title>Login Page</title></head><body onload='document.f.username.focus();'>
<h3>Login with Username and Password</h3><form name='f' action='/S17SpringSecurityWithAnnotation/login' method='POST'>

<hr>
Custom Form
<hr>
<table>
	<c:if test="${param.error != null }" >
		<span style="color:red">Invalid Credential</span>
	</c:if>
	<tr><td>User:</td><td><input type='text' name='username' value=''></td></tr>
	<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
	<input name="${_csrf.parameterName }" value="${_csrf.token }" type="hidden"/>
</table>
</form></body></html>