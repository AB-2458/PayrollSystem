package com.payrollsystem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.payrollsystem.dto.UserDTO;
import com.payrolsystem.dao.UserDAO;

/**
 * Servlet implementation class EditUserServlet
 */
@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {  
			int uid = Integer.parseInt(request.getParameter("txtUserId"));
			String uname = request.getParameter("txtUserName");
			String upwd = request.getParameter("txtUserPwd");
			String uaddress = request.getParameter("txtUserAddress");
			String umobile = request.getParameter("txtUserMobile");
			String uemail = request.getParameter("txtUserEmail");
			String ustatus = request.getParameter("txtUserStatus");
			
			UserDTO udto = new UserDTO();
			udto.setUserId(uid);
			udto.setUserName(uname);
			udto.setUserPwd(upwd);
			udto.setUserAddress(uaddress);
			udto.setUserMobile(umobile);
			udto.setUserEmail(uemail);
			udto.setUserStatus(ustatus);
			
			UserDAO udao = new UserDAO();
			int result = udao.updateDTO(udto);
			if(result == 1 )
			{
				response.sendRedirect("http://localhost:8083/payrollsystem/user_main.jsp");
			} else {
				 response.sendRedirect("http://localhost:8083/payrollsystem/ErrorPage.jsp");
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
		doGet(request, response);
	}

}
