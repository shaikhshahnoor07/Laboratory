package com.xadmin.usermanagment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xadmin.usermanagment.bean.User;

public class UserDao {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/userdb?userSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "1234";
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	
	private static final String INSERT_USER_SQL = "INSERT INTO user" + "(name, email, country) VALUES " + " (?, ?, ?);";
	
	private static final String SELECT_USER_BY_ID = "select id, name, email, country from users where id=?";
	private static final String SELECT_ALL_USERS = "select * from users";
	private static final String DELETE_USERS_SQL= "delete from users where id = ?";
	private static final String UPDATE_USER_SQL= "update users set name= ?, email= ?,country=?, where id=?";
	
	public UserDao() {
		
	}
	
	protected Connection getConnection() {
		
		Connection connection = null;
		
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	//insert user
	public void insertUser(User user) {
		
	}
	
	//select user by id
	
	
	//select all user
	
	
	//update user 
	
	
	//delete user
	
	
}
