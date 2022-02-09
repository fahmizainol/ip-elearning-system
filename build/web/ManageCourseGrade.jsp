<%-- 
    Document   : ManageCourseGrade
    Created on : Dec 31, 2021, 4:47:07 PM
    Author     : Adib Khan 
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
                <h2>Manage Course Grade</h2>
                <p>Publish marks and grade to students of their respective courses</p>

       <!--          <div style="text-align: right;"><img src="books.png" alt="Sunflower"></div>-->
            </div>
        </div>
         <p style="margin-left:40%" ><b>Insert Result</b></p>
         
<!--         <div class="dropdown">
            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              SCSJ3234 - Internet Programming
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
              <a class="dropdown-item" href="#">Database</a>
              <a class="dropdown-item" href="#">Genetic Engineering</a>
              <a class="dropdown-item" href="#">Artificial Intelligence</a>
            </div>
          </div>-->

<div class="btn-group">
  <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    SECI3133-Internet Programming
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Action</a>
    <a class="dropdown-item" href="#">Another action</a>
    <a class="dropdown-item" href="#">Something else here</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="#">Separated link</a>
  </div>
</div>
         
        <div class="content2" style="margin-top:100px">
            <div class="mt-4">
                
               <table class="table table-striped table-light border-light">
                    <thead>
                      <tr>
                        <th scope="col">Serial</th>  
                        <th scope="col">Name</th>
                        <th scope="col">Matric</th>
                        <th scope="col">Grade</th>
                        <th scope="col">GPA</th>
                        <th scope="col">Actions</th>
                      </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1.</td>
                            <td>Ahmad Fahmi</td>
                            <td>A18CS3454</td>
                            <td>A+</td>
                            <td>4.00</td>
                            <td>Save | Edit</td>
                        </tr>
                        <tr>
                            <td>2.</td>
                            <td>Ahmad Nadan</td>
                            <td>A18CS3694</td>
                            <td>A+</td>
                            <td>4.00</td>
                            <td>Save | Edit</td>
                        </tr><tr>
                            <td>3.</td>
                            <td>Adib Khan</td>
                            <td>A18CS4747</td>
                            <td>A+</td>
                            <td>4.00</td>
                            <td>Save | Edit</td>
                        </tr><tr>
                            <td>4.</td>
                            <td>Ayaz Adittah</td>
                            <td>A18CS1234</td>
                            <td>B+</td>
                            <td>3.00</td>
                            <td>Save | Edit</td>
                        </tr><tr>
                            <td>5.</td>
                            <td>Hamza Choudhury</td>
                            <td>A18CS3234</td>
                            <td>A+</td>
                            <td>4.00</td>
                            <td>Save | Edit</td>
                        </tr>

                    </tbody>

                  </table>
            </div>
         </div>
        
     </div>
 </body>
</html>