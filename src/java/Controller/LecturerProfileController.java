/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CourseDAO;
import DAO.LecturerDAO;
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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Fahmi ZB 
 */
public class LecturerProfileController extends HttpServlet {

    private Lecturer lecturer;
    private LecturerDAO ld = new LecturerDAO();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
//            String action = request.getServletPath();
//            String action = "";
            String action = request.getParameter("action");
            
            switch(action){
                case "update":
                    updateProfile(request, response);
                    break;
                default:
                    displayProfile(request, response);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseServletController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    private void listCourse(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
//        try{
//            coursedb = new CourseDAO();
//            List<Course> listCourse = coursedb.selectAllCourses();
//            request.setAttribute("listCourse", listCourse); 
//            RequestDispatcher dispatcher = request.getRequestDispatcher("Lecturer_HomeManageCourse.jsp");
//            dispatcher.forward(request, response);
//            
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        
//    }
//    
    private void updateProfile(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            HttpSession session = request.getSession();
            Lecturer lecturersession = (Lecturer) request.getSession().getAttribute("lecturer");
            int lectID = Integer.parseInt(request.getParameter("lectID"));
            String email = request.getParameter("email");
            String username = lecturersession.getUsername();
            String password = request.getParameter("password");
            String fullname = request.getParameter("fullname");
            String phone = request.getParameter("phone");
            
            lecturer = new Lecturer(lectID, email, username, password, fullname, phone);
            session.setAttribute("lecturer", lecturer);
            
            ld.updateLecturer(lecturer);
            request.getRequestDispatcher("Lecturer_Profile.jsp").forward(request, response);

            
        } catch(Exception e){
            e.printStackTrace();
        }
//        System.out.println("test");
        RequestDispatcher dispatcher = request.getRequestDispatcher("Lecturer_Profile.jsp");
        dispatcher.forward(request, response);

    }
    
    private void displayProfile(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            request.getRequestDispatcher("Lecturer_Profile.jsp").forward(request, response);
    }

}

