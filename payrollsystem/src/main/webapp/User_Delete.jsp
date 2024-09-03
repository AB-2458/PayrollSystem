<%@page import="com.payrollsystem.dto.UserDTO"%>
<%@page import="com.payrolsystem.dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!UserDAO udao = new UserDAO();
	UserDTO udto = new UserDTO();%>
</head>
<body>
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("userId"));
		udto.setUserId(uid);

		int result = udao.deleteDTO(udto);
		if(result == 1 )
		{
			response.sendRedirect("User_Main.jsp");
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