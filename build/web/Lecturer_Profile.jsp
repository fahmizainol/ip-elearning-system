<%-- 
    Document   : ManageCourse
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Fahmi ZB 
--%>
<%@page import="Model.Lecturer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
     <%@include file="layout_header.jsp" %>
 <body>
     <%@include file="layout_navbar.jsp" %>
     <%@include file="layout_sidebar.jsp" %>
     <%-- Lecturer lect = (Lecturer) request.getSession().getAttribute("lecturer");--%>
     
     <div class="content">
        <div class="content1">
            <div class="text">
                <h2>Edit Profile </h2>
                <p>Edit your email, password, fullname and phone number</p>

       <!--          <div style="text-align: right;"><img src="books.png" alt="Sunflower"></div>-->
            </div>

        </div>
         <div class="content2 mt-5 ml-5">
            <jsp:useBean id="lecturer" class="Model.Lecturer" scope="session"></jsp:useBean>
            <form action="LecturerProfileController" method="GET">
              <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-5">
                  <input type="email"  name="email" class="form-control" id="email"  value='<jsp:getProperty name="lecturer" property="email" />'>
                </div>
              </div>
              <div class="form-group row">
                <label for="password" class="col-sm-2 col-form-label">Password</label>
                <div class="col-sm-5">
                    <input type="password" name="password" class="form-control" id="password" value='<jsp:getProperty name="lecturer" property="password" />'>
                </div>
              </div>
              <div class="form-group row">
                <label for="fullname" class="col-sm-2 col-form-label">Fullname</label>
                <div class="col-sm-5">
                  <input type="text" name="fullname" class="form-control" id="fullname"  value='<jsp:getProperty name="lecturer" property="fullname" />'>
                </div>
              </div>
              <div class="form-group row">
                <label for="phone" class="col-sm-2 col-form-label">Phone</label>
                <div class="col-sm-5">
                  <input type="text" name="phone" class="form-control" id="phone"  value='<jsp:getProperty name="lecturer" property="phone" />'>
                </div>
              </div>
                <input type="hidden" name="lectID" value='<jsp:getProperty name="lecturer" property="id" />'>
                <input type="hidden" name="action" value="update">
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
        
     </div>
 </body>
</html>



