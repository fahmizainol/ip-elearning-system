<%-- 
    Document   : ManageCourse
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Fahmi ZB 
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <%@include file="layout_header.jsp" %>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        .register{
            display: grid;
            grid-template-columns: 1fr 1fr;
            grid-gap: 20px;
            border: 2px black
        }
        .card-body{
            text-align:start;
        }

    </style>
    <body>
        <%@include file="layout_navbar_student.jsp" %>
        <%@include file="layout_sidebar_student.jsp" %>
        <div class="content">
            <div class="content1">
                <div class="text">
                    <h2> SEMESTER 1-2021/2022</h2>


                </div>

            </div>
            <br>
            
                <h1>Course Overview</h1>
                <br>
                <br>
                <div class="register">
                <%

                    Student student = (Student) request.getSession().getAttribute("student");
                    Connection con;
                    PreparedStatement pst;
                    ResultSet rs;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/elearning", "root", "");
                        //                               String query = "select * from assignment";
                        String query = "select * from studcourse where registerStatus = ? and studentUN = ? ";
                        pst = con.prepareStatement(query);
                        pst.setString(1, "APPROVED");
                        pst.setString(2, student.getUsername());
//                        pst.setString(6, "APPROVED");
                        rs = pst.executeQuery();

                        if (rs.next() == false) {
                            out.println("<h2>No Course Take </h2>");
                        } else {
                            do {

                %>
                <div class="card " style="width: 900px; ">
                    <div class="card-body" >
                        <h3 class="card-title"><%= rs.getString(2)%></h3>
                        <h4 class="card-text"><%= rs.getString(3)%></h4>
                        <a href="" class="btn btn-primary" style="width: 300px">View</a>
                    </div>
                </div>

                <%} while (rs.next());
                        }
                    } catch (Exception e) {
                        e.getStackTrace();
                    }%>

            </div>



    </body>
</html>