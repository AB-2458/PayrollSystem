<%@page import="com.payrollsystem.dto.SalaryDTO"%>
<%@page import="com.payrolsystem.dao.SalaryDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!SalaryDAO sdao = new SalaryDAO();
	SalaryDTO sdto = new SalaryDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("salaryId"));
		sdto.setSalaryId(uid);

		int result = sdao.deleteDTO(sdto);
		if(result == 1 )
		{
			response.sendRedirect("Salary_Main.jsp");
		} else {
			 response.sendRedirect("ErrorPage.jsp");
		}

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>

</body>
</html>