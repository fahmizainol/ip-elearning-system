<%@page import="DBUtility.DBConnection"%>
<%@page import="java.sql.*" %>



<%
    String assignmentid = request.getParameter("id");
    Connection conn = null;
    conn = DBConnection.openConnection();
        
        PreparedStatement pst;
      

        pst = conn.prepareStatement("delete from assignment where id = ?");
        pst.setString(1, assignmentid);
        pst.executeUpdate();
    
        out.println("Assignment deleted successfuly");
        
        response.sendRedirect("Lecturer_ViewAssignment.jsp");
        

            
            
         
%>