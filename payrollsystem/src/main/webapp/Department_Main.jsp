<%@page import="java.util.Iterator"%>
<%@page import="com.payrollsystem.dto.DepartmentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.payrollsystem.dto.DTO"%>
<%@page import="java.util.List"%>
<%@page import="com.payrolsystem.dao.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Maintenance</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gradient-to-r from-blue-400 via-purple-400 to-white-500">

<form name="frmDepartmentMaintenance" action="Department_Add.jsp" method="get" >
    <div class="container mx-auto px-4 py-8">
        <h2 class="text-3xl font-bold text-white text-center mb-8">Department Maintenance</h2>
        
        <table class="w-full bg-white bg-opacity-30 rounded-lg overflow-hidden shadow-lg">
            <thead>
                <tr>
                    <th class="px-4 py-2 bg-blue-500 text-white">DepartmentId</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">DepartmentName</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">DepartmentDescription</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">View</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Edit</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Delete</th>
                </tr>
            </thead>
            <tbody>
                <% 
                DepartmentDAO ddao = new DepartmentDAO();
                List<DTO> lstDDTO = new ArrayList<DTO>();
                DepartmentDTO ddto = new DepartmentDTO();
                try {
                    lstDDTO = ddao.getAllDTO();
                } catch (Exception e) {
                    e.printStackTrace();
                    response.sendRedirect("ErrorPage.jsp");
                }
                Iterator itr = lstDDTO.iterator();
                while (itr.hasNext()) {
                    ddto = (DepartmentDTO) itr.next();
                %>
                <tr>
                    <td class="px-4 py-2 text-center"><%=ddto.getDeptId()%></td>
                    <td class="px-4 py-2 text-center"><%=ddto.getDeptName()%></td>
                    <td class="px-4 py-2 text-center"><%=ddto.getDeptDesc()%></td>
                    <td class="px-4 py-2 text-center"><a href="Department_View.jsp?deptId=<%=ddto.getDeptId()%>" class="text-blue-500 hover:text-blue-700">View</a></td>
                    <td class="px-4 py-2 text-center"><a href="Department_Update.jsp?deptId=<%=ddto.getDeptId()%>" class="text-blue-500 hover:text-blue-700">Edit</a></td>
                    <td class="px-4 py-2 text-center"><a href="Department_Delete.jsp?deptId=<%=ddto.getDeptId()%>" class="text-blue-500 hover:text-blue-700">Delete</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        
        <div class="flex justify-center mt-8 space-x-4">
            <button type="submit" name="btnAdd" id="btnAdd" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-700 focus:bg-blue-700 focus:outline-none">Add New Department</button>
            <a href="admn_homepage.jsp" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-700 focus:bg-blue-700 focus:outline-none">Back</a>
        </div>
    </div>
</form>

</body>
</html>
