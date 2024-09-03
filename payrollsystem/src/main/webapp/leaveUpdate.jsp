
<%@page import="com.payrollsystem.dto.LeaveDTO"%>
<%@page import="com.payrolsystem.dao.LeaveDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Update</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%!LeaveDAO ldao = new LeaveDAO();
	LeaveDTO ldto = new LeaveDTO();%>
</head>
<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
	<%
	try {
		int leaveId = Integer.parseInt(request.getParameter("leaveId"));
		ldto.setLeaveId(leaveId);

		ldto = (LeaveDTO) ldao.getDTO(ldto);

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>

	<div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add Leave Details</h2>
            <form name="frmLeaveAdd" action="http://localhost:8082/payrollsystem/SerLeaveUpdate" method="get">
                <div class="mb-4">
                    <label for="txtLeaveId" class="block text-gray-700 text-sm font-bold mb-2">Leave Id</label>
                    <input type="text" name="txtleaveId" id="txtleaveId" value="<%= ldto.getLeaveId() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtleaveName" class="block text-gray-700 text-sm font-bold mb-2">Leave Name</label>
                    <input type="text" name="txtleaveName" id="txtleaveName" value="<%= ldto.getLeaveName() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtleaveDate" class="block text-gray-700 text-sm font-bold mb-2">Leave
                        Date</label>
                    <input type="text" name="txtleaveDate" id="txtleaveDate" value="<%= ldto.getLeaveDate() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtleaveReason" class="block text-gray-700 text-sm font-bold mb-2">Leave Reason</label>
                    <input type="text" name="txtleaveReason" id="txtleaveReason" value="<%= ldto.getLeaveReason() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtleaveReason" class="block text-gray-700 text-sm font-bold mb-2">Leave Status</label>
                    <input type="text" name="txtleaveStatus" id="txtleaveStatus" value="<%= ldto.getLeaveStatus() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="flex justify-between">
                    <button type="submit" name="btnAdd" id="btnAdd"
                        class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
                        type="button">
                        Update
                    </button>
                    <button type="reset" name="btnReset" id="btnReset"
                        class="bg-gray-500 hover:bg-gray-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
                        type="button">
                        Reset
                    </button>
                    <a href="leaveMain.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
