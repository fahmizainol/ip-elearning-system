package Controller;


import DBUtility.DBConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.TimeZone;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;

@WebServlet(name = "Assignment", urlPatterns = {"/Assignment"})
@MultipartConfig(maxFileSize = 16177215)

public class Assignment extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        String title = request.getParameter("title");
        String date = request.getParameter("date");
        String course = request.getParameter("course");
        
        InputStream inputStream = null; // input stream of the upload file
        
        Part filePart = request.getPart("file");
        
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        
        Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client
      

        try {
            conn = DBConnection.openConnection();
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO assignment(title, duedate, course, Materials)values(?,?,?,?)");
            pst.setString(1, title);
            pst.setString(2, date);
            pst.setString(3, course);
            
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                pst.setBlob(4, inputStream);
            }
            
             // sends the statement to the database server
            int row = pst.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }
  
            
            pst.close();
            conn.close();
            
//            response.sendRedirect("Lecturer_ViewAssignment.jsp");
            
       } catch (Exception ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            request.setAttribute("Message", message);
             
            // forwards to the message page
            getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
        }
    }
}
             
            