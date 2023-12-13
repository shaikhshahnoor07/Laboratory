<%@page import="com.Db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <style type="text/css">
        .back-img {
            background: url("img/bgImg.jpg") center center no-repeat;
            background-size: cover;
            width: 100%;
            height: 56.25vw; /* 16:9 aspect ratio */
        }

        .text-center h1 {
        	color: #ff004f;
            font-size: 58px;
            margin-top: 150px;
        }

        .text-center h3 {
            font-size: 25px;
            margin-top: -15px;
        }
    </style>

    <meta charset="UTF-8">
    <title>Home Page</title>
    <%@include file="all_component/allcss.jsp" %>
</head>
<body>

	<%@ include file="all_component/navbar.jsp" %>
	<%
		Connection conn=DBConnect.getConn();
		System.out.println(conn);
	%>


<div class="container-fluid back-img">
    <div class="text-center">
        <h1><i class="fa fa-book" aria-hidden="true"></i> E-Notes</h1><br>
        <h3>Save Your Notes Online</h3>
        <a href="login.jsp" style="display: inline-block; margin: 50px auto; width: fit-content; border: 2px solid #ff004f; padding: 8px 30px; border-radius: 6px; text-decoration: none; color: #000; transition: background 0.5s;"
           onmouseover="this.style.backgroundColor='#ff004f';"
           onmouseout="this.style.backgroundColor='transparent';"
        ><i class="fa fa-user" aria-hidden="true"></i> Login</a>
        <a href="register.jsp" style="display: inline-block; margin: 50px auto; width: fit-content; border: 2px solid #ff004f; padding: 8px 30px; border-radius: 6px; text-decoration: none; color: #000; transition: background 0.5s;"
           onmouseover="this.style.backgroundColor='#ff004f';"
           onmouseout="this.style.backgroundColor='transparent';"
        ><i class="fa fa-user-plus" aria-hidden="true"></i> Register</a>
    </div>
</div>
<%@include file="all_component/footer.jsp" %>

</body>
</html>
