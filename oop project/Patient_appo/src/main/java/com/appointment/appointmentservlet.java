package com.appointment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class appointmentservlet
 */
@WebServlet("/appointmentservlet")
public class appointmentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @param NIC 
	 * @param Patient_name 
	 * @param Age 
	 * @param Guardian_name 
	 * @param Address 
	 * @param Telephone_no 
	 * @param Doctor_name 
	 * @param Date 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String NIC, String Patient_name, String Age, String Guardian_name, String Address, String Telephone_no, String Doctor_name, String Date) throws ServletException, IOException {
		String patient_name=request.getParameter("Patient_name");
		String age=request.getParameter("Age");
		String nic=request.getParameter("NIC");
		String guardian=request.getParameter("Guardian_name");
		String address=request.getParameter("Address");
		String phone=request.getParameter("Telephone_no");
		String doctor=request.getParameter("Doctor_name");
		String date=request.getParameter("Date");
		
	
		boolean IsTrue;
		
	IsTrue=appointmentdbutil.insertappointment(Patient_name, Age, NIC, Guardian_name,Address, Telephone_no,Doctor_name,Date);
	
	   if(IsTrue==true) {
		   RequestDispatcher dis=request.getRequestDispatcher("success.jsp");
		   dis.forward(request, response);
	   }
	   else {
		   RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
		   dis2.forward(request,response);
	   }
	}

}
