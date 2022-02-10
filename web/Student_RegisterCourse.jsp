<%-- 
    Document   : ManageCourse
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Fahmi ZB 
--%>
<%@page import="Model.Student"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="layout_header.jsp" %>
    <style>

        .Tab1, th{
            background: #DFA6FA;
            border-radius: 20px;
        }
        .Cname2{
            text-align: center;
            background-color: gray;

        }

    </style>
    <body>
        <%@include file="layout_navbar_student.jsp" %>
        <%@include file="layout_sidebar_student.jsp" %>
        <div class="content">
            <div class="content1">
                <div class="text">
                    <h2>Course Registration</h2>


                </div>

            </div>
            <div class="content2">
                <br>
                <p><b>Your Course Pick </b></p>
                <br>
                
                <table class="table table-striped table-light border-light">
                    <thead>
                        <tr class="Tab1">
                            <th scope="col">No.</th>
                            <th scope="col">Course Code</th>
                            <th scope="col">Course Title</th>
                            <th scope="col">Lecturer</th>
                            <th scope="col">Status</th>
                            <th scope="col">Action</th>
                        </tr>
                    </thead>
                   
                    <tbody>
                    <%

                        Student student = (Student)request.getSession().getAttribute("student");
                        Connection con;
                        PreparedStatement pst;
                        ResultSet rs;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root", "");
//                               String query = "select * from assignment";
                            String query = "select * from studcourse where studentUN = ? ";
                            pst = con.prepareStatement(query);
                            pst.setString(1, student.getUsername() );
                            rs = pst.executeQuery();

                            if (rs.next() == false) {
                                out.println("<tr> <td>No Records <td>");
                            } else {
                                do {
                    %>
                    
                        <td><%= rs.getString(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getString(3)%></td>
                        <td><%= rs.getString(5)%></td>
                        <td><%= rs.getString(6)%></td>
                        <td><a href="dropCourse.jsp?id=<%=rs.getString("id") %>"><button type="button" class="delete">Drop</button></a></td>
                        
                    </tr>
                    <%} while (rs.next());
                            }
                        } catch (Exception e) {
                            e.getStackTrace();
                        }%>
                    </tbody>

                </table>
            </div>


            <div class="content3">
                <br>
                <p><b>List of course </b></p>
                
                <br>
                <table class="table table-striped table-light border-light">
                    <thead>
                        <tr class="Tab1">
                            <th scope="col">No.</th>
                            <th scope="col">Course Code</th>
                            <th scope="col">Course Title</th>
                            <th scope="col">No. Of Students</th>
                            <th scope="col">Lecturer</th>
                            <th scope="col">Actions</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="c" items="${listCourse}">
                        <form name="form" action="CourseStud" method="get">
                            <tr>
                            <input type="hidden" name="courseID" value="<c:out value='${c.id}' />"/>
                            <input type="hidden" name="courseCode" value="<c:out value='${c.code}' />"/>
                            <input type="hidden" name="courseName" value="<c:out value='${c.courseName}' />"/>
                            <input type="hidden" name="studentCount" value="<c:out value='${c.studentCount}' />"/>
                            <input type="hidden" name="lecturer" value="<c:out value='${c.lecturerUsername}' />"/> 
                            <input type="hidden" name="action" value="register"/>
                            <td scope="row"><c:out value="${c.id}" /></td>
                            <td><c:out value="${c.code}" /></td>
                            <td><c:out value="${c.courseName}" /></td>
                            <td><c:out value="${c.studentCount}" /></td>
                            <td><c:out value="${c.lecturerUsername}" /></td>
                            <td><button type="submit" name="register" >Register</button></td>

                            </tr>
                        </form>

                    </c:forEach>

                    </tbody>

                </table>
            </div>
    </body>
</html>