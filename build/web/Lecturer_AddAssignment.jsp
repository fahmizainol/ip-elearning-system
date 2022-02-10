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
                     <div class="card-header">Add an Assignment</div>
                     <div class="card-body">
                         <form class="form-horizontal" method="post" action="UploadAssignment" enctype="multipart/form-data" >
                             
                             
                             <div class="form-group">
                                 <label for="subject" class="cols-sm-2 control-label">Course</label>
                                 <select name="course" id="course" class="form-control">
<!--                                     <option>Choose any course</option>-->
                            
                                 <%
                               
                               Connection con;
                               PreparedStatement pst;
                               ResultSet rs;
                               
                               Class.forName("com.mysql.jdbc.Driver");
                               con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root","");
                               String query = "select * from courses";
                               Statement st = con.createStatement();
                               rs = st.executeQuery(query);
                               
                               while(rs.next()){
                                   String id = rs.getString("id");
                                   String course = rs.getString("CourseName");
                                   %>
                                   
                                   <option value="<%=id %>"><%= course %></option>
                                   <%
                                       }
                                   
                               %>
                               
                                    </select>    
                             </div>
                             
                               <br>
                               
                             <div class="form-group">
                                 <label for="title" class="cols-sm-2 control-label">Title</label>
                                 <div class="cols-sm-10">
                                     <div class="input-group">
                                         <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                         <input type="text" class="form-control" name="title" id="name" placeholder="Enter the assignment title" />
                                     </div>
                                 </div>
                             </div>
                               
                               <br>
                             
                             <div class="form-group">
                                        <label for="duedate" class="cols-sm-2 control-label">Due Date:</label>
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                        <input type="date" id="date" name="duedate">
                                         
                                            </div>
                                        </div>
                             </div>
                                 
                               <br>    
                                   
                             <div class="form-group">
                                 <input type="file" name="file" id="file"/>
                             </div>
                               
                               <br>
                  
        
                             <div class="form-group"> 
                                <input type="submit" value="Submit" name="submit" id="submit">
                             </div>
                               
                               <br>
                             
                             <div class="back">
                                 <a href="Lecturer_ViewAssignment.jsp" style="text-align: left;">Back</a>
                             </div>
                                
                         </form>
                     </div>
                 </div>
             </div>
         </div>
     </div>
  
     



</html>
