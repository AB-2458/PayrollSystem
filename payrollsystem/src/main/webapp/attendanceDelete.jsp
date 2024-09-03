<%@page import="com.payrollsystem.dto.AttendanceDTO"%>
<%@page import="com.payrolsystem.dao.AttendanceDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%!AttendanceDAO adao = new AttendanceDAO();
	AttendanceDTO adto = new AttendanceDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("attendanceId"));
		adto.setAttendanceId(uid);

		int result = adao.deleteDTO(adto);
		if(result == 1 )
		{
			response.sendRedirect("attendanceMain.jsp");
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