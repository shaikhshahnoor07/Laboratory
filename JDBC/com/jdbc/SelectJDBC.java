//in this program we are going to see the data present inside of the table
//select query statement interface

package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {

	public static void main(String[] args) {
		
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String q = "select * from table1";
			
			Statement stmt=con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String city=set.getString(3);
				
				System.out.println(name + " , " + id + " , " + city);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
