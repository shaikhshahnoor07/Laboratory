package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAO;
import com.Db.DBConnect;
import com.User.UserDetails;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("uname");
        String email = request.getParameter("uemail");
        String password = request.getParameter("upassword");

        UserDetails userDetails = new UserDetails();
        userDetails.setName(name);
        userDetails.setEmail(email);
        userDetails.setPassword(password);

        UserDAO dao = new UserDAO(DBConnect.getConn());
        boolean isUserAdded = dao.addUser(userDetails);

        PrintWriter out = response.getWriter();					
        HttpSession session;
        
        if (isUserAdded) {
        	
        	session = request.getSession();
        	session.setAttribute("reg-success", "Registration Successful");
        	response.sendRedirect("register.jsp");
        	
        } else {
        	
        	session = request.getSession();
        	session.setAttribute("reg-fail", "Something went wrong om server");
        	response.sendRedirect("register.jsp");
        	
        }
    }
}







