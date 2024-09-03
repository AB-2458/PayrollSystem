package com.payrollsystem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.AttendanceDTO;
import com.payrolsystem.dao.AttendanceDAO;

/**
 * Servlet implementation class SerAttendanceUpdate
 */
public class SerAttendanceUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerAttendanceUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int attendanceId = Integer.parseInt(request.getParameter("txtAttendanceId"));
			String attendanceName = request.getParameter("txtAttendanceName");
			String attendanceStatus = request.getParameter("txtAttendanceStatus");
			int attendancePercentage = Integer.parseInt(request.getParameter("txtAttendancePercentage"));
			
			AttendanceDTO adto = new AttendanceDTO();
			adto.setAttendanceId(attendanceId);
			adto.setAttendanceName(attendanceName);
			adto.setAttendanceStatus(attendanceStatus);
			adto.setAttendancePercentage(attendancePercentage);
			
			System.out.println(adto.toString())	;		
			
			AttendanceDAO adao = new AttendanceDAO();
			int result = adao.updateDTO(adto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/attendanceMain.jsp");
			} else {
				 response.sendRedirect("http://localhost:8082/payrollsystem/ErrorPage.jsp");
			}
		
		} catch(Exception e)
		{
			 e.printStackTrace();
			 response.sendRedirect("http://localhost:8082/payrollsystem/ErrorPage.jsp");
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
