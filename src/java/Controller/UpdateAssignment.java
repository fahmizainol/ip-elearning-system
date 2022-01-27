package Controller;



import DBUtility.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author muham
 */
@WebServlet(name = "UpdateAssignment", urlPatterns = {"/UpdateAssignment"})
public class UpdateAssignment extends HttpServlet {

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
            
          response.sendRedirect("ViewAssignment.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
             
            