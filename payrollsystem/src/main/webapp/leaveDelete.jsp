<%@page import="com.payrollsystem.dto.LeaveDTO"%>
<%@page import="com.payrolsystem.dao.LeaveDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!LeaveDAO ldao = new LeaveDAO();
	LeaveDTO ldto = new LeaveDTO();%>
</head>
<body>
	<%
	try {
		int leaveId = Integer.parseInt(request.getParameter("leaveId"));
		ldto.setLeaveId(leaveId);

		int result = ldao.deleteDTO(ldto);
		if(result == 1 )
		{
			response.sendRedirect("leaveMain.jsp");
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