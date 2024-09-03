package com.payrollsystem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.DeductionDTO;
import com.payrolsystem.dao.DeductionDAO;

/**
 * Servlet implementation class SerDeductionUpdate
 */
public class SerDeductionUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerDeductionUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int deductionId = Integer.parseInt(request.getParameter("txtDeductionId"));
			String deductionName = request.getParameter("txtDeductionName");
			String deductionDescription = request.getParameter("txtDeductionDescription");
			String deductionAmt = request.getParameter("txtDeductionAmt");
			
			DeductionDTO adto = new DeductionDTO();
			adto.setDeductionId(deductionId);
			adto.setDeductionName(deductionName);
			adto.setDeductionDescription(deductionDescription);
			adto.setDeductionAmt(deductionAmt);
			
			DeductionDAO adao = new DeductionDAO();
			int result = adao.updateDTO(adto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/Deduction_Main.jsp");
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
