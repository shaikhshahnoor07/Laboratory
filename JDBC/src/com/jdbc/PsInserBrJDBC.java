/* in this program we are using prepared statement but also with buffer reader 
 * to get the input from the user and to store the in SQL directly*/


package com.jdbc;
import java.sql.*;
import java.io.*;

public class PsInserBrJDBC {
	public static void main(String args[]) {
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create the connection
			String url="jdbc:mysql://localhost:3306/noor";
			String username="root";
			String password="1234";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			//Create a query
			String q ="insert into table1(tName,tCity) values (?,?)";
			
			//get the PrepareStatement object
			PreparedStatement pstmt=con.prepareStatement(q);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name : ");
			String name=br.readLine();
;
			System.out.println("Enter City : ");
			String city=br.readLine();
			
			//set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.executeUpdate();
			
			System.out.println("inserted...");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
