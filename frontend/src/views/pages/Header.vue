<template>

  <!-- Header -->
  <div id="header">

<div class="top">

    <!-- Logo -->
        <div id="logo">
            <span class="image avatar48"><img src="frontend/images/avatar.jpg" alt="" /></span>
            <h1 id="title">email</h1>
            <p>Role: Name</p>
        </div>

    <!-- Nav -->
        <nav id="nav">
            <ul>
                <li><a href="/" id="top-link"><span class="icon solid fa-home">Home</span></a></li>
                <!-- <li><a href="#portfolio" id="portfolio-link"><span class="icon solid fa-th">Portfolio</span></a></li> -->
                <li><a href="management" id="about-link"><span class="icon solid fa-user-tie">Management</span></a></li>
                <li><a href="meal" id="about-link"><span class="icon solid fa-utensils">Meals</span></a></li>
                <li><a href="product" id="about-link"><span class="icon solid fa-landmark">Products</span></a></li>
                <li><a href="login" id="contact-link"><span class="icon solid fa-user">Login</span></a></li>
                <li><a href="register" id="contact-link"><span class="icon solid fa-id-card">Sign Up</span></a></li>
                <li><a href="logout" id="contact-link"><span class="icon solid fa-user">Logout</span></a></li>
            </ul>
        </nav>

</div>

<div class="bottom">

    <!-- Social Icons -->
        <ul class="icons">
            <!-- <li><a href="#" class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
            <li><a href="#" class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li> -->
            <li><a href="https://github.com/ddavmy" class="icon brands fa-github"><span class="label">Github</span></a></li>
            <li><a href="https://www.linkedin.com/in/jakub-linnert/" class="icon brands fa-linkedin"><span class="label">Linkedin</span></a></li>
            <!-- <li><a href="#" class="icon solid fa-envelope"><span class="label">Email</span></a></li> -->
        </ul>

</div>

</div>

</template>

<script>
export default {
    name: 'Header',
    
};
</script>

<style>

</style>