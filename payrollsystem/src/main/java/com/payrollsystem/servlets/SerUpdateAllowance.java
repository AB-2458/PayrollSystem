package com.payrollsystem.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.AllowanceDTO;
import com.payrolsystem.dao.AllowanceDAO;

/**
 * Servlet implementation class SerUpdateAllowance
 */
public class SerUpdateAllowance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerUpdateAllowance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int allowanceId = Integer.parseInt(request.getParameter("txtAllowanceId"));
			String allowanceName = request.getParameter("txtAllowanceName");
			String allowanceDescription = request.getParameter("txtAllowanceDescription");
			String allowanceAmt = request.getParameter("txtAllowanceAmt");
			
			System.out.print(allowanceId);
			System.out.print(allowanceName);
			System.out.print(allowanceDescription);
			System.out.print(allowanceAmt);
			
			AllowanceDTO adto = new AllowanceDTO();
			adto.setAllowanceId(allowanceId);
			adto.setAllowanceName(allowanceName);
			adto.setAllowanceDescription(allowanceDescription);
			adto.setAllowanceAmt(allowanceAmt);
			
			System.out.print(adto.toString());
			AllowanceDAO adao = new AllowanceDAO();
			int result = adao.updateDTO(adto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/Allowance_Main.jsp");
			} else {
				 response.sendRedirect("http://localhost:8082/payrollsystem/ErrorPage.jsp");
			}
		
		} catch(Exception e)
		{
			 e.printStackTrace();
			 response.sendRedirect("http://localhost:8083/payrollsystem/ErrorPage.jsp");
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
