<%@page import="com.payrollsystem.dto.QualificationDTO"%>
<%@page import="com.payrolsystem.dao.QualificationDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!QualificationDAO qdao = new QualificationDAO();
	QualificationDTO qdto = new QualificationDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("qualificationId"));
		qdto.setQualificationId(uid);

		int result = qdao.deleteDTO(qdto);
		if(result == 1 )
		{
			response.sendRedirect("Qualification_Main.jsp");
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