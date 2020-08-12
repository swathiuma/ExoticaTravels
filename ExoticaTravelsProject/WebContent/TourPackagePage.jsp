<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align=" right"><a href="LogoutServlet">Logout</a></div>
	<table>
	<form action="HotelBookingServlet">
	<tr><td><h3>Tour Package Booking</h3></td></tr>
	<tr><td>Select a destination</td>
	<td><select name="destination">
	<option value="select">Select</option>
	<option value="Colombo">Colombo</option>
	<option value="Ella">Ella</option>
	<option value="Sigiriya">Sigiriya</option>
	<option value="Galle">Galle</option>
	<option value="Kandy">Kandy</option>
	</select></td></tr>
	<tr><td><input type="submit" value="Next"></td></tr>
	</form>
	</table>
</body>
</html>