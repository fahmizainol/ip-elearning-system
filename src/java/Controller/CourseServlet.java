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
 * @author Fahmi ZB 仕事
 */
@WebServlet("/")
public class CourseServlet extends HttpServlet {
    
    private CourseDAO coursedb;
    
//    protected CourseServlet() throws ServletException{
//        coursedb = new CourseDB();
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
            String action = request.getServletPath();
            
            switch(action){
                case "/new":
                    System.out.println("");
                    break;
                default:
                    listCourse(request, response);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void listCourse(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            coursedb = new CourseDAO();
            List<Course> listCourse = coursedb.selectAllCourses();
            request.setAttribute("listCourse", listCourse); 
            RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/ManageCourse.jsp");
            dispatcher.forward(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
//    private void addCourse(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
//
//    }


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
