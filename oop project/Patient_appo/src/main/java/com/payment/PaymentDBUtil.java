package com.payment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaymentDBUtil {
	
	private static boolean isSuccess;
	private static Statement stmt;
	private static ResultSet rs;
	
	//Validate inserted payment details
	public static List<Payment> validate(String id,String refno){
		
		ArrayList<Payment> pay = new ArrayList<>();
		
		Connection con = DBconnect.getConnection();
		try {
			
			stmt = con.createStatement();
			String sql = "select * from Payment where ID = '"+id+"' and RefNo= '"+refno+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String ID= rs.getString(1);
				String RefNo = rs.getString(2);
				String Name = rs.getString(3);
				String CardNo = rs.getString(4);
				String Month = rs.getString(5);
				int ExpYear= rs.getInt(6);
				int CVV= rs.getInt(7);
				float Amount= rs.getFloat(8);
				
				Payment p = new Payment(ID,RefNo,Name,CardNo,Month,ExpYear,CVV,Amount);
				pay.add(p);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return pay;
	}
	
	
	//Insert payment details to database
	public static boolean insertPayment(String id,String refno,String name,String cardno,String month,String expYear,String cvv,String amount) {
		  
	    int convertedYear = Integer.parseInt(expYear);
	    int convertedcvv = Integer.parseInt(cvv);
	    float convertedAmount = Float.parseFloat(amount);
		
		boolean isSuccess = false;
		  
		Connection con = DBconnect.getConnection();
		
		  try {
			  
			  stmt = con.createStatement();
			  String sql = "insert into Payment values('"+id+"','"+refno+"','"+name+"','"+cardno+"','"+month+"','"+convertedYear+"','"+convertedcvv+"','"+convertedAmount+"')";
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
	
	
	//Update inserted payment details
     public static boolean updatePatient(String id,String refno,String name,String cardno,String month,String expYear,String cvv,String amount) {
    	
	    int convertedYear = Integer.parseInt(expYear);
	    int convertedcvv = Integer.parseInt(cvv);
	    float convertedAmount = Float.parseFloat(amount);
	    
	    Connection con = DBconnect.getConnection();
	    
		 try {
			 
			 stmt = con.createStatement();
			 String sql = "update Payment set RefNo= '"+refno+"',Name= '"+name+"',CardNo= '"+cardno+"',Month= '"+month+"',ExpYear= '"+convertedYear+"',CVV= '"+convertedcvv+"',Amount= '"+convertedAmount+"'"
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
     
     
    //Get inserted payment details from database 
    public static List<Payment> getPaymentDetails(String id){
    	 
		 ArrayList<Payment> pay = new ArrayList<>();
		 
		 Connection con = DBconnect.getConnection();
		 
		 try {

			 stmt = con.createStatement();
			 String sql = "select * from Payment where ID = '"+id+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 String ID = rs.getString(1);
				 String RefNo = rs.getString(2);
				 String Name = rs.getString(3);
				 String CardNo = rs.getString(4);
				 String Month = rs.getString(5);
				 int ExpYear = rs.getInt(6);
				 int CVV = rs.getInt(7);
				 float Amount = rs.getFloat(8);
				 
				 Payment py = new Payment(ID,RefNo,Name,CardNo,Month,ExpYear,CVV,Amount);
				 pay.add(py);
			 }
			 
		 }
		 catch(Exception e){
			 
			 e.printStackTrace();
		 }
		 
		 return pay;
	 }


    //Delete payment details from database
    public static boolean deletePayment(String id) {
	 
	
     Connection con = DBconnect.getConnection();
     
	 try {
		 
		 stmt = con.createStatement();
		 String sql = "delete from Payment where ID = '"+id+"'";
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
