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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RegisterUser", urlPatterns = {"/RegisterUser"})
public class RegisterUser extends HttpServlet {

    
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       UserDAO ud = new UserDAOImp();
       
       String u_name = request.getParameter("u_name");
       String password = request.getParameter("password");
       int r_id = Integer.parseInt(request.getParameter("r_id"));
       String email = request.getParameter("email");
       String phone = request.getParameter("phone");
       
       Users u = new Users(u_name, password,r_id,email,phone);
       
       ud.registerUsers(u);
       request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
       
       
    }

    

}
