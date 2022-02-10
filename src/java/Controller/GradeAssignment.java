/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.AssignmentDAO;
import DAO.SubmissionDAO;
import Model.Assignment;
import Model.Submission;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rejwan
 */
@WebServlet(name = "GradeAssignment", urlPatterns = {"/GradeAssignment"})

public class GradeAssignment extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int assignmentId = Integer.parseInt((String) request.getParameter("assignmentId"));
        Assignment assignment = null;
        Submission submission = null;

        AssignmentDAO ad = new AssignmentDAO();
        SubmissionDAO sd = new SubmissionDAO();

        try {
            log(assignmentId + " ");
            assignment = ad.selectAssignment(assignmentId);
            submission = sd.selectSubmission(assignmentId);
            log(submission.getStatus());

        } catch (SQLException | ClassNotFoundException | NullPointerException ex) {
            log(ex.getMessage());
            log("still no?");
//                public Submission(String status, int assignmentID, String submissionTime, int grade, String file, Boolean empty) {
            submission = new Submission("Not submitted", assignmentId, "Not submitted yet", -1, "Not submitted yet", "true");
        }
        request.setAttribute("assignment", assignment);
        request.setAttribute("submission", submission);

        RequestDispatcher dispatch = request.getRequestDispatcher("Lecturer_SubmitGrade.jsp");
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
