/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.SubmissionDAO;
import Model.Submission;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Rejwan
 */
@WebServlet(name = "GradeAssignment", urlPatterns = {"/GradeAssignment"})

public class GradeAssignment2 extends HttpServlet {

    public static final String UPLOAD_DIR = "resources";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String assignmentId = request.getParameter("id");
        log(assignmentId);
        int assignmentIdInt = Integer.parseInt(assignmentId);

        SubmissionDAO sd = new SubmissionDAO();
        Submission submission = null;

        String file = request.getParameter("file");
        int grade = Integer.parseInt((String) request.getParameter("grade"));
        String submissionTime = request.getParameter("submissionTime");

        submission = new Submission("Graded", assignmentIdInt, submissionTime, grade, file, "true");
        try {
            sd.updateSubmission( submission );
        } catch (SQLException ex) {
            Logger.getLogger(GradeAssignment2.class.getName()).log(Level.SEVERE, null, ex);
        }

        RequestDispatcher dispatch = request.getRequestDispatcher("GradeAssignment?assignmentId=" + assignmentId);
        dispatch.forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
