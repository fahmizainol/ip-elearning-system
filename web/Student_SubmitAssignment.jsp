<%-- 
    Document   : Student_SubmitAssignment.jsp
    Created on : Feb 8, 2022, 5:50:22 PM
    Author     : Rejwan
--%>

<%@page import="Model.Submission"%>
<%@page import="Model.Assignment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    Assignment assignment = (Assignment) request.getAttribute("assignment");
    Submission submission = (Submission) request.getAttribute("submission");


%>
<!DOCTYPE html>
<html lang="en">
    <%@include file="layout_header.jsp" %>
    <body>
        <%@include file="layout_navbar_student.jsp" %>
        <%@include file="layout_sidebar_student.jsp" %>
        <style>
            input#file-upload-button{
                border:  1px solid green !important;
                background-color: white !important;
            }
        </style>
        <div class="content">
            <div class="content1" style="padding-top: 10px; padding-bottom: 10px;">
                <div class="text">
                    <h2>
                        <%=assignment.getTitle()%>
                    </h2>
                    <p> Answer the questions in the pdf given. Compile your answers in pdf form and submit. </p>
                    <p> 
                        <a href="DownloadPdf?file=<%=assignment.getPath()%>" class="d-block">
                            Download your assignment
                        </a>
                    </p>

                    <p> Assigned due at: <%= assignment.getDuedate()%></p>
                    <p class="alert alert-danger"> Students not submitting by time will be penalized. </p>
                </div>
            </div>
            <div class="content2 my-1 py-5 px-4">
                <!--Trial-->
                <h5> Your submission </h5>
                <!--status	submissionTime	grade	file	assignmentID-->
                <!--Submission("Not submitted", assignmentId, "Not submitted yet", -1, "Not submitted yet", true);-->
                <ul class="list-group">
                    <li class="list-group-item"> <span class="w-25 w-lg-50 d-inline-block"> Submitted : </span>  <%= submission.getStatus()%></li>
                    <li class="list-group-item"> <span class="w-25 w-lg-50 d-inline-block"> Submitted at: </span> <%= submission.getSubmissionTime()%> </li>
                        <% if (submission.getGrade() > -1) {%>
                    <li class="list-group-item"> <span class="w-25 w-lg-50 d-inline-block"> Grade: </span> <%=  submission.getGrade()%> </li>
                        <% } %>

                    <% if (submission.getEmpty() == "false") {%>
                    <li class="list-group-item">
                        <span class="w-25 w-lg-50 d-inline-block"> Submission : </span> <a href="DownloadPdf?file=<%=submission.getFile()%>" class="btn btn-success btn-sm text-light"> Submitted assignment </a>
                    </li>
                    <% } %>
                    <% if (submission.getEmpty() == "true") {%>
                    <li class="list-group-item pb-2">
                        <p> Submit your assignment ! <p>
                        <form method="POST" action="SubmitAssignment2" enctype="multipart/form-data" class="pb-2" >
                            <input type="file" name="file" id="file" class="btn btn-sm d-inline-block" style="margin-left: -10px;" /> 
                            <input  name="id" value="<%=assignment.getId()%>" id="file" class="btn btn-sm d-none" /> 
                            <br/>
                            <input type="submit" value="Upload" name="upload" id="upload" class="btn btn-sm btn-outline-success d-inline-block "  />
                        </form>
                    </li>
                    <% }%>
                </ul>
            </div>

        </div>
    </body>
</html>
