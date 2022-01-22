/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UserDAO;
import DAO.UserDAOImp;
import Model.Users;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "loginUser", urlPatterns = {"/loginUser"})
public class loginUser extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            UserDAO userlg = new UserDAOImp();
            String usname = request.getParameter("u_name");
            String password = request.getParameter("password");
            int role = Integer.parseInt(request.getParameter("r_id"));
            
            Users u = userlg.checkUser(usname, password, role);
            if(request.getParameter("btn_login") != null){
            if(usname.equals(u.getU_name())&& password.equals(u.getPassword())&& role==u.getR_id()){
                if(role==1){
                    request.getRequestDispatcher("/jsp/teacher_home.jsp").forward(request, response);
                }else if(role==2){
                    request.setAttribute("message", u.getU_name());
                    RequestDispatcher dispatch = request.getRequestDispatcher("jsp/student_home.jsp");
                    dispatch.forward(request, response);
            }
            } else {
                request.setAttribute("errorMsg", "Invalid username or password or role");
                }
            
            
        }
    }
    }

