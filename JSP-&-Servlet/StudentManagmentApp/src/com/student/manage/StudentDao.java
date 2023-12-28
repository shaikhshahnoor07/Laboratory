package com.student.manage;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st) {
		
		boolean f=false;
		
		try {
			
			//JDBC code

			Connection con = CP.creatC();
			String q ="insert into students(sname,sphone,scity) values(?,?,?)";
			System.out.println("runn..");
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			//execute..
			
			pstmt.executeUpdate();
			
			f=true;
			
			
		} catch (Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

}
