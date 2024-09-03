package com.payrollsystem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.PublicHolidayDTO;
import com.payrolsystem.dao.PublicHolidayDAO;

/**
 * Servlet implementation class SerPublicHolidayAdd
 */
public class SerPublicHolidayAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerPublicHolidayAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int uid = Integer.parseInt(request.getParameter("txtPublicHolidayId"));
			String uname = request.getParameter("txtPublicHolidayName");
			String udesc = request.getParameter("txtPublicHolidayDesc");
			PublicHolidayDTO pdto = new PublicHolidayDTO();
			pdto.setPhId(uid);
			pdto.setPhName(uname);
			pdto.setPhDescription(udesc);
			
			PublicHolidayDAO pdao = new PublicHolidayDAO();
			int result = pdao.addDTO(pdto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/PublicHoliday_Main.jsp");
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
