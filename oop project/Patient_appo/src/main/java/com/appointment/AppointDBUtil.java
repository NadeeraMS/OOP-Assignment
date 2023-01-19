package com.appointment;


import java.sql.ResultSet;
import java.sql.Connection ;
import java.sql.Statement ;
import java.util.ArrayList;
import java.util.List;

public class AppointDBUtil {
	private static boolean IsSuccess;
	private static Connection com=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
public static boolean  validate(String email, String password) {
		
		try {
			com = DBConnect.getConnection();
			stmt = com.createStatement();
			String sql = "select * from patient_details where Email='"+email+"' and Password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				IsSuccess = true;
			} else {
				IsSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return IsSuccess;
	}
	
	
	
   public static List<Patient> getPatient(String email) {
	
	ArrayList<Patient> pat = new ArrayList<>();
	
	try {
		
		com = DBConnect.getConnection();
		stmt = com.createStatement();
		String sql = "select * from patient_details where Email='"+email+"'";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			int id = rs.getInt(1);
			String pname = rs.getString(2);
			String age = rs.getString(3);
			String nic = rs.getString(4);
			String guardian = rs.getString(5);
			String address = rs.getString(6);
			String telephone = rs.getString(7);
			String email1= rs.getString(8);
			String password = rs.getString(9);
			String gender = rs.getString(10);
			String doctor = rs.getString(11);
			
			
			Patient p = new Patient(id,pname,age,nic,guardian,address,telephone,email1,password,gender,doctor);
			pat.add(p);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return pat;	
}
	
	

//insert
	public static boolean insertpatientdetails(String pname,String age,String nic, String guardian,String address, String telephone,String email, String password,String gender,String doctor) {
	boolean IsSuccess=false;
	
	
	
	try {
		
		com=DBConnect.getConnection();
		stmt=com.createStatement();
		
		
		String sql="INSERT INTO patient_details (`Appoinment_ID`, `Patient_name`, `Patient_age`, `NIC`, `Guardian_name`, `Address`, `Telephone_no`, `Email`, `Password`, `Gender`, `Doctor`) VALUES ('0', '"+pname+"', '"+age+"', '"+nic+"', '"+guardian+"', '"+address+"', '"+telephone+"', '"+email+"', '"+password+"', '"+gender+"', '"+doctor+"')";
				
		int rs=stmt.executeUpdate(sql);
	
		if(rs>0) {
		IsSuccess=true;
	     }
		else {
		IsSuccess=false;
	   }
	
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	
	return IsSuccess;
	}

//update appointment	
	public static boolean updateAppointment(String id,String pname,String age,String nic,String guardian,String address,String telephone,String email,String password,String gender,String doctor) {
		
		try {
		 com=DBConnect.getConnection();
		 stmt=com.createStatement();
		 
		 String sql="update patient_details set  Patient_name= '"+pname+"', Patient_age= '"+age+"', NIC= '"+nic+"', Guardian_name= '"+guardian+"', "
		 		+ "Address ='"+address+"', Telephone_no= '"+telephone+"', Email ='"+email+"', Password ='"+password+"', Gender ='"+gender+"', Doctor ='"+doctor+"'"+"where Appoinment_ID ='"+id+"'";
		
		int rs=stmt.executeUpdate(sql);
		
		if(rs>0) {
			IsSuccess=true;
		}
		else {
			IsSuccess=false;
		}
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return IsSuccess;
	}
	
	
	//getting information of patient
	public static List<Patient> getPatientDetails(String  appoint_id){
		int convertedappoint_id=Integer.parseInt(appoint_id);
		ArrayList<Patient> pat=new ArrayList<>();
		
		
		try {
			com=DBConnect.getConnection();
			stmt=com.createStatement();
			String sql="select* from patient_details where Appoinment_ID='"+convertedappoint_id+"'";
		    rs=stmt.executeQuery(sql);
		    
		    while(rs.next()){
		    	int appoint_id1 = rs.getInt(1);
				String patient_name = rs.getString(2);
				String age = rs.getString(3);
				String nic = rs.getString(4);
				String guardian = rs.getString(5);
				String address = rs.getString(6);
				String telephone = rs.getString(7);
				String email= rs.getString(8);
				String password = rs.getString(9);
				String gender = rs.getString(10);
				String doctor = rs.getString(11);
				
			
			Patient p= new Patient(appoint_id1,patient_name,age,nic,guardian,address,telephone,email,password,gender,doctor)	;
		    pat.add(p);	
		    }
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	
	return pat;
	}
	
	
	//delete receipt
	public static boolean deletereceipt(String appoint_id) {
		
		int convappoint_id = Integer.parseInt(appoint_id);
		
		try {
			com=DBConnect.getConnection();
			stmt=com.createStatement();
			String sql="delete from patient_details where Appoinment_ID='"+convappoint_id+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				IsSuccess=true;
			}
			else {
				IsSuccess=false;
			}
		
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return IsSuccess;
	}
	
}
 