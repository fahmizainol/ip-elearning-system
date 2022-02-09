/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CourseDAO;
import Model.Course;
import Model.Lecturer;
import Model.StudCourse;
import Model.Student;
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
 * @author muham
 */
@WebServlet(name = "CourseStud", urlPatterns = {"/CourseStud"})
public class CourseStud extends HttpServlet {
    
     private CourseDAO coursedb;
    private Course course;
    private StudCourse sCourse;
    private Lecturer lecturer;
    private Student student;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
//            
            String action = request.getParameter("action");
            
            switch(action){
              
                case "register":
                    RegisterCourse(request,response);
                    break;
                default:
                    listCourseStud(request, response);
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
            RequestDispatcher dispatcher = request.getRequestDispatcher("Student_RegisterCourse.jsp");
            dispatcher.forward(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
     private void listCourseStud(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            HttpSession session = request.getSession();
            coursedb = new CourseDAO();
            List<StudCourse> listCourse = coursedb.selectAllCoursesStud();
            session.setAttribute("course", listCourse); 
            RequestDispatcher dispatcher = request.getRequestDispatcher("Student_Homepage.jsp");
            dispatcher.forward(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
     private void RegisterCourse(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            
            HttpSession session = request.getSession();
            student = (Student)session.getAttribute("student");
            coursedb = new CourseDAO();
            
            String courseCode = request.getParameter("courseCode");
            String courseName = request.getParameter("courseName");
            String lect = request.getParameter("lecturer");
            String studName = student.getUsername();
            
            sCourse = new StudCourse(courseCode, courseName, studName, lect);
            
            coursedb.RegisterCourse(sCourse);
            
            listCourse(request,response);
            
            
        } catch(Exception e){
            e.printStackTrace();
        }


    }

   

}
