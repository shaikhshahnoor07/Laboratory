//in this  program we are going to store a image in database from the PC

package com.jdbc;
import java.sql.*;
import java.io.*;


public class SaveImageJDBC {
	public static void main(String args[]) {
		
		try {
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create the Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/noor","root","1234");
			
			String q="insert into images(pic) value(?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//give the location of image from the PC
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\shahnoorDP.jpg");
			
			pstmt.setBinaryStream(1, fis, fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("Done...");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
