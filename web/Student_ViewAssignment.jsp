<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
     <%@include file="layout_header.jsp" %>
 <body>
     <%@include file="layout_navbar_student.jsp" %>
        <%@include file="layout_sidebar_student.jsp" %>
     
      <div class="content">
      
           <div class="col-md-5">
               <div class="panel-body">
                   <table id="tbl-asgn" class="table table-responsive table-bordered" cellpadding="0" width="100%">
                      
                       <thead>
                           <tr>
                               
                               <th style="text-align: center">Course</th>
                               <th style="text-align: center">Title</th>
                               <th style="text-align: center">Due Date</th>
                               <th style="text-align: center">Submit Assignment</th>
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
                                   <td style="text-align: center"><a href="SubmitAssignment?assignmentId=<%= id%>">Submit</a></td>
                                   

                               </tr>
                                <% } %>
                                 </tbody>
                              
                            
                         
                      
                   </table>
               </div>  
                               </div>
           </div>
 </body>
 
 

</html>


