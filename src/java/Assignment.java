

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(urlPatterns = {"/assignments"})
public class Assignment extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String driver = "com.mysql.jdbc.Driver";
        String dburl = "jdbc:mysql://localhost:3306/elearning";
        String dbuname = "root";
        String dbpwd = "";

       

        String title = request.getParameter("title");
        String date = request.getParameter("date");
      

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(dburl, dbuname, dbpwd);
            
            PreparedStatement pst;
            
            pst = con.prepareStatement("insert into assignment(title, duedate)values(?,?)");
            pst.setString(1, title);
            pst.setString(2,date);
            pst.executeUpdate();
    
            System.out.println("Assignment Added successfuly");
            
            
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
             
            