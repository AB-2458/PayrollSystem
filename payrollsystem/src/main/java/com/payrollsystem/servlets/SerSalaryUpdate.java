package com.payrollsystem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.SalaryDTO;
import com.payrolsystem.dao.SalaryDAO;

/**
 * Servlet implementation class SerSalaryUpdate
 */
public class SerSalaryUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerSalaryUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int salaryId = Integer.parseInt(request.getParameter("txtSalaryId"));
			int empId = Integer.parseInt(request.getParameter("txtEmpId"));
			String date = request.getParameter("txtDate");
			int allowanceId = Integer.parseInt(request.getParameter("txtAllowanceId"));
			int deductionId = Integer.parseInt(request.getParameter("txtDeductionId"));
			int salary = Integer.parseInt(request.getParameter("txtSalary"));

			
			
			SalaryDTO sdto = new SalaryDTO();
			sdto.setSalaryId(salaryId);
			sdto.setEmpId(empId);
			sdto.setDate(date);
			sdto.setAllowanceId(allowanceId);
			sdto.setDeductionId(deductionId);
			sdto.setSalary(salary);

			
			SalaryDAO sdao = new SalaryDAO();
			int result = sdao.updateDTO(sdto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/Salary_Main.jsp");
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
