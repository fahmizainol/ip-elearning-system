<%@page import="DBUtility.DBConnection"%>
<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");%>

<!DOCTYPE html>
<html lang="en">
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
     
     <div class="container">
         <div class="row justify-content-center">
             <div class="col-md-8">
                 <div class="card">
                     <div class="card-header">Add an Assignment</div>
                     <div class="card-body">
                         <form class="form-horizontal" method="post" action="../UpdateAssignment">
                             <%
                               Connection conn = null;
                               conn = DBConnection.openConnection();
                               
                               PreparedStatement pst;;
                               ResultSet rs;
                                
                               String id = request.getParameter("id");
//                               String query = "select * from courses";
//                               Statement st = con.createStatement();
//                               rs = st.executeQuery(query);
                               
//                             pst = con.prepareStatement("select * from assignment where id = ?");
                               pst = conn.prepareStatement("select a.id, a.title, a.duedate, c.courseName from assignment a JOIN courses c ON a.course = c.id where a.id = ?");
                               pst.setString(1, id);
                               rs = pst.executeQuery();
                               
                               while(rs.next())
                               {

//                                
                                   %>
                               
                              <div class="form-group">
                                 <label for="course" class="cols-sm-2 control-label">Course</label>
                                 <div class="cols-sm-10">
                                     <div class="input-group">
                                         <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                         <input type="text" class="form-control" name="course" id="name" disabled value="<%= rs.getString("c.courseName")%>">
                                     </div>
                                 </div>
                             </div>
                             
                             
                             <div class="form-group">
                                 <label for="title" class="cols-sm-2 control-label">Title</label>
                                 <div class="cols-sm-10">
                                     <div class="input-group">
                                         <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                         <input type="text" class="form-control" name="title" id="name" value="<%= rs.getString("a.title")%>">
                                     </div>
                                 </div>
                             </div>
                             
                             <div class="form-group">
                                        <label for="date" class="cols-sm-2 control-label">Due Date:</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                        <input type="date" id="date" name="date" value="<%= rs.getString("a.duedate")%>">>
                                         
                                            </div>
                                        </div>
                             </div>
                                 
                                   
                                   
                             <div class="form-group">
                                 <input type="file" id="myFile" name="filename">
                             </div>
                  
        
                             <div class="form-group"> 
                                <input type="submit" value="Submit">
                             </div>
                             
                             <div class="back">
                                 <a href="view assignment.jsp" style="text-align: left;">Back</a>
                             </div>
                                
                            <% } %>
                         </form>
                     </div>
                 </div>
             </div>
         </div>
     </div>
  
     



</html>
