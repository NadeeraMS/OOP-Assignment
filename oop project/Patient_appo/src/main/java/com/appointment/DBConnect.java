package com.appointment;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url="jdbc:mysql://localhost:3306/patient_appoint";
	private static String username="root";
	private static String password="MYONE12#@5s";
	private static Connection com;
	
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			com=DriverManager.getConnection(url,username,password);
			
			
		}
		catch(Exception e) {
			System.out.println("Database connection is not success");
		}
	
	return com;
	
	}









}
