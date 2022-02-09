<%-- 
    Document   : ManageCourseGrade
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Adib Khan 
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
        Hi, Lee
       </div>
     </ul>
   </nav>
     
 <div class="sidebar">
  <a class="active" href="#home">Courses</a>
  <a href="ViewAssignment.jsp">Assignment</a>
  <a href="#contact">Student List</a>
  <a href="#about">Manage Grade</a>
  <a href="#about">Logout</a>
</div>
     
     <div class="content">
        <div class="content1">
            <div class="text">
                <h2>View Course Grade</h2>
                <p>Publish marks and grade to students of their respective courses</p>

       <!--          <div style="text-align: right;"><img src="books.png" alt="Sunflower"></div>-->
            </div>
        </div>
         <p style="margin-left:40%" ><b>Result</b></p>
         
<!--         <div class="dropdown">
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              SCSJ3234 - Internet Programming
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
              <a class="dropdown-item" href="#">Database</a>
              <a class="dropdown-item" href="#">Genetic Engineering</a>
              <a class="dropdown-item" href="#">Artificial Intelligence</a>
            </div>
          </div>-->

<div class="btn-group">
  Session:/Semester:  <button style="margin-top:-5px; margin-left:3px" type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    2021/2022-1
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Action</a>
    <a class="dropdown-item" href="#">Another action</a>
    <a class="dropdown-item" href="#">Something else here</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#">Separated link</a>
  </div>
</div>
         
        <div class="content2" style="margin-top:100px">
            <div class="mt-4">
                
               <table class="mb-5 table table-striped table-light border-light">
                    <thead>
                      <tr>
                        <th scope="col">Code</th>  
                        <th scope="col">Course</th>
                        <th scope="col">GR</th>
                        <th scope="col">MN</th>
                        <th scope="col">KR</th>
                        <th scope="col">JMN</th>
                        <th scope="col">ST</th>
                        <th scope="col"></th>
                        <th scope="col">This Sem</th>
                        <th scope="col">All Sem</th>
                      </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>SCSJ3203</td>
                            <td>Software Engineering Project 1</td>
                            <td>A</td>
                            <td>4.00</td>
                            <td>02</td>
                            <td>8.00</td>
                            <td></td>
                            <td>KD</td>
                            <td>14</td>
                            <td>98</td>
                        </tr>
                                       <tr>
                            <td>SCSJ3203</td>
                            <td>Software Engineering Project 1</td>
                            <td>A</td>
                            <td>4.00</td>
                            <td>02</td>
                            <td>8.00</td>
                            <td></td>
                            <td>KD</td>
                            <td>14</td>
                            <td>98</td>
                        </tr>
                                      <tr>
                            <td>SCSJ3203</td>
                            <td>Software Engineering Project 1</td>
                            <td>A</td>
                            <td>4.00</td>
                            <td>02</td>
                            <td>8.00</td>
                            <td></td>
                            <td>KD</td>
                            <td>14</td>
                            <td>98</td>
                        </tr>
                        <tr>
                            <td>SCSJ3203</td>
                            <td>Software Engineering Project 1</td>
                            <td>A</td>
                            <td>4.00</td>
                            <td>02</td>
                            <td>8.00</td>
                            <td></td>
                            <td>KD</td>
                            <td> 14</td>
                            <td>98</td>
                        </tr> 

                    </tbody>

                  </table>
                
                <table class="table table-striped table-light border-light">
                    <thead>
                        <tr>
                          <h2 style="margin-left: 35%">Conferment Result</h2>
                       </tr>
                      <tr>
                        <p style="margin-left: 42%" >Excellent Pass</p>  
                      </tr>
                      <tr>
                          <h5 style="margin-left: 40%">Grading System</h5>
                       </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>A+ : 4.0</td>
                            <td>A : 4.0</td>
                            <td>A- : 3.67</td>
                        </tr>
                        <tr>
                            <td>B+ : 3.33</td>
                            <td>B : 3.0</td>
                            <td>B- : 2.67</td>
                        </tr>
                        <tr>
                            <td>C+ : 2.33</td>
                            <td>C : 2.0</td>
                            <td>C- : 1.67</td>
                        </tr>
                        <tr>
                            <td>D+ : 1.33</td>
                            <td>D : 1.0</td>
                            <td>D- : 0.67</td>
                        </tr>
                        <tr>
                            <td>E : 0.00</td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            
            <p><b>Guide : </b> GR:Grade MN:Point Value KR:Credit JMN:Total Point Value ST:Status KD:Credit Obtained KK: Credit Counted CE:Credit Transfer PK: Special Exam UM/UK:Repeat Course L:Pass G:Fail TD:Withdraw </p>
            
         </div>
        
     </div>
 </body>
</html>