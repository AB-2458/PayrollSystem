<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Attendance Details</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>

<body class="bg-gradient-to-r from-blue-500 to-white-700 font-sans leading-normal tracking-normal">

    <div class="flex flex-col h-screen justify-center items-center">
        <div class="w-full md:w-1/3 bg-white rounded shadow-lg p-8 m-4">
            <h2 class="text-center text-white text-2xl font-semibold mb-6">Add Attendance Details</h2>
            <form name="frmAttendanceAdd" action="http://localhost:8082/payrollsystem/SerAttendanceAdd" method="get">
                <div class="mb-4">
                    <label for="txtAttendanceId" class="block text-gray-700 text-sm font-bold mb-2">Attendance Id</label>
                    <input type="text" name="txtAttendanceId" id="txtAttendanceId"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAttendanceName" class="block text-gray-700 text-sm font-bold mb-2">Attendance Name</label>
                    <input type="text" name="txtAttendanceName" id="txtAttendanceName"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAttendanceDescription" class="block text-gray-700 text-sm font-bold mb-2">Attendance
                        Status</label>
                    <input type="text" name="txtAttendanceDescription" id="txtAttendanceDescription"
                        class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline">
                </div>
                <div class="mb-4">
                    <label for="txtAttendanceAmt" class="block text-gray-700 text-sm font-bold mb-2">Attendance Percentage</label>
                    <input type="text" name="txtAttendancePercentage" id="txtAttendancePercentage"
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
                    <a href="attendanceMain.jsp"
                        class="text-blue-500 hover:text-blue-700">Back</a>
                </div>
            </form>
        </div>
    </div>

</body>

</html>
