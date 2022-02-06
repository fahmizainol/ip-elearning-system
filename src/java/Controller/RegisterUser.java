/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.LecturerDAO;
import DAO.StudentDAO;
import DAO.UserDAO;
import DAO.UserDAOImp;
import Model.Lecturer;
import Model.Student;
import Model.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "RegisterUser", urlPatterns = {"/RegisterUser"})
public class RegisterUser extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       HttpSession session = request.getSession();
       UserDAO ud = new UserDAOImp();
       
       LecturerDAO ld = new LecturerDAO();
       Lecturer lect = null;
       
       StudentDAO sd = new StudentDAO();
       Student student = null;
       
       
       // SAVE INTO USERS TABLE
       String u_name = request.getParameter("u_name");
       String password = request.getParameter("password");
       int r_id = Integer.parseInt(request.getParameter("r_id"));
       String email = request.getParameter("email");
       String phone = request.getParameter("phone");
       
       
       Users u = new Users(u_name, password,r_id,email,phone);
       
       ud.registerUsers(u);
       
       //SAVE INTO LECTURER TABLE
       String fullname = request.getParameter("fullname");
       if(r_id == 1){
           lect = new Lecturer(email, u_name, password, fullname, phone);
            try {
                ld.insertLecturer(lect);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegisterUser.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       
       //SAVE INTO STUDENT TABLE
       if(r_id == 2){
           student = new Student(email, u_name, password, fullname, phone);
            try {
                sd.insertStudent(student);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegisterUser.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       request.getRequestDispatcher("login.jsp").forward(request, response);
       
       
    }

    

}
