<%-- 
    Document   : ManageCourse
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Fahmi ZB 
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
     <%@include file="layout_header.jsp" %>
 <body>
     <%@include file="layout_navbar.jsp" %>
     <%@include file="layout_sidebar.jsp" %>
     
     <div class="content">
        <div class="content1">
            <div class="text">
                <h2>Edit Profile</h2>
                <p>Edit your email, password, fullname and phone number</p>

       <!--          <div style="text-align: right;"><img src="books.png" alt="Sunflower"></div>-->
            </div>

        </div>
         <div class="content2 mt-5 ml-5">
            <form>
              <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-5">
                  <input type="email"  name="email" class="form-control" id="email" placeholder="col-form-label">
                </div>
              </div>
              <div class="form-group row">
                <label for="password" class="col-sm-2 col-form-label">Password</label>
                <div class="col-sm-5">
                  <input type="password" name="password" class="form-control" id="password" placeholder="col-form-label">
                </div>
              </div>
              <div class="form-group row">
                <label for="fullname" class="col-sm-2 col-form-label">Fullname</label>
                <div class="col-sm-5">
                  <input type="text" name="fullname" class="form-control" id="fullname" placeholder="col-form-label">
                </div>
              </div>
              <div class="form-group row">
                <label for="phone" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-5">
                  <input type="text" name="phone" class="form-control" id="phone" placeholder="col-form-label">
                </div>
              </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
        
     </div>
 </body>
</html>