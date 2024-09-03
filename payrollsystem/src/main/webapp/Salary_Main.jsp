<%@page import="java.util.Iterator"%>
<%@page import="com.payrollsystem.dto.SalaryDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.payrollsystem.dto.DTO"%>
<%@page import="java.util.List"%>
<%@page import="com.payrolsystem.dao.SalaryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salary Maintenance</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gradient-to-r from-blue-400 via-purple-400 to-white-500">

<form name="frmSalaryMaintenance" action="Salary_Add.jsp" method="get">
    <div class="container mx-auto px-4 py-8">
        <h2 class="text-3xl font-bold text-white text-center mb-8">Salary Maintenance</h2>
        
        <table class="w-full bg-white bg-opacity-30 rounded-lg overflow-hidden shadow-lg">
            <thead>
                <tr>
                    <th class="px-4 py-2 bg-blue-500 text-white">Salary Id</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Employee Id</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Salary Amount</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">View</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Edit</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Delete</th>
                </tr>
            </thead>
            <tbody>
                <% 
                SalaryDAO sdao = new SalaryDAO();
                List<DTO> lstsdto = new ArrayList<DTO>();
                SalaryDTO sdto = new SalaryDTO();
                try {
                    lstsdto = sdao.getAllDTO();
                } catch (Exception e) {
                    e.printStackTrace();
                    response.sendRedirect("ErrorPage.jsp");
                }
                Iterator itr = lstsdto.iterator();
                while (itr.hasNext()) {
                    sdto = (SalaryDTO) itr.next();
                %>
                <tr>
                    <td class="px-4 py-2 text-center"><%=sdto.getSalaryId()%></td>
                    <td class="px-4 py-2 text-center"><%=sdto.getEmpId()%></td>
                    <td class="px-4 py-2 text-center"><%=sdto.getSalary()%></td>
                    <td class="px-4 py-2 text-center"><a href="Salary_View.jsp?salaryId=<%=sdto.getSalaryId()%>" class="text-blue-500 hover:text-blue-700">View</a></td>
                    <td class="px-4 py-2 text-center"><a href="Salary_Update.jsp?salaryId=<%=sdto.getSalaryId()%>" class="text-blue-500 hover:text-blue-700">Edit</a></td>
                    <td class="px-4 py-2 text-center"><a href="Salary_Delete.jsp?salaryId=<%=sdto.getSalaryId()%>" class="text-blue-500 hover:text-blue-700">Delete</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        
        <div class="flex justify-center mt-8 space-x-4">
            <button type="submit" name="btnAdd" id="btnAdd" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-700 focus:bg-blue-700 focus:outline-none">Add new Salary</button>
            <a href="admn_homepage.jsp" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-700 focus:bg-blue-700 focus:outline-none">Back</a>
        </div>
    </div>
</form>

</body>
</html>
