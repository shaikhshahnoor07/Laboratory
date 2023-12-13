<%@page import="com.Db.DBConnect"%>
<%@page import="com.DAO.PostDAO"%>
<%@page import="com.User.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
UserDetails user1 = (UserDetails) session.getAttribute("userD");
if (user1 == null) {
	response.sendRedirect("login.jsp");
	session.setAttribute("Login-error", "Please Login For Continue...");
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Notes</title>
<%@ include file="all_component/allcss.jsp"%>

</head>
<body>

	<%
	Integer noteid = Integer.parseInt(request.getParameter("note_id"));
	PostDAO post = new PostDAO(DBConnect.getConn());
	Post p =post.getDataById(noteid);
	
	%>

	<%@ include file="all_component/navbar.jsp"%>
	<h1 class="text-center my-4" style="font-size: 2.5rem; color: #333;">Edit
		Your Notes</h1>
	<div class="container-fluid">
		<div class="container mb-5">
			<div class="row">
				<div class="col-md-12">
					<form action="NoteEditServlet" method="post">
						<div class="form-group">
							<input type="hidden" value="<%=noteid%>" name="noteid"> 
							
							<label for="exampleInputEmail1">Enter Title</label> <input type="text"
								class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" name="title" required="required" value="<%= p.getTitle()%>">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">Enter Content</label>
							<textarea rows="8" cols="50" class="form-control" name="content"
								required="required"><%=p.getContent() %></textarea>
						</div>

						<div class="container text-center">
							<button type="submit" class="btn btn-primary">Edit</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<%@include file="all_component/footer.jsp"%>

</body>
</html>