<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
 <head>
   <meta charset="UTF-8" />
   <meta http-equiv="X-UA-Compatible" content="IE=edge" />
   <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   
   <link rel="stylesheet" href="../css/Assignment.css" />
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> 
   
   <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
   <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   
   
    <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge" />
   <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   
   <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
   <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"> 
   
   
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

div.container{
    padding: 20px;
}

div.content {
  margin-left: 200px;
  padding: 1px 16px;
  height: 1000px;
  padding: 20px;
  
}

div.content1{
    padding: 10px;
/*    border-style: solid;*/
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

.button{
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  float: right;
   
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
  <a href="jsp/ManageCourse.jsp">Courses</a>
  <a class="active" href="#news">Assignment</a>
  <a href="#contact">Student List</a>
  <a href="#about">Manage Grade</a>
  <a href="#about">Logout</a>
</div>
     
      <div class="content">
          <a href="AddAssignment.jsp" class="button">Add Assignment</a>
      
 
           <div class="content1">
           <div class="col-md-6">
               <div class="panel-body">
                   <table id="tbl-asgn" class="table table-responsive table-bordered" cellpadding="0" width="100%">
                      
                       <thead>
                           <tr>
                               
                               <th>Course</th>
                               <th>Title</th>
                               <th>Due Date</th>
                               <th>Edit</th>
                               <th>Delete</th>
                           </tr>
                           
                       <tbody>
                          
                           <%
                               
                               Connection con;
                               PreparedStatement pst;
                               ResultSet rs;
                               
                               Class.forName("com.mysql.jdbc.Driver");
                               con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root","");
//                               String query = "select * from assignment";
                                 String query = "select a.id,a.title,a.duedate, c.courseName from assignment a JOIN courses c ON a.course = c.id";
                               Statement st = con.createStatement();
                               rs = st.executeQuery(query);
                               
                               while(rs.next()){
                                   String id = rs.getString("a.id");
                                   
                               %>
                               
                         
                               <tr>
                                   <td><%= rs.getString("c.courseName") %></td>
                                   <td><%= rs.getString("a.title") %></td>
                                   <td><%= rs.getString("a.duedate") %></td>
                                   <td><a href="updateAssignment.jsp?id=<%=id %>">Edit</a></td>
                                   <td><a href="deleteAssignment.jsp?id=<%=id %>">Delete</a></td>
                               </tr>
                                <% } %>
                                 </tbody>
                              
                            
                         
                      
                   </table>
               </div>  
                               </div>
           </div>
 </body>
 
 

</html>


