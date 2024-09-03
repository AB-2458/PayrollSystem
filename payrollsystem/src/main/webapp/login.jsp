<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
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

<div class="flex justify-center items-center h-screen">
    <div class="max-w-md w-full mx-4 bg-white bg-opacity-30 p-6 rounded-lg shadow-lg animate__animated animate__fadeIn">
        <h2 class="text-3xl font-semibold text-white text-center mb-4">Admin Login</h2>
        <form id="loginForm" class="space-y-4">
            <div>
                <label for="username" class="text-white">Username</label>
                <input type="text" id="username" name="username" class="block w-full px-4 py-2 mt-2 rounded-md bg-white bg-opacity-20 text-white" placeholder="Enter your username" required>
            </div>
            <div>
                <label for="password" class="text-white">Password</label>
                <input type="password" id="password" name="password" class="block w-full px-4 py-2 mt-2 rounded-md bg-white bg-opacity-20 text-white" placeholder="Enter your password" required>
            </div>
            <div>
                <button type="submit" class="w-full px-4 py-2 bg-white bg-opacity-75 text-blue-700 font-semibold rounded-md hover:bg-opacity-100 focus:bg-opacity-100 focus:outline-none">Login</button>
            </div>
        </form>
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
    
    const loginForm = document.getElementById('loginForm');
    loginForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;
        
        // Simple validation
        if (username === 'admin' && password === 'admin') {
            // Redirect to admin homepage
            window.location.href = 'admn_homepage.jsp';
        } else {
            // Display error message or handle incorrect credentials
            alert('Invalid username or password. Please try again.');
        }
    });
});
</script>

</body>
</html>
