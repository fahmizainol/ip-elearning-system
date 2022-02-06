<%-- 
    Document   : ManageCourse
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Fahmi ZB 
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="../css/Dashboard2.css" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> 
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            /* UTILITIES */
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }
            body {
                font-family: cursive;
            }
            a {
                text-decoration: none;
            }
            li {
                list-style: none;
            }

            /* NAVBAR STYLING STARTS */
            .navbar {
                display: flex;
                align-items: center;
                justify-content: space-between;
                padding: 20px;
                background-color: teal;
                color: #fff;
            }
            .nav-links a {
                color: #fff;
            }
            /* LOGO */
            .logo {
                font-size: 32px;
            }
            /* NAVBAR MENU */
            .menu {
                display: flex;
                gap: 1em;
                font-size: 18px;
            }
            .menu li:hover {
                background-color: #4c9e9e;
                border-radius: 5px;
                transition: 0.3s ease;
            }
            .menu li {
                padding: 5px 14px;
            }
            /* DROPDOWN MENU */
            .services {
                position: relative; 
            }
            .dropdown {
                background-color: rgb(1, 139, 139);
                padding: 1em 0;
                position: absolute; /*WITH RESPECT TO PARENT*/
                display: none;
                border-radius: 8px;
                top: 35px;
            }
            .dropdown li + li {
                margin-top: 10px;
            }
            .dropdown li {
                padding: 0.5em 1em;
                width: 8em;
                text-align: center;
            }
            .dropdown li:hover {
                background-color: #4c9e9e;
            }
            .services:hover .dropdown {
                display: block;
            }

            /*sidebar*/
            .sidebar {
                margin: 0;
                padding: 0;
                width: 200px;
                background-color: #f1f1f1;
                position: fixed;
                height: 100%;
                overflow: auto;
            }

            .sidebar a {
                display: block;
                color: black;
                padding: 40px;
                text-decoration: none;
            }

            .sidebar a.active {
                background-color: #04AA6D;
                color: white;
            }

            .sidebar a:hover:not(.active) {
                background-color: #555;
                color: white;
            }

            div.content {
                margin-left: 200px;
                padding: 1px 16px;
                height: 1000px;
                padding: 30px;
            }

            div.content1{
                padding: 40px;
                border-style: solid;
            }

            img {
                width: 250px;
                height: 250px;
                text-align: right;
            }

            @media screen and (max-width: 700px) {
                .sidebar {
                    width: 100%;
                    height: auto;
                    position: relative;
                }
                .sidebar a {float: left;}
                div.content {margin-left: 0;}
            }

            @media screen and (max-width: 400px) {
                .sidebar a {
                    text-align: center;
                    float: none;
                }
            }
        </style>
        <title>Document</title>
    </head>
    <body>


        <nav class="navbar">
            <!-- LOGO -->
            <div class="logo">E-learning</div>
            <!-- NAVIGATION MENU -->
            <ul class="nav-links">
                <!-- NAVIGATION MENUS -->
                <div class="menu">
                    <!--           <li><a href="/">Contacts</a></li>-->
                    <li><a><%= session.getAttribute("student_login")%></a></li>
                    <li class="services">
                        <a href="/">Profile</a>
                        <!-- DROPDOWN MENU -->
                        <ul class="dropdown">
                            <li><a href="/">My Profile </a></li>
                            <li><a href="/">Settings</a></li>  
                        </ul>

                    </li>
                    <li><a href="/">Contacts</a></li>




                </div>
            </ul>
        </nav>

        <div class="sidebar">
            <a class="active" href="#home">Courses</a>
            <a href="#news">Assignment</a>
            <a href="#contact">Student List</a>
            <a href="#about">Manage Grade</a>
            <a href="#about">Logout</a>
        </div>

        <div class="content">
            <div class="content1">
                <div class="text">
                    <h2>Choose your course</h2>


                </div>

            </div>
            <div class="register">
                <h1>List of course available </h1>
                <br>
                <br>
                <table class="tableCo" style="width:100%">
                    <tr class="Cname1">
                        <th>No. </th>
                        <th>Course Code </th>
                        <th>Course Name </th>
                        <th>Section</th>
                        <th>Lecturer </th>


                    </tr>
                   
                    <c:forEach var="course" items="${listC}">
                        <tr class="Cname2" >
                            <td> ${course.id}</td>
                            <td><c:out value="${course.code}" /></td>
                            <td><c:out value="${course.courseName}" /></td>
                            <td><c:out value="${course.studentCount}" /></td>

                            <td><form action="enrol" method="get">
                                    <input type="submit" value="enroll">

                                </form></td>

                        </tr>
                    </c:forEach>
                    </body>
                    </html>