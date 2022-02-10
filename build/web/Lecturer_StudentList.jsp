<%-- 
    Document   : Lecturer_StudentList
    Created on : Feb 10, 2022, 12:10:02 AM
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
                <h2>Student List</h2>
                <p>View student list and approve or reject students registration</p>

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
                        <th scope="col">Student username</th>
                        <th scope="col">Lecturer username</th>
                        <th scope="col">Register status </th>
                        <th scope="col">Actions </th>
                      </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="c" items="${studentList}">
                                <form action="CourseStud" method="get">
                                    <tr>
                                
                                        <input type="hidden" name="action" value="updatestatus"/>
                                        <input type="hidden" name="id" value="<c:out value='${c.id}'/>"/>
                                        <td scope="row"><c:out value="${c.id}" /></td>
                                        <td><c:out value="${c.code}" /></td>
                                        <td><c:out value="${c.courseN}" /></td>
                                        <td><c:out value="${c.studentUN}" /></td>
                                        <td><c:out value="${c.lecturer}" /></td>
                                        <td><c:out value="${c.registerStatus}" /></td>
                                        <td><button type="submit" name="status" value="APPROVED">Approve</button> | <button type="submit" name="status" value="REJECTED" >Reject</button></td>

                                    </tr>
                                </form>
                        
                        </c:forEach>

                    </tbody>

                  </table>
            </div>
         </div>
 
        
     </div>
 </body>
</html>