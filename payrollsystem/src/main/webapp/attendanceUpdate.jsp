
<%@page import="com.payrollsystem.dto.AttendanceDTO"%>
<%@page import="com.payrolsystem.dao.AttendanceDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance View</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%!AttendanceDAO adao = new AttendanceDAO();
	AttendanceDTO adto = new AttendanceDTO();%>
</head>
<body  class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
	<%
	try {
		int attendanceId = Integer.parseInt(request.getParameter("attendanceId"));
		adto.setAttendanceId(attendanceId);

		adto = (AttendanceDTO) adao.getDTO(adto);

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>

	<div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Update Attendance Details</h2>
            <form name="frmAttendanceAdd" action="http://localhost:8082/payrollsystem/SerAttendanceUpdate" method="get">
                <div class="mb-4">
                    <label for="txtAttendanceId" class="block text-gray-700 text-sm font-bold mb-2">Attendance Id</label>
                    <input type="text" name="txtAttendanceId" id="txtAttendanceId" value="<%= adto.getAttendanceId() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAttendanceName" class="block text-gray-700 text-sm font-bold mb-2">Attendance Name</label>
                    <input type="text" name="txtAttendanceName" id="txtAttendanceName" value="<%= adto.getAttendanceName() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAttendanceStatus" class="block text-gray-700 text-sm font-bold mb-2">Attendance
                        Status</label>
                    <input type="text" name="txtAttendanceStatus" id="txtAttendanceStatus" value="<%= adto.getAttendanceStatus() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAttendanceAmt" class="block text-gray-700 text-sm font-bold mb-2">Attendance Percentage</label>
                    <input type="text" name="txtAttendancePercentage" id="txtAttendancePercentage" value="<%= adto.getAttendancePercentage() %>"
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
                    <a href="Attendance_Main.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>
</html>
