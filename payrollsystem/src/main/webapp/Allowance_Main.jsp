<%@page import="java.util.Iterator"%>
<%@page import="com.payrollsystem.dto.AllowanceDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.payrollsystem.dto.DTO"%>
<%@page import="java.util.List"%>
<%@page import="com.payrolsystem.dao.AllowanceDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Allowance Maintenance</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gradient-to-r from-blue-400 via-purple-400 to-white-500">

<form name="frmAllowanceMaintenance" action="Allowance_Add.jsp" method="get">
    <div class="container mx-auto px-4 py-8">
        <h2 class="text-3xl font-bold text-white text-center mb-8">Allowance Maintenance</h2>
        
        <table class="w-full bg-white bg-opacity-30 rounded-lg overflow-hidden shadow-lg">
            <thead>
                <tr>
                    <th class="px-4 py-2 bg-blue-500 text-white">Allowance Id</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Allowance Name</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Allowance Amount</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">View</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Edit</th>
                    <th class="px-4 py-2 bg-blue-500 text-white">Delete</th>
                </tr>
            </thead>
            <tbody>
                <% 
                AllowanceDAO adao = new AllowanceDAO();
                List<DTO> lstadto = new ArrayList<DTO>();
                AllowanceDTO adto = new AllowanceDTO();
                try {
                    lstadto = adao.getAllDTO();
                } catch (Exception e) {
                    e.printStackTrace();
                    response.sendRedirect("ErrorPage.jsp");
                }
                Iterator itr = lstadto.iterator();
                while (itr.hasNext()) {
                    adto = (AllowanceDTO) itr.next();
                %>
                <tr>
                    <td class="px-4 py-2 text-center"><%=adto.getAllowanceId()%></td>
                    <td class="px-4 py-2 text-center"><%=adto.getAllowanceName()%></td>
                    <td class="px-4 py-2 text-center"><%=adto.getAllowanceAmt()%></td>
                    <td class="px-4 py-2 text-center"><a href="Allowance_View.jsp?allowanceId=<%=adto.getAllowanceId()%>" class="text-blue-500 hover:text-blue-700">View</a></td>
                    <td class="px-4 py-2 text-center"><a href="Allowance_Update.jsp?allowanceId=<%=adto.getAllowanceId()%>" class="text-blue-500 hover:text-blue-700">Edit</a></td>
                    <td class="px-4 py-2 text-center"><a href="Allowance_Delete.jsp?allowanceId=<%=adto.getAllowanceId()%>" class="text-blue-500 hover:text-blue-700">Delete</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        
        <div class="flex justify-center mt-8 space-x-4">
            <button type="submit" name="btnAdd" id="btnAdd" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-700 focus:bg-blue-700 focus:outline-none">Add new Allowance</button>
            <a href="admn_homepage.jsp" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-700 focus:bg-blue-700 focus:outline-none">Back</a>
        </div>
    </div>
</form>

</body>
</html>
