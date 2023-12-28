package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")

public class Login extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String myemail = request.getParameter("email1");
		String mypass = request.getParameter("pass1");
		PrintWriter out = response.getWriter();
		
		
		if(myemail.equals("shahnoor@123") && mypass.equals("1234")) {
			out.print("success...");
		}else {
			out.print("failed...");
		}
			
	}

}
