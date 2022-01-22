package Controller;



import DBUtility.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.TimeZone;

/**
 *
 * @author muham
 */

public class Assignment extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

//        String driver = "com.mysql.jdbc.Driver";
//        String dburl = "jdbc:mysql://localhost:3306/elearning";
//        String dbuname = "root";
//        String dbpwd = "";

        Connection conn = null;

        String title = request.getParameter("title");
        String date = request.getParameter("date");
        String course = request.getParameter("course");
      

        try {
//            Class.forName(driver);
//            Connection con = DriverManager.getConnection(dburl, dbuname, dbpwd);
            conn = DBConnection.openConnection();
            
            PreparedStatement pst;
            
            pst = conn.prepareStatement("insert into assignment(title, duedate, course)values(?,?,?)");
            pst.setString(1, title);
            pst.setString(2,date);
            pst.setString(3, course);
            pst.executeUpdate();
    
            System.out.println("Assignment Added successfuly");
            
            
            pst.close();
            conn.close();
            
            response.sendRedirect("jsp/ViewAssignment.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
             
            