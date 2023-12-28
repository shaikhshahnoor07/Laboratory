package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SubmitForm")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myname = request.getParameter("name1");
		String myemail = request.getParameter("email1");
		
		PrintWriter out = response.getWriter();
		out.print("Name : " + myname);
		out.print("Email : " + myemail);
	}

}
