package com.payrollsystem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.DepartmentDTO;
import com.payrolsystem.dao.DepartmentDAO;

/**
 * Servlet implementation class SerDepartmentAdd
 */
public class SerDepartmentAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerDepartmentAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int uid = Integer.parseInt(request.getParameter("txtDepartmentId"));
			String uname = request.getParameter("txtDepartmentName");
			String udesc = request.getParameter("txtDepartmentDesc");
			DepartmentDTO ddto = new DepartmentDTO();
			ddto.setDeptId(uid);
			ddto.setDeptName(uname);
			ddto.setDeptDesc(udesc);
			
			DepartmentDAO ddao = new DepartmentDAO();
			int result = ddao.addDTO(ddto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/Department_Main.jsp");
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
