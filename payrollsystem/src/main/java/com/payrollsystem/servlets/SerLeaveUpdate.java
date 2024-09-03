package com.payrollsystem.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.LeaveDTO;
import com.payrolsystem.dao.LeaveDAO;

/**
 * Servlet implementation class SerLeaveUpdate
 */
public class SerLeaveUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerLeaveUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int leaveId = Integer.parseInt(request.getParameter("txtleaveId"));
			String leaveName = request.getParameter("txtleaveName");
			String leaveDate = request.getParameter("txtleaveDate");
			String leaveReason = request.getParameter("txtleaveReason");
			String leaveStatus = request.getParameter("txtleaveStatus");
			
			LeaveDTO ldto = new LeaveDTO();
			ldto.setLeaveId(leaveId);
			ldto.setLeaveName(leaveName);
			ldto.setLeaveDate(leaveDate);
			ldto.setLeaveReason(leaveReason);
			ldto.setLeaveStatus(leaveStatus);
			
			LeaveDAO ldao = new LeaveDAO();
			int result = ldao.updateDTO(ldto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/leaveMain.jsp");
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
