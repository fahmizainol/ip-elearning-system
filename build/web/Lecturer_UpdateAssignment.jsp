<%@page import="DBUtility.DBConnection"%>
<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");%>

<!DOCTYPE html>
<html lang="en">
     <%@include file="layout_header.jsp" %>
 <body>
     <%@include file="layout_navbar.jsp" %>
     <%@include file="layout_sidebar.jsp" %>
     
     <div class="container mt-5">
         <div class="row justify-content-center">
             <div class="col-md-8">
                 <div class="card">
                     <div class="card-header">Update Assignment</div>
                     <div class="card-body">
                         <form class="form-horizontal" method="post" action="UpdateAssignment">
                             <%
                               Connection con;
                               PreparedStatement pst;
                               ResultSet rs;
                               
                               Class.forName("com.mysql.jdbc.Driver");
                               con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root","");

                               String id = request.getParameter("id");

                               pst = con.prepareStatement("select a.id, a.title, a.duedate, c.courseName from assignment a JOIN courses c ON a.course = c.id where a.id = ?");
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
                                 <a href="Lecturer_ViewAssignment.jsp" style="text-align: left;">Back</a>
                             </div>
                                
                            <% } %>
                         </form>
                     </div>
                 </div>
             </div>
         </div>
     </div>
  
     



</html>
