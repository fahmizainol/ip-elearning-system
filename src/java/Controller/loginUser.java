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
@WebServlet(name = "loginUser", urlPatterns = {"/loginUser"})
public class loginUser extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            HttpSession session = request.getSession();
            UserDAO userlg = new UserDAOImp();
            
            LecturerDAO ld = new LecturerDAO();
            Lecturer lecturer = new Lecturer();
            
            StudentDAO sd = new StudentDAO();
            Student student = new Student();
            
            String usname = request.getParameter("txt_username");
            String password = request.getParameter("txt_password");
            int role = Integer.parseInt(request.getParameter("txt_role"));
            
            String action = request.getParameter("action");
            
            Users u = userlg.checkUser(usname, password, role);
//            if(request.getParameter("btn_login") != null){
            if(usname.equals(u.getU_name())&& password.equals(u.getPassword())&& role==u.getR_id()){
                if(role==1){
                    try {
                        lecturer = ld.selectLecturerByUsername(usname, password);
                        session.setAttribute("lecturer", lecturer);
                        response.sendRedirect("CourseServletController?action=" + action);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(loginUser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(role==2){
                    try {
                        student = sd.selectStudentByUsername(usname, password);
                        session.setAttribute("student", student);
                        response.sendRedirect("CourseStud?action="+ action);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(loginUser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                request.setAttribute("errorMsg", "Invalid username or password or role");
                }
            
            
//        }
    }
    }

