<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align=" right">
<a href="LogoutServlet">Logout</a></div>
</div>
<form action="PlanTravelServlet" >
<table border="0">
<tr>
<td colspan="45">
<h2><i>Plan Your Travel</i></h2></td>
</tr>
<tr>
<td>Date of Arrival</td>
<td>
<select name="arr_dd" name="arr_date">
<%for(int i=1;i<=31;i++){ %>
<option value="<%=i%>"><%=i%></option>
<%} %>
</select>
-
<select name="arr_mm">
<option value="Jan" >January</option>
<option value="Feb" >February</option>
<option value="Mar" >March</option>
<option value="Apr" >April</option>
<option value="May" >May</option>
<option value="Jun" >June</option>
<option value="Jul" >July</option>
<option value="Aug" >August</option>
<option value="Sep" >September</option>
<option value="Oct" >October</option>
<option value="Nov" >November</option>
<option value="Dec" >December</option>
</select>
-
<select name="arr_yy">
<%for(int i=2020;i<=2025;i++){ %>
<option value="<%=i%>"><%=i%></option>
<%} %>
</select>
</td>
</tr>
<tr>
<td>Date of Departure</td>
<td>
<select name="arr_dd" name="arr_date">
<%for(int i=1;i<=31;i++){ %>
<option value="<%=i%>"><%=i%></option>
<%} %>
</select>
-
<select name="arr_mm">
<option value="Jan" >January</option>
<option value="Feb" >February</option>
<option value="Mar" >March</option>
<option value="Apr" >April</option>
<option value="May" >May</option>
<option value="Jun" >June</option>
<option value="Jul" >July</option>
<option value="Aug" >August</option>
<option value="Sep" >September</option>
<option value="Oct" >October</option>
<option value="Nov" >November</option>
<option value="Dec" >December</option>
</select>
-
<select name="arr_yy">
<%for(int i=2020;i<=2025;i++){ %>
<option value="<%=i%>"><%=i%></option>
<%} %>
</select>
</td>
</tr>
</table> 
<table>
<tr>
<td colspan="2">What kind of Holiday do your prefer?></td>
<tr><td><input name="kind_wild" type="checkbox" value="Wild and Adventurous"/>
Wild &amp; Adventurous</td>
<td><input name="kind_romantic" type="checkbox" value="Romantic and Sensuous"/>
Romantic &amp; Sensuous</td></tr>
<tr><td><input name="kind_fun" type="checkbox" value="Fun and Exciting"/>
Fun &amp; Exciting</td>
<td><input name="kind_peaceful" type="checkbox" value="Thought provoking and Peaceful"/>
Thought provoking &amp; Peaceful</td></tr>
<tr><td><input name="kind_healthy" type="checkbox" value="Healthy and rejuvenating"/>
Healthy &amp; rejuvenating</td></tr>
<tr><td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
<tr>
<td colspan="2">What would you like to see in a holiday?</td>
</tr>
<tr>
<td><input name="like_beaches" type="checkbox" value="Beaches">Beaches</td>
<td><input name="like_archaeological" type="checkbox" value="Archaeological sites">Archaeological sites</td>
<td><input name="like_mountains" type="checkbox" value="Mountains and waterfalls">Mountains &amp; waterfalls</td>
<td><input name="like_wildlife" type="checkbox" value="Wild Life">Wild Life</td>
<td><input name="like_fauna" type="checkbox" value="Fauna and flora">Fauna and flora</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
<tr>
<td colspan="2">What is the most important facility you need?</td>
</tr>
<tr>
<td><input name="faci_accomodation" type="checkbox" value="Comfortable accommodation"/>Comfortable accommodation</td>
<td><input name="faci_food" type="checkbox" value="Excellent Food"/>Excellent Food</td></tr>
<tr>
<td><input name="faci_transport" type="checkbox" value="Transportation"/>Transportation</td>
<td><input name="faci_comm" type="checkbox" value="Communication"/>Communication</td></tr>
<tr>
<td><input name="faci_guide" type="checkbox" value="Guide assistance"/>Guide assistance</td>
<td>&nbsp;</td></tr>
<tr><td>&nbsp;</td>
<td>&nbsp;</td>
</tr>

<td colspan="2">What kind of accommodation pleases yu?</td>
</tr>
<tr>
<td><input name="budget" type="checkbox" value="Budget Guest Houses"/>Budget Guest Houses</td>
<td><input name="standard" type="checkbox" value="Standard Hotels"/>Standard Hotels</td></tr>
<tr>
<td><input name="star2_3" type="checkbox" value="2-3 Star Hotels"/>2-3 Star Hotels</td>
<td><input name="star4_5" type="checkbox" value="4-5 Star Hotels"/>4-5 Star Hotels</td></tr>
<tr><td>&nbsp;</td></tr>
</table>
<table border="0">
<tr>
<td colspan="2">&nbsp;</td></tr>
<tr><td><input type="submit" value="Submit"/></td></tr>
</table>
</form>
</body>
</html>










