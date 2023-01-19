package com.appointment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteReceiptServelet
 */
@WebServlet("/DeleteReceiptServelet")
public class DeleteReceiptServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String appoint_id=request.getParameter("appoint_id");
		boolean IsTrue;
		IsTrue=AppointDBUtil.deletereceipt(appoint_id);
		
		if(IsTrue==true) {
				RequestDispatcher dispatcher=request.getRequestDispatcher("Apoointment.jsp");
				dispatcher.forward(request,response);
			}
		else {
			List<Patient> patdetails=AppointDBUtil.getPatientDetails(appoint_id);
			request.setAttribute("patdetails",patdetails);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("Apoointment.jsp");
		dispatcher.forward(request, response);
		}
	
	}

}
