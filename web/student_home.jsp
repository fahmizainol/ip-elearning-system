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
     <%@include file="layout_navbar_student.jsp" %>
     <%@include file="layout_sidebar.jsp" %>
     
     <div class="content">
        <div class="content1">
            <div class="text">
                <h2>Manage Course</h2>
                <p>Teach new course or withdraw from the current taught courses</p>

       <!--          <div style="text-align: right;"><img src="books.png" alt="Sunflower"></div>-->
            </div>

        </div>
        <div class="content2">
            <div class="mt-4">
                <p><b>Currently taught courses</b></p>
                <table class="table table-striped table-light border-light">
                    <thead>
                      <tr>
                        <th scope="col">No.</th>
                        <th scope="col">Course Code</th>
                        <th scope="col">Course Title</th>
                        <th scope="col">No. Of Students</th>
                        <th scope="col">Actions</th>
                      </tr>
                    </thead>
                    <tbody>

   

                    </tbody>

                  </table>
            </div>
         </div>
         <div class="content3">
            <div class="mt-5">
                <p><b>Add courses to teach</b></p>
                <table class="table table-striped table-light border-light">
                    <thead>
                      <tr>
                        <th scope="col">No.</th>
                        <th scope="col">Course Code</th>
                        <th scope="col">Course Title</th>
                        <th scope="col">No. Of Students</th>
                        <th scope="col">Actions</th>
                      </tr>
                    </thead>
                    

                        
                    

                  </table>
            </div>
        </div>
        
     </div>
 </body>
</html>