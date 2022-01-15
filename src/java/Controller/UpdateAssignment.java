package Controller;



import DBUtility.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.TimeZone;

@WebServlet(urlPatterns = {"/UpdateAssignment"})
public class UpdateAssignment extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        Connection conn = null;
        conn = DBConnection.openConnection();
        PreparedStatement pst;

//        select a.id, a.title, a.duedate, c.courseName from assignment a JOIN courses c ON a.course = c.id where a.id = ?
        
        String updated_title = request.getParameter("title");
        String updated_date = request.getParameter("date");
//        String course = request.getParameter("course");
      

        try {

            pst = conn.prepareStatement("update assignment set title = ?, duedate = ? where id = ?");
            pst.setString(1, updated_title);
            pst.setString(2,updated_date);
            pst.executeUpdate();
    
//            out.println("Assignment Updated successfuly");
            
            
            pst.close();
            conn.close();
            
          response.sendRedirect("jsp/ViewAssignment.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
             
            