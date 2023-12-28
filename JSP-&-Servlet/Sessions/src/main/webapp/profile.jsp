<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	 	String myname= (String)session.getAttribute("name_key");
	%>

	<h3> WELCOME : <%= myname%></h3>
	<a href="home.jsp"> Home </a> &nbsp;&nbsp;
	<a href="about-us.jsp"> About us </a>
	<a href="Logout"> Logout </a>

</body>
</html>