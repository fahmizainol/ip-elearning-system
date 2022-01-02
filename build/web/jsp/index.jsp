<%-- 
    Document   : index
    Created on : Dec 31, 2021, 9:40:50 PM
    Author     : Fahmi ZB 仕事
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
            <li><a href="<%=request.getContextPath()%>/list"
            class="nav-link">Manage Course</a></li>
    </body>
</html>
