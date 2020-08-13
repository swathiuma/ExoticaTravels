<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty errorMessage}">
<p>
<font color="red">Please correct the following errors:
<ul>
<c:forEach var="message" items="${errorMessage}">
<li>${message}</li>
</c:forEach>
</ul></font>
</p>
</c:if>
<form action="RegistrationServlet">
<table align="center">
<tr><th colspan=2>Registration Details</th></tr>
<tr><td>Name</td><td><input type="text" name="uname" value="${unameAtt}"></td></tr>
<tr><td>Address</td><td><textarea name="city" rows="5" cols="21" value="${addressAtt}"></textarea></td></tr>
<tr><td>Contact Number</td><td><input type="text" name="contactno" value="${contactnoAtt}"></td></tr>
<tr><td>Login ID</td><td><input type="text" name="loginid" value="${loginidAtt}"></td></tr>
<tr><td>Password</td><td><input type="password" name="password" value="${passwordAtt}"></td></tr>
<tr><td>Re-enter Password</td><td><input type="password" name="repassword" value="${reEnterPasswordAtt}"></td></tr> 
<tr><td><input type="submit" value="submit"></td>
<td><input type="reset" value="Reset"></td></tr>
</table>
</form>
</body>
</html>