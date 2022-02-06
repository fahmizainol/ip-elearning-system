<%-- 
    Document   : navbar
    Created on : Feb 6, 2022, 2:21:00 PM
    Author     : Fahmi ZB 
--%>

<!--INCLUDE IN EACH JSP FILE-->
<head>
    <link rel="stylesheet" href="css/Dashboard2.css" />
</head>
<nav class="navbar">
  <!-- LOGO -->
  <div class="logo">E-learning</div>
  <!-- NAVIGATION MENU -->
  <ul class="nav-links">
    <!-- NAVIGATION MENUS -->
    <div class="menu">
<!--           <li><a href="/">Contacts</a></li>-->
         <li class="services">
        <a href="#">Profile</a>
        <!-- DROPDOWN MENU -->
        <ul class="dropdown">
          <li><a href="Lecturer_Profile.jsp">My Profile </a></li>
          <li><a href="/">Settings</a></li>  
        </ul>

      </li>
      <li><a href="/">Contacts</a></li>




    </div>
  </ul>
</nav>