<%@page import="com.payrollsystem.dto.AllowanceDTO"%>
<%@page import="com.payrolsystem.dao.AllowanceDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!AllowanceDAO adao = new AllowanceDAO();
	AllowanceDTO adto = new AllowanceDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("allowanceId"));
		adto.setAllowanceId(uid);

		int result = adao.deleteDTO(adto);
		if(result == 1 )
		{
			response.sendRedirect("Allowance_Main.jsp");
		} else {
			 response.sendRedirect("http://localhost:8083/payrollsystem/ErrorPage.jsp");
		}

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>

</body>
</html>