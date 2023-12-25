/*in this program we are using prepared statement
that is basically used to dynamic query execution*/


package com.jdbc;
import java.sql.*;

public class PsInsertJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create the connection
			String url="jdbc:mysql://localhost:3306/noor";
			String username="root";
			String password="1234";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			//Create a query
			String q ="insert into table1(tName,tCity) values (?,?)";
			
			//get the PreparedStatement object
			PreparedStatement pstmt=con.prepareStatement(q);
			
			//set the value to query
			pstmt.setString(1, "Shaikh shahnoor");
			pstmt.setString(2, "mumbai");
			
			pstmt.executeUpdate();
			
			
			System.out.println("insreted...");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
