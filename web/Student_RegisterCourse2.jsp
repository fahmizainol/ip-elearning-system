<%-- 
    Document   : ManageCourse
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Fahmi ZB 
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
        <%@include file="layout_navbar.jsp" %>
        <%@include file="layout_sidebar.jsp" %>
        <div class="content">
            <div class="content1">
                <div class="text">
                    <h2>Course Registration</h2>


                </div>

            </div>
            <div class="content2">
                <h1>List of course </h1>
                <br>
                <br>
                <table class="table table-striped table-light border-light">
                    <thead>
                        <tr class="Tab1">
                            <th scope="col">No.</th>
                            <th scope="col">Course Code</th>
                            <th scope="col">Course Title</th>
                            <th scope="col">Lecturer</th>
                            <th scope="col">Actions</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="c" items="${course}">
                        <form name="form" action="CourseStud" method="get">
                            <tr>
                            <input type="hidden" name="courseID" value="<c:out value='${c.id}' />"/>
                            <input type="hidden" name="courseCode" value="<c:out value='${c.code}' />"/>
                            <input type="hidden" name="courseName" value="<c:out value='${c.courseN}' />"/>
                            <input type="hidden" name="lecturer" value="<c:out value='${c.lecturer}' />"/> 
                            <input type="hidden" name="action" value="register"/>
                            <td><c:out value="${c.id}" /></td>
                            <td><c:out value="${c.code}" /></td>
                            <td><c:out value="${c.courseN}" /></td>
                            <td><c:out value="${c.lecturer}" /></td>
                            <td><button type="submit" name="drop" >Drop</button></td>

                            </tr>
                        </form>

                    </c:forEach>

                    </tbody>


                </table>
            </div>
    </body>
</html>