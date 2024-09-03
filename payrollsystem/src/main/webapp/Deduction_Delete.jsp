<%@page import="com.payrollsystem.dto.DeductionDTO"%>
<%@page import="com.payrolsystem.dao.DeductionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!DeductionDAO adao = new DeductionDAO();
	DeductionDTO adto = new DeductionDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("deductionId"));
		adto.setDeductionId(uid);

		int result = adao.deleteDTO(adto);
		if(result == 1 )
		{
			response.sendRedirect("Deduction_Main.jsp");
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