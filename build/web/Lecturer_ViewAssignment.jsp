<%@page import="DBUtility.DBConnection"%>
<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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

            <div class="text">
                <h2>Assignment List:</h2>
                <br>

            </div>

            <div class="col-md-10">
                <div class="panel-body">
                    <table id="tbl-asgn" class="table table-responsive table-bordered" cellpadding="0" width="100%">

                        <thead>
                            <tr>

                                <th style="text-align: center">Course</th>
                                <th style="text-align: center">Title</th>
                                <th style="text-align: center">Created On</th>
                                <th style="text-align: center">Due Date</th>
                                <th style="text-align: center">Instructions & Materials</th>
                                <th style="text-align: center">Action</th>
                                <th style="text-align: center">Action</th>
                                <th style="text-align: center">Action</th>

                            </tr>

                        <tbody>

                            <%

                                Connection con = null;
                                PreparedStatement ps = null;
                                ResultSet rs = null;

                                con = DBConnection.openConnection();

                                String query = "select a.id,a.title,a.duedate,a.filename,a.path,a.added_date, c.courseName from assignment a JOIN courses c ON a.course = c.id";
                                ps = con.prepareStatement(query);
                                rs = ps.executeQuery();

                                while (rs.next()) {
                                    String id = rs.getString("a.id");

                            %>


                            <tr>
                                <td style="text-align: center"><%= rs.getString("c.courseName")%></td>
                                <td style="text-align: center"><%= rs.getString("a.title")%></td>
                                <td style="text-align: center"><%= rs.getString("a.added_date")%></td>
                                <td style="text-align: center"><%= rs.getString("a.duedate")%></td>
                                <td style="text-align: center"><a href="DownloadAssignment?fileName=<%=rs.getString("a.filename")%>">Download</a></td>
                                <td style="text-align: center"><a href="Lecturer_UpdateAssignment.jsp?id=<%=id%>">Edit</a></td>
                                <td style="text-align: center"><a href="Lecturer_DeleteAssignment.jsp?id=<%=id%>">Delete</a></td>
                                <td style="text-align: center"><a href="Lecturer_ViewSubmission.jsp?assignmentId=<%=id%>">Add Grade</a></td>
                            </tr>
                            <% }%>
                        </tbody>




                    </table>
                </div>  
            </div>
        </div>
    </body>



</html>


