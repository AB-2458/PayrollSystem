
<%@page import="com.payrollsystem.dto.DeductionDTO"%>
<%@page import="com.payrolsystem.dao.DeductionDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deduction Update</title>

<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%!DeductionDAO adao = new DeductionDAO();
	DeductionDTO adto = new DeductionDTO();%>
</head>
<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
	<%
	try {
		int deductionId = Integer.parseInt(request.getParameter("deductionId"));
		adto.setDeductionId(deductionId);

		adto = (DeductionDTO) adao.getDTO(adto);

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>

	<div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add Deduction Details</h2>
            <form name="frmDeductionAdd" action="http://localhost:8082/payrollsystem/SerDeductionUpdate" method="get">
                <div class="mb-4">
                    <label for="txtDeductionId" class="block text-gray-700 text-sm font-bold mb-2">Deduction Id</label>
                    <input type="text" name="txtDeductionId" id="txtDeductionId" value="<%= adto.getDeductionId() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtDeductionName" class="block text-gray-700 text-sm font-bold mb-2">Deduction Name</label>
                    <input type="text" name="txtDeductionName" id="txtDeductionName" value="<%= adto.getDeductionName() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtDeductionDescription" class="block text-gray-700 text-sm font-bold mb-2">Deduction
                        Description</label>
                    <input type="text" name="txtDeductionDescription" id="txtDeductionDescription" value="<%= adto.getDeductionDescription() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtDeductionAmt" class="block text-gray-700 text-sm font-bold mb-2">Deduction Amt</label>
                    <input type="text" name="txtDeductionAmt" id="txtDeductionAmt" value="<%= adto.getDeductionAmt() %>"
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
                    <a href="Deduction_Main.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>
</html>
