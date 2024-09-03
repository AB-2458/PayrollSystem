
<%@page import="com.payrollsystem.dto.SalaryDTO"%>
<%@page import="com.payrolsystem.dao.SalaryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salary View</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%! 
SalaryDAO adao = new SalaryDAO();
SalaryDTO adto = new SalaryDTO();
%>
</head>
<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
<% 
try 
     {  
		int uid = Integer.parseInt(request.getParameter("salaryId"));
		adto.setSalaryId(uid);
		
		adto = (SalaryDTO) adao.getDTO(adto);
	
     } catch(Exception e)
		{
    	   e.printStackTrace();
    	   response.sendRedirect("ErrorPage.jsp");
		} 
%>

<div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add Salary Details</h2>
            <form name="frmSalaryAdd" action="http://localhost:8082/payrollsystem/SerSalaryAdd" method="get">
                <div class="mb-4">
                    <label for="txtSalaryId" class="block text-gray-700 text-sm font-bold mb-2">Salary Id</label>
                    <input type="text" name="txtSalaryId" id="txtSalaryId" value="<%= adto.getSalaryId() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtEmpId" class="block text-gray-700 text-sm font-bold mb-2">Emp Id</label>
                    <input type="text" name="txtEmpId" id="txtEmpId" value="<%= adto.getEmpId() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtDate" class="block text-gray-700 text-sm font-bold mb-2">Salary
                        Date</label>
                    <input type="text" name="txtDate" id="txtDate" value="<%= adto.getDate() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAllowanceId" class="block text-gray-700 text-sm font-bold mb-2">Allowance Id</label>
                    <input type="text" name="txtAllowanceId" id="txtAllowanceId" value="<%= adto.getAllowanceId() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtDeductionId" class="block text-gray-700 text-sm font-bold mb-2">Deduction Id</label>
                    <input type="text" name="txtDeductionId" id="txtDeductionId" value="<%= adto.getDeductionId() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtSalary" class="block text-gray-700 text-sm font-bold mb-2">Salary</label>
                    <input type="text" name="txtSalary" id="txtSalary" value="<%= adto.getSalary() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="flex justify-between">
                    
                    <a href="Salary_Main.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>
</html>