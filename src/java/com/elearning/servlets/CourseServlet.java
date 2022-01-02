/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elearning.servlets;

import com.elearning.db.CourseDB;
import com.elearning.model.Course;
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
    
    private CourseDB coursedb;
    
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
                    listUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void listUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        try{
            coursedb = new CourseDB();
            List<Course> listCourse = coursedb.selectAllCourses();
            request.setAttribute("listCourse", listCourse); 
            RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/ManageCourse.jsp");
            dispatcher.forward(request, response);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }

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
