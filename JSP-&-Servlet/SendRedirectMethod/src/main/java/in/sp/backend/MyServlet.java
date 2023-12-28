package in.sp.backend;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchForm")

public class MyServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String mysearch = request.getParameter("search1");

		//response.sendRedirect("https://www.google.com/search?="+mysearch);
			
		response.sendRedirect("https://www.google.com/search?q="+mysearch);
	}

}
