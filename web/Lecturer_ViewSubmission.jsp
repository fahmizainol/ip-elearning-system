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

                                <th style="text-align: center">#</th>
                                <th style="text-align: center">Status</th>
                                <th style="text-align: center">Grade</th>

                                <th style="text-align: center">Action</th>

                            </tr>

                        <tbody>

                            <%

                                Connection con = null;
                                PreparedStatement ps = null;
                                ResultSet rs = null;

                                con = DBConnection.openConnection();

                                String query = "select * from submission where assignmentID=?";
                                ps = con.prepareStatement(query);
                                System.out.println("works");
                                ps.setString( 1, request.getParameter("assignmentId"));
                                rs = ps.executeQuery();
                                int count = 0;
                                String countString = "";
                                String idString = "";
                                while (rs.next()) {
                                    count++;
                                    countString = String.valueOf(count);
                                    int grade = rs.getInt("grade");
                                    String gradeString = String.valueOf(grade);
                                    String submitted = rs.getString("submissionTime");
                                    String status = rs.getString("status");
                                    String file = rs.getString("file");
                                    int assignmentID = rs.getInt("assignmentID");
                                    idString = String.valueOf(assignmentID);
                            %>                      

                        <tr>
                            <td style="text-align: center"><%= countString%></td>
                            <td style="text-align: center"><%= status%></td>
                            <% if (grade > -1) {%>
                            <td style="text-align: center"><%= gradeString%></td>
                            <% } else {%>
                            <td style="text-align: center"> Not graded yet</td>
                            <% }%>                        
                            <td style="text-align: center"><a href="GradeAssignment?assignmentId=<%=idString%>">Add Grade/ Edit Grade</a></td>
                        </tr>
                        <% }%>
                        </tbody>




                    </table>
                </div>  
            </div>
        </div>
    </body>



</html>


