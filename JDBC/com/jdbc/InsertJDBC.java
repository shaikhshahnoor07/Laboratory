package com.jdbc;
import java.sql.*;

public class InsertJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creating the connection
			String url="jdbc:mysql://localhost:3306/noor";
			String username="root";
			String password="1234";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			//Create a query
			String q="create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			
			//Create a statement:
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			
			System.out.println("Table created in database..");
			
			con.close();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	}

}
