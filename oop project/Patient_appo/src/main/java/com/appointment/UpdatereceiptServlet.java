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
 * Servlet implementation class UpdatereceiptServlet
 */
@WebServlet("/UpdatereceiptServlet")
public class UpdatereceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("appoinID");
		String pname=request.getParameter("pname");
		String age = request.getParameter("p_age");
		String nic = request.getParameter("nic");
		String guardian = request.getParameter("guardian_name");
		String address = request.getParameter("address");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
		String gender = request.getParameter("gender");
		String doctor = request.getParameter("doctor");
		
		
		boolean IsTrue=AppointDBUtil.updateAppointment(id, pname, age, nic, guardian, address, telephone, email, password, gender, doctor);
		if(IsTrue == true) {
			List<Patient> patDetails= AppointDBUtil.getPatientDetails(id);
			request.setAttribute("patDetails",patDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("receipt.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
