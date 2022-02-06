<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
     <%@include file="layout_header.jsp" %>
     <style>
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
 <body>
     <%@include file="layout_navbar.jsp" %>
     <%@include file="layout_sidebar.jsp" %>
     
      <div class="content">
          <a href="Lecturer_AddAssignment.jsp" class="button">Add Assignment</a>
      

           <div class="col-md-7">
               <div class="panel-body">
                   <table id="tbl-asgn" class="table table-responsive table-bordered" cellpadding="0" width="100%">
                      
                       <thead>
                           <tr>
                               
                               <th style="text-align: center">Course</th>
                               <th style="text-align: center">Title</th>
                               <th style="text-align: center">Due Date</th>
                               <th style="text-align: center">Materials</th>
                               <th style="text-align: center">Edit Assignment</th>
                               <th style="text-align: center">Delete Assignment</th>
                           </tr>
                           
                       <tbody>
                          
                           <%
                               
                               Connection con;
                               PreparedStatement pst;
                               ResultSet rs;
                               
                               Class.forName("com.mysql.jdbc.Driver");
                               con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root","");
//                               String query = "select * from assignment";
                                 String query = "select a.id,a.title,a.duedate,a.Materials, c.courseName from assignment a JOIN courses c ON a.course = c.id";
                               Statement st = con.createStatement();
                               rs = st.executeQuery(query);
                               
                               while(rs.next()){
                                   String id = rs.getString("a.id");
                                   
                               %>
                               
                         
                               <tr>
                                   <td><%= rs.getString("c.courseName") %></td>
                                   <td><%= rs.getString("a.title") %></td>
                                   <td><%= rs.getString("a.duedate") %></td>
                                   <td><%= rs.getBlob("a.Materials") %></td>
                                   <td style="text-align: center"><a href="Lecturer_UpdateAssignment.jsp?id=<%=id %>">Edit</a></td>
                                   <td style="text-align: center"><a href="Lecturer_DeleteAssignment.jsp?id=<%=id %>">Delete</a></td>
                               </tr>
                                <% } %>
                                 </tbody>
                              
                            
                         
                      
                   </table>
               </div>  
                               </div>
           </div>
 </body>
 
 

</html>


