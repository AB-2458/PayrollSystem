<%@page import="com.payrollsystem.dto.DepartmentDTO"%>
<%@page import="com.payrolsystem.dao.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!DepartmentDAO ddao = new DepartmentDAO();
	DepartmentDTO ddto = new DepartmentDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("deptId"));
		ddto.setDeptId(uid);

		int result = ddao.deleteDTO(ddto);
		if(result == 1 )
		{
			response.sendRedirect("Department_Main.jsp");
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