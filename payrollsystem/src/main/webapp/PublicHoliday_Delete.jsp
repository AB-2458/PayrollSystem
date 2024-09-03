<%@page import="com.payrollsystem.dto.PublicHolidayDTO"%>
<%@page import="com.payrolsystem.dao.PublicHolidayDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!PublicHolidayDAO pdao = new PublicHolidayDAO();
	PublicHolidayDTO pdto = new PublicHolidayDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("phId"));
		pdto.setPhId(uid);

		int result = pdao.deleteDTO(pdto);
		if(result == 1 )
		{
			response.sendRedirect("PublicHoliday_Main.jsp");
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