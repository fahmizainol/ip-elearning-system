/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CourseDAO;
import Model.Course;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author muham
 */
@WebServlet(name = "RegisterCourseServlet", urlPatterns = {"/RegisterCourseServlet"})
public class RegisterCourseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CourseDAO cDAO;
    
    public RegisterCourseServlet(){
        this.cDAO = new CourseDAO();
    }
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            List<Course> listC = null;
        try {
            listC = cDAO.selectAllCourses();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterCourseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            request.setAttribute("listC", listC);
            RequestDispatcher dispatch = request.getRequestDispatcher("RegisterSub.jsp");
            dispatch.forward(request, response);
        
        
    }



}
