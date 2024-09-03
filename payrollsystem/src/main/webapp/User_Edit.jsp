
<%@page import="com.payrollsystem.dto.UserDTO"%>
<%@page import="com.payrolsystem.dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User View</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">


<%!UserDAO udao = new UserDAO();
	UserDTO udto = new UserDTO();%>
</head>

<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">
	
	<%
	try {
		int uid = Integer.parseInt(request.getParameter("userId"));
		udto.setUserId(uid);

		udto = (UserDTO) udao.getDTO(udto);

	} catch (Exception e) {
		e.printStackTrace();
		response.sendRedirect("ErrorPage.jsp");
	}
	%>
	
	
    <div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add User Details</h2>
            <form name="frmUserAdd" action="http://localhost:8082/payrollsystem/SerUserUpdate" method="get">
                <div class="mb-4">
                    <label for="txtUserId" class="block text-gray-700 text-sm font-bold mb-2">User Id</label>
                    <input type="text" name="txtUserId" id="txtUserId" value="<%= udto.getUserId() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserName" class="block text-gray-700 text-sm font-bold mb-2">User Name</label>
                    <input type="text" name="txtUserName" id="txtUserName" value="<%= udto.getUserName() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserPwd" class="block text-gray-700 text-sm font-bold mb-2">User
                        Password</label>
                    <input type="password" name="txtUserPwd" id="txtUserPwd" value="<%= udto.getUserPwd() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserAddress" class="block text-gray-700 text-sm font-bold mb-2">User Address</label>
                    <input type="text" name="txtUserAddress" id="txtUserAddress" value="<%= udto.getUserAddress() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserMobile" class="block text-gray-700 text-sm font-bold mb-2">User Mobile</label>
                    <input type="text" name="txtUserMobile" id="txtUserMobile" value="<%= udto.getUserMobile() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserEmail" class="block text-gray-700 text-sm font-bold mb-2">User Email</label>
                    <input type="text" name="txtUserEmail" id="txtUserEmail" value="<%= udto.getUserEmail() %>"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserStatus" class="block text-gray-700 text-sm font-bold mb-2">User Status</label>
                    <input type="text" name="txtUserStatus" id="txtUserStatus" value="<%= udto.getUserStatus() %>"
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
                    <a href="User_Main.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>

</html>
