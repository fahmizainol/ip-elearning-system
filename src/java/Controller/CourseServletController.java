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
                case "update":
                    updateCourse(request, response);
                    break;
                case "withdraw":
                    withdrawCourse(request, response);
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
            HttpSession session = request.getSession();
            coursedb = new CourseDAO();
            List<Course> listCourse = coursedb.selectAllCourses();
            session.setAttribute("listCourse", listCourse); 
            RequestDispatcher dispatcher = request.getRequestDispatcher("Lecturer_HomeManageCourse.jsp");
            dispatcher.forward(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    private void updateCourse(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            HttpSession session = request.getSession();
            lecturer = (Lecturer)session.getAttribute("lecturer");
            coursedb = new CourseDAO();
            
            int courseID = Integer.parseInt(request.getParameter("courseID"));
            String courseCode = request.getParameter("courseCode");
            String courseName = request.getParameter("courseName");
            int studentCount = Integer.parseInt(request.getParameter("studentCount"));
            String lecturerUsername = lecturer.getUsername();
            
            course = new Course(courseID, courseCode, courseName, studentCount, lecturerUsername);

            coursedb.updateCourse(course);
            session.setAttribute("course", course);
            listCourse(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }


    }
    private void withdrawCourse(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            HttpSession session = request.getSession();
            lecturer = (Lecturer)session.getAttribute("lecturer");
            coursedb = new CourseDAO();
            
            int courseID = Integer.parseInt(request.getParameter("courseID"));
            String courseCode = request.getParameter("courseCode");
            String courseName = request.getParameter("courseName");
            int studentCount = Integer.parseInt(request.getParameter("studentCount"));
            String lecturerUsername = "";
            
            course = new Course(courseID, courseCode, courseName, studentCount, lecturerUsername);

            coursedb.withdrawCourse(course);
//            session.setAttribute("course", course);
            listCourse(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }


    }


}
