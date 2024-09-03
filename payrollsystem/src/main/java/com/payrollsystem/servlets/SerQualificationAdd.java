package com.payrollsystem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.QualificationDTO;
import com.payrolsystem.dao.QualificationDAO;

/**
 * Servlet implementation class SerQualificationAdd
 */
public class SerQualificationAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerQualificationAdd() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int uid = Integer.parseInt(request.getParameter("txtQualificationId"));
			String uname = request.getParameter("txtQualificationName");
			String udesc = request.getParameter("txtQualificationDesc");
			
			QualificationDTO qdto = new QualificationDTO();
			qdto.setQualificationId(uid);
			qdto.setQualificationName(uname);
			qdto.setQualificationDesc(udesc);
			
			QualificationDAO qdao = new QualificationDAO();
			int result = qdao.addDTO(qdto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8082/payrollsystem/Qualification_Main.jsp");
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
		doGet(request, response);
	}

}
