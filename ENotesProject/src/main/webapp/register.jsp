<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
<%@include file="all_component/allcss.jsp"%>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid nav-color"
		style="background-image: linear-gradient(to right top, #051937, #004d7a, #008793, #00bf72, #a8eb12); height: 100vh; background-size: cover;">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card mt-4">
					<div class="card-header text-center text-white bg-custom">
						<i class="fa fa-user-plus fa-3x" aria-hidden="true"></i>
						<h4>Registration</h4>
					</div>

						<%
						String regMsg = (String)session.getAttribute("reg-success");
						if(regMsg != null){%>
							
							<div class="alert alert-success" role="alert"><%=regMsg%><a href="login.jsp"> Login</a></div>
						<%
						session.removeAttribute("reg-success");
						}
						%>
						
						
						<%
						String FailedMsg = (String)session.getAttribute("reg-fail");
						if(FailedMsg != null){%>
							
							<div class="alert alert-danger" role="alert"><%=FailedMsg%></div>
						<%
						session.removeAttribute("reg-fail");
						}
						%>

					<div class="card-body">
						<form action="UserServlet" method="post">
							<div class="form-group">
								<label>Enter Name</label> <input type="text"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="uname">
							</div>
							<div class="form-group">
								<label>Enter Email</label> <input type="email"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="uemail">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									name="upassword">
							</div>

							<button type="submit"
								class="btn btn-primary badge-pill btn-block">Register</button>
							<br>
							<p>
								Already Registered click <a href="login.jsp">Login</a>
							</p>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="all_component/footer.jsp"%>


</body>
</html>