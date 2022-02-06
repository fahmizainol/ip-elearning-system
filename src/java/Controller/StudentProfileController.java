/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAO.StudentDAO;
import Model.Lecturer;
import Model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
 * @author Fahmi ZB 仕事
 */
public class StudentProfileController extends HttpServlet {

    private Student student;
    private StudentDAO sd = new StudentDAO();
    
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
            int studentID = Integer.parseInt(request.getParameter("studentID"));
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String fullname = request.getParameter("fullname");
            String phone = request.getParameter("phone");
            
            student = new Student(studentID, email, password, fullname, phone);
            session.setAttribute("student", student);
            
            sd.updateStudent(student);
            request.getRequestDispatcher("Student_Profile.jsp").forward(request, response);

            
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    
    private void displayProfile(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
            request.getRequestDispatcher("Student_Profile.jsp").forward(request, response);
    }

}


