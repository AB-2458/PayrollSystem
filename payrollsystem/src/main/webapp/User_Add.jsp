<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add User Details</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">

    <div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add User Details</h2>
            <form name="frmUserAdd" action="http://localhost:8082/payrollsystem/SerUserAdd" method="get">
                <div class="mb-4">
                    <label for="txtUserId" class="block text-gray-700 text-sm font-bold mb-2">User Id</label>
                    <input type="text" name="txtUserId" id="txtUserId"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserName" class="block text-gray-700 text-sm font-bold mb-2">User Name</label>
                    <input type="text" name="txtUserName" id="txtUserName"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserPwd" class="block text-gray-700 text-sm font-bold mb-2">User
                        Password</label>
                    <input type="password" name="txtUserPwd" id="txtUserPwd"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserAddress" class="block text-gray-700 text-sm font-bold mb-2">User Address</label>
                    <input type="text" name="txtUserAddress" id="txtUserAddress"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserMobile" class="block text-gray-700 text-sm font-bold mb-2">User Mobile</label>
                    <input type="text" name="txtUserMobile" id="txtUserMobile"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserEmail" class="block text-gray-700 text-sm font-bold mb-2">User Email</label>
                    <input type="text" name="txtUserEmail" id="txtUserEmail"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtUserStatus" class="block text-gray-700 text-sm font-bold mb-2">User Status</label>
                    <input type="text" name="txtUserStatus" id="txtUserStatus"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="flex justify-between">
                    <button type="submit" name="btnAdd" id="btnAdd"
                        class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
                        type="button">
                        Add
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
