
<%@page import="com.payrollsystem.dto.AllowanceDTO"%>
<%@page import="com.payrolsystem.dao.AllowanceDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Allowance View</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%! 
AllowanceDAO adao = new AllowanceDAO();
AllowanceDTO adto = new AllowanceDTO();
%>
</head>

<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
	
	<% 
try 
     {  
		int uid = Integer.parseInt(request.getParameter("allowanceId"));
		adto.setAllowanceId(uid);
		
		adto = (AllowanceDTO) adao.getDTO(adto);
	
     } catch(Exception e)
		{
    	   e.printStackTrace();
    	   response.sendRedirect("ErrorPage.jsp");
		} 
%>
	
    <div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add Allowance Details</h2>
            <form name="frmAllowanceAdd" action="http://localhost:8083/payrollsystem/AddAllowanceServlet" method="get">
                <div class="mb-4">
                    <label for="txtAllowanceId" class="block text-gray-700 text-sm font-bold mb-2">Allowance Id</label>
                    <input type="text" name="txtAllowanceId" id="txtAllowanceId" value="<%= adto.getAllowanceId() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAllowanceName" class="block text-gray-700 text-sm font-bold mb-2">Allowance Name</label>
                    <input type="text" name="txtAllowanceName" id="txtAllowanceName" value="<%= adto.getAllowanceName() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAllowanceDescription" class="block text-gray-700 text-sm font-bold mb-2">Allowance
                        Description</label>
                    <input type="text" name="txtAllowanceDescription" id="txtAllowanceDescription" value="<%= adto.getAllowanceDescription() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAllowanceAmt" class="block text-gray-700 text-sm font-bold mb-2">Allowance Amount</label>
                    <input type="text" name="txtAllowanceAmt" id="txtAllowanceAmt" value="<%= adto.getAllowanceAmt() %>" disabled
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="flex justify-between">
                    
                    <a href="Allowance_Main.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>
</html>