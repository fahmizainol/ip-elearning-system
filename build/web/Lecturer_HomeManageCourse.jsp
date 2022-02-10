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
                        <th scope="col">Lecturer </th>
                        <th scope="col">Actions </th>
                      </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="c" items="${listCourse}">
                            <!--Condition to check from DB for empty courses-->
                            <%--<c:if test="${c.lecturerUsername eq course.lecturerUsername}">--%>
                            <c:if test="${c.lecturerUsername eq lecturer.username}">
                                <form action="CourseServletController" method="get">
                                    <tr>
                                        <input type="hidden" name="courseID" value="<c:out value='${c.id}' />"/>
                                        <input type="hidden" name="courseCode" value="<c:out value='${c.code}' />"/>
                                        <input type="hidden" name="courseName" value="<c:out value='${c.courseName}' />"/>
                                        <input type="hidden" name="studentCount" value="<c:out value='${c.studentCount}' />"/>                                    
                                        <input type="hidden" name="action" value="withdraw"/>
                                        <td scope="row"><c:out value="${c.id}" /></td>
                                        <td><c:out value="${c.code}" /></td>
                                        <td><c:out value="${c.courseName}" /></td>
                                        <td><c:out value="${c.studentCount}" /></td>
                                        <td><c:out value="${c.lecturerUsername}" /></td>
                                        <td><button type="submit">Withdraw</button></td>

                                    </tr>
                                </form>
                            </c:if>

                        </c:forEach>

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
                        <th scope="col">Lecturer</th>
                        <th scope="col">Actions</th>
                      </tr>
                    </thead>
                    
                        <c:forEach var="c" items="${listCourse}">
                            <!--Condition to check from DB for empty courses-->
                            <%--<c:if test="${c.lecturerUsername ne course.lecturerUsername}">--%>
                            <c:if test="${c.lecturerUsername ne lecturer.username}">
                                <form action="CourseServletController" method="get">
                                    <tr>
                                        <input type="hidden" name="courseID" value="<c:out value='${c.id}' />"/>
                                        <input type="hidden" name="courseCode" value="<c:out value='${c.code}' />"/>
                                        <input type="hidden" name="courseName" value="<c:out value='${c.courseName}' />"/>
                                        <input type="hidden" name="studentCount" value="<c:out value='${c.studentCount}' />"/>                                    
                                        <input type="hidden" name="action" value="update"/>
                                        <td scope="row"><c:out value="${c.id}" /></td>
                                        <td><c:out value="${c.code}" /></td>
                                        <td><c:out value="${c.courseName}" /></td>
                                        <td><c:out value="${c.studentCount}" /></td>
                                        <td><c:out value="${c.lecturerUsername}" /></td>
                                        <c:if test="${c.lecturerUsername eq ''}">
                                            <td><button type="submit">Teach</button></td>
                                        </c:if>        
                                    </tr>
                                </form>
                            </c:if>

                        </c:forEach>

                        
                    

                  </table>
            </div>
        </div>
        
     </div>
 </body>
</html>