<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet">
<table align="center">
<tr><th colspan=2>Login Detail</th></tr>
<tr><td>Login ID </td><td><input type="text" name="loginid"></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr><td colspan=2><input type="submit" name="submit" value="submit"></td></tr>
</table>
</form>
</body>
</html>