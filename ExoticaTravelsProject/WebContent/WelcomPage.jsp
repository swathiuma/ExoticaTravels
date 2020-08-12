<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right">
<a href="LogoutServlet">Logout</a>
</div>
<h1>Welcome ${model.uname}</h1>
<table border="0" align="center">
<tr>
<td><a href=""><img src="images/car.jpg" height="150" width="250"></a></td>
<td><a href=""><img src="images/hotel.jpg" height="150" width="250"></a></td>
<td><a href="TourPackagePage.jsp"><img src="images/tourpackage.jpg" height="150" width="250"></a></td>
<td><a href="PlanTravelPage.jsp"><img src="images/plantravel.jpg" height="150" width="250"></a></td>
</tr>
<tr>
<td align="center">Cab Bookings</td>
<td align="center">Hotel Bookings</td>
<td align="center">Tour Package</td>

<td align="center">Travel plan</td>
</table>
</body>
</html>