package com.student.manage;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class CP {
	
		static Connection con;

	public static Connection creatC() {
		
		
		
	
			
//		//load the driver
//		Class.forName("com.mysql.jdbc.Driver");
//		
//		//create the connection
//		String user = "root";
//		String password = "1234";
//		String url = "jdbc:mysql://localhost:3306/student_manage?useUnicode=true&characterEncoding=UTF-8";
//		
//		con=DriverManager.getConnection(url, user, password);
//		
			String jdbcURL = "jdbc:mysql://localhost:3306/student_manage?useUnicode=true&characterEncoding=UTF-8";
	        String username = "root";
	        String password = "1234";
	        
	        Connection con = null;
	        try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        try {
	        	
	            con = DriverManager.getConnection(jdbcURL, username, password);
	            System.out.println("Connected to the database.");
	            // Perform your database operations here.
//	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return con;
		}
		
		
		
		
	
}
