
<%@page import="com.payrollsystem.dto.QualificationDTO"%>
<%@page import="com.payrolsystem.dao.QualificationDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Qualification Update</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

<%!QualificationDAO qdao = new QualificationDAO();
	QualificationDTO qdto = new QualificationDTO();%>
</head>
<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("qualificationId"));
		qdto.setQualificationId(uid);

		qdto = (QualificationDTO) qdao.getDTO(qdto);

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>

	<div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add Qualification Details</h2>
            <form name="frmQualificationAdd" action="http://localhost:8082/payrollsystem/SerQualificationUpdate" method="get">
                <div class="mb-4">
                    <label for="txtQualificationId" class="block text-gray-700 text-sm font-bold mb-2">Qualification Id</label>
                    <input type="text" name="txtQualificationId" id="txtQualificationId" value="<%= qdto.getQualificationId() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtQualificationName" class="block text-gray-700 text-sm font-bold mb-2">Qualification Name</label>
                    <input type="text" name="txtQualificationName" id="txtQualificationName" value="<%= qdto.getQualificationName() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtQualificationDesc" class="block text-gray-700 text-sm font-bold mb-2">Qualification
                        Description</label>
                    <input type="text" name="txtQualificationDesc" id="txtQualificationDesc" value="<%= qdto.getQualificationDesc() %>"
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
                    <a href="Qualification_Main.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>
</html>
