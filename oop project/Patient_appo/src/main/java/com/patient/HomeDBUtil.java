package com.patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HomeDBUtil {
	
	private static boolean isSuccess;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//Validate entered details
	public static List<Patient> validate(String id,String name){
		
		ArrayList<Patient> pat = new ArrayList<>();
		
		Connection con = DBconnect.getConnection();
		
		try {
			  stmt = con.createStatement();
			  String sql = "select * from Patient where ID = '"+id+"' and Name = '"+name+"'";
			  rs = stmt.executeQuery(sql);
			  
			  if(rs.next()) {
				  String ID = rs.getString(1);
				  String Name = rs.getString(2);
				  String Hospital = rs.getString(3);
				  String Province = rs.getString(4);
				  String City = rs.getString(5);
				  
				  Patient patnt = new Patient(ID,Name,Hospital,Province,City);
				  pat.add(patnt);
			  }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		
		return pat;
	}
	
    
	//Insert details into database
	public static boolean insertPatient(String id,String name,String hospital,String province,String city) {
		
		boolean isSuccess = false;
		
		Connection con = DBconnect.getConnection();
		  
		  try {
			  stmt = con.createStatement();
			  String sql = "insert into Patient values('"+id+"','"+name+"','"+hospital+"','"+province+"','"+city+"')";
			  int rs = stmt.executeUpdate(sql);
			  
			  if(rs > 0) {
				  
				  isSuccess = true;
			  }
			  else {
				  isSuccess = false;
			  }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		
		return isSuccess;
	}

     
	 //Update inserted details
	 public static boolean updatePatient(String id,String name,String hospital,String province,String city) {
		 
		 Connection con = DBconnect.getConnection();
		 
		 try {
			 
			 stmt = con.createStatement(); 
			 String sql = "update Patient set Name= '"+name+"',Hospital= '"+hospital+"',Province= '"+province+"',City= '"+city+"'"
					       + "where ID= '"+id+"'";
			 int rs = stmt.executeUpdate(sql);
			 
			 if(rs > 0) {
				  
				  isSuccess = true;
			  }
			  else {
				  isSuccess = false;
			  }
			 
         }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return isSuccess;
	 }
	 
	 
	 //Get inserted details from database
	 public static List<Patient> getPatientDetails(String id){
		 
		 ArrayList<Patient> pat = new ArrayList<>();
		 
		 Connection con = DBconnect.getConnection();
		 
		 try {
			 
			 stmt = con.createStatement(); 
			 String sql = "select * from Patient where ID = '"+id+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 String ID = rs.getString(1);
				 String Name = rs.getString(2);
				 String Hospital = rs.getString(3);
				 String Province = rs.getString(4);
				 String City = rs.getString(5);
				 
				 Patient p = new Patient(ID,Name,Hospital,Province,City);
				 pat.add(p);
			 }
			 
		 }
		 catch(Exception e){
			 
			 e.printStackTrace();
		 }
		 
		 return pat;
	 }
	 
	 
	 //Delete inserted details from database
	 public static boolean deletePatient(String id) {
		 
		 Connection con = DBconnect.getConnection();
		 
		 try {
			 
			 stmt = con.createStatement(); 
			 String sql = "delete from Patient where ID = '"+id+"'";
			 int r = stmt.executeUpdate(sql);
			 
			 if(r > 0) {
				 isSuccess = true;
			  }
			  else {
				  isSuccess = false;
			  }
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return isSuccess;
	 }

}
