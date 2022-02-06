/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CourseDAO;
import Model.Course;
import Model.Lecturer;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Fahmi ZB 仕事
 */
@WebServlet(name = "CourseServlet", urlPatterns = {"/CourseServlet"})
public class CourseServletController extends HttpServlet {
    
    private CourseDAO coursedb;
    private Course course;
    private Lecturer lecturer;
    
//    protected CourseServlet() throws ServletException{
//        coursedb = new CourseDB();
//
//    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
//            String action = request.getServletPath();
//            String action = "";
            String action = request.getParameter("action");
            
            switch(action){
                case "/new":
                    System.out.println("");
                    break;
                case "update":
                    updateLecturer(request, response);
                    break;
                default:
                    listCourse(request, response);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseServletController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void listCourse(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            coursedb = new CourseDAO();
            List<Course> listCourse = coursedb.selectAllCourses();
            request.setAttribute("listCourse", listCourse); 
            RequestDispatcher dispatcher = request.getRequestDispatcher("Lecturer_HomeManageCourse.jsp");
            dispatcher.forward(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    private void updateLecturer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            HttpSession session = request.getSession();
            lecturer = (Lecturer)session.getAttribute("lecturer");
            
            int courseID = Integer.parseInt(request.getParameter("courseID"));
            String lecturerUsername = lecturer.getUsername();
            
            course = new Course(courseID, lecturerUsername);
            coursedb = new CourseDAO();
            coursedb.updateLecturer(course);
            listCourse(request, response);
//            response.sendRedirect("view");
//            RequestDispatcher dispatcher = request.getRequestDispatcher("teacher_home.jsp");
//            dispatcher.forward(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }
//        System.out.println("test");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
//        dispatcher.forward(request, response);

    }
    


}
