<%@page import="com.User.UserDetails"%>
<link rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
      integrity="sha512-..."
      crossorigin="anonymous" />



<nav class="navbar navbar-expand-lg navbar-dark bg-custom navbar-custom">
	<a class="navbar-brand" href="#"><i class="fa fa-book"
		aria-hidden="true"></i> E-Notes</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="home.jsp"><i
					class="fa fa-home" aria-hidden="true"></i> Home<span
					class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="addNotes.jsp"><i
					class="fa fa-plus-circle" aria-hidden="true"></i> Add Notes</a></li>

			<li class="nav-item"><a class="nav-link" href="showNotes.jsp"><i
					class="fa fa-sticky-note" aria-hidden="true"></i> Show Notes</a></li>
		</ul>

		<%
		UserDetails user = (UserDetails) session.getAttribute("userD");

		if (user != null) {
		%>
		<a href="login.jsp" class="btn btn-light my-2 my-sm-0 mr-2"
			data-toggle="modal" data-target="#exampleModal" type="submit"><i
			class="fa fa-user" aria-hidden="true"></i> <%=user.getName()%></a>
			<a href="LogoutServlet" class="btn btn-light my-2 my-sm-0" type="submit"><i
			class="fas fa-sign-out-alt" aria-hidden="true"></i> Logout</a>

		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog modal-dialog-centered">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body text-center">
						<i class="fa fa-user fa-3x"></i>
						<h5></h5>
						<table class="table">
							<tbody>
								<tr>
									<th>User Id</th>
									<td><%=user.getId()%></td>
								</tr>

								<tr>
									<th>Name</th>
									<td><%=user.getName()%></td>
								</tr>

								<tr>
									<th>Email Id</th>
									<td><%=user.getEmail()%></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="modal-footer justify-content-center">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>


		<%
		} else {
		%>
		<a href="login.jsp" class="btn btn-light my-2 my-sm-0 mr-2"
			type="submit"><i class="fa fa-user" aria-hidden="true"></i> Login</a>
		<a href="register.jsp" class="btn btn-light my-2 my-sm-0"
			type="submit"><i class="fa fa-user-plus" aria-hidden="true"></i>
			Register</a>

		<%
		}
		%>





	</div>


</nav>