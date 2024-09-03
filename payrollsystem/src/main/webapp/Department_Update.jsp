
<%@page import="com.payrollsystem.dto.DepartmentDTO"%>
<%@page import="com.payrolsystem.dao.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Department Update</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%!DepartmentDAO ddao = new DepartmentDAO();
	DepartmentDTO ddto = new DepartmentDTO();%>
</head>
<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("deptId"));
		ddto.setDeptId(uid);

		ddto = (DepartmentDTO) ddao.getDTO(ddto);

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>

	<div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add Department Details</h2>
            <form name="frmDepartmentAdd" action="http://localhost:8082/payrollsystem/SerDepartmentUpdate" method="get">
                <div class="mb-4">
                    <label for="txtDepartmentId" class="block text-gray-700 text-sm font-bold mb-2">Department Id</label>
                    <input type="text" name="txtDepartmentId" id="txtDepartmentId" value="<%= ddto.getDeptId() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtDepartmentName" class="block text-gray-700 text-sm font-bold mb-2">Department Name</label>
                    <input type="text" name="txtDepartmentName" id="txtDepartmentName" value="<%= ddto.getDeptName() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtDepartmentDescription" class="block text-gray-700 text-sm font-bold mb-2">Department
                        Description</label>
                    <input type="text" name="txtDepartmentDesc" id="txtDepartmentDesc" value="<%= ddto.getDeptDesc() %>"
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
                    <a href="Department_Main.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>
</html>
