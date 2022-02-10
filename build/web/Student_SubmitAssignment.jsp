<%-- 
    Document   : Student_SubmitAssignment.jsp
    Created on : Feb 8, 2022, 5:50:22 PM
    Author     : Rejwan
--%>

<%@page import="Model.Assignment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    Assignment assignment = (Assignment) request.getAttribute("assignment");


%>
<!DOCTYPE html>
<html lang="en">
    <%@include file="layout_header.jsp" %>
    <body>
        <%@include file="layout_navbar_student.jsp" %>
        <%@include file="layout_sidebar_student.jsp" %>
        <div class="content">
            <div class="content1">
                <div class="text">
                    <h2>
                        <%=assignment.getTitle()%>
                        <%= assignment.getId()%>
                    </h2>
                    <a href="DownloadPdf?file=<%=assignment.getPath()%>">
                        Download
                    </a>
                </div>
            </div>
            <div class="content2">
                <!--Trial-->
                File: <br />

                <form method="POST" action="SubmitAssignment2" enctype="multipart/form-data" >

                    File:
                    <input type="file" name="file" id="file" /> <br/>
                    Destination:
                    <input type="text" value="/" name="destination"/>
                    </br>
                    <input type="submit" value="Upload" name="upload" id="upload" />
                </form>
            </div>


    </body>
</html>
