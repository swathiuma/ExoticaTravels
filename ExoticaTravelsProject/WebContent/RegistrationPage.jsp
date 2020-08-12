<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegistrationServlet">
<table align="center">
<tr><th colspan=2>Registration Details</th></tr>
<tr><td>Name</td><td><input type="text" name="uname"></td></tr>
<tr><td>Address</td><td><textarea name="city" rows="5" cols="21"></textarea></td></tr>
<tr><td>Contact Number</td><td><input type="text" name="contactno"></td></tr>
<tr><td>Login ID</td><td><input type="text" name="loginid"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<!-- <tr><td>Re-enter Password</td><td><input type="password" name="repassword"></td></tr> -->
<tr><td><input type="submit" value="submit"></td>
<td><input type="reset" value="Reset"></td></tr>
</table>
</form>
</body>
</html>