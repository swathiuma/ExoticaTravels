<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.frm1{
//float:left;
border:0px;
overflow:scroll;
background:#b3dced;

}
.frm2{
//float:right;
border:0px;
background-color:darkorange;
overflow:scroll;
}
.frm3{
//float:middle;
border:0px;
overflow:scroll;
background:#b9f2b8;
}
.frm4{
//float:left; 
border:0px;
overflow:scroll;
 
}
</style>
</head>
<body>
<iframe class="frm3" frameborder="0" id="top" align="top" name="top" src="HeadingFramePage.jsp"
width="100%" height="130" seamless></iframe>
<iframe class="frm1" frameborder="0" id="left" name="left" align="left" src="LinksPage.jsp"
width="13%" height="480" seamless></iframe>
<iframe class="frm4" frameborder="0" id="middle" align="right" name="middle" src="MainPage.jsp"
width="87%" height="480" seamless></iframe>
</body>
</html>