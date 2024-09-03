<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Homepage</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
<style>
    .fadeIn {
        animation: fadeIn ease 1s;
    }
    @keyframes fadeIn {
        0% {
            opacity: 0;
        }
        100% {
            opacity: 1;
        }
    }
</style>
</head>
<body class="bg-gradient-to-r from-blue-400 via-purple-400 to-pink-500">

<div class="container mx-auto py-10">
    <div class="text-center animate__animated animate__fadeIn">
        <h2 class="text-3xl font-semibold text-white">Welcome to Admin Panel</h2>
        <p class="text-lg text-white mt-4">Manage Your Employee System with Ease</p>
    </div>
    <div class="mt-12 grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
        <a href="User_Main.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">User Maintenance</h3>
            <p class="text-gray-200">Manage users in the system. Add, edit, or remove users easily.</p>
        </a>
        <a href="attendanceMain.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Attendance Maintenance</h3>
            <p class="text-gray-200">Track and manage attendance records efficiently.</p>
        </a>
        <a href="leaveMain.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Leave Maintenance</h3>
            <p class="text-gray-200">Manage leave requests and approvals.</p>
        </a>
        <a href="Department_Main.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Department Maintenance</h3>
            <p class="text-gray-200">Manage departments and organizational structure.</p>
        </a>
        <a href="Allowance_Main.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Allowance Maintenance</h3>
            <p class="text-gray-200">Manage allowances and benefits for employees.</p>
        </a>
        <a href="Deduction_Main.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Deduction Maintenance</h3>
            <p class="text-gray-200">Manage deductions and withholdings from salaries.</p>
        </a>
        <a href="Salary_Main.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Salary Maintenance</h3>
            <p class="text-gray-200">Manage salary structures and payments.</p>
        </a>
        <a href="PublicHoliday_Main.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Public Holiday Maintenance</h3>
            <p class="text-gray-200">Manage public holidays and office closures.</p>
        </a>
        <a href="Qualification_Main.jsp" class="block bg-white bg-opacity-30 shadow-md hover:shadow-lg rounded-lg overflow-hidden p-6 animate__animated animate__fadeIn">
            <h3 class="text-xl font-semibold text-white mb-4">Qualification Maintenance</h3>
            <p class="text-gray-200">Manage Qualification Details.</p>
        </a>
    </div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js"></script>
<script>
document.addEventListener('DOMContentLoaded', function() {
    anime.timeline({loop: false})
    .add({
        targets: '.animate__fadeIn',
        opacity: [0,1],
        easing: "easeInOutQuad",
        duration: 800,
        delay: anime.stagger(200)
    });
});
</script>

</body>
</html>
