/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.DownloadAssignment.UPLOAD_DIR;
import static Controller.DownloadAssignment.fileName;
import DAO.AssignmentDAO;
import DAO.SubmissionDAO;
import Model.Assignment;
import Model.Submission;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Rejwan
 */
@WebServlet(name = "SubmitAssignment2", urlPatterns = {"/SubmitAssignment2"})
@MultipartConfig
public class SubmitAssignment2 extends HttpServlet {

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

        // Create path components to save the file    
        Part filePart = request.getPart("file");
        String applicationPath = getServletContext().getRealPath("");
        String fileName = getFileName(filePart);
        String downloadPath = applicationPath + File.separator + UPLOAD_DIR;
        String filePath = downloadPath + File.separator + fileName;
//                Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.

        OutputStream out = null;
        InputStream filecontent = null;
        final PrintWriter writer = response.getWriter();

        try {
            out = new FileOutputStream(new File(filePath));
            filecontent = filePart.getInputStream();

            int read = 0;
            final byte[] bytes = new byte[40096];
            log("here");
            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
        } catch (FileNotFoundException fne) {
            log(fne.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }

        }
        String assignmentId = request.getParameter("id");
        int assignmentIdInt = Integer.parseInt(assignmentId);
        SubmissionDAO sd = new SubmissionDAO();
        Submission submission = null;
        //                public Submission(String status, int assignmentID, String submissionTime, int grade, String file, Boolean empty) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String date = df.format(new Date());
        log("View file name" + UPLOAD_DIR + File.separator + fileName);
        submission = new Submission("Submitted", assignmentIdInt, date, -1, UPLOAD_DIR + File.separator + fileName, "false");
        try {
            sd.addSubmission(submission);
        } catch (SQLException ex) {
            Logger.getLogger(SubmitAssignment2.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher dispatch = request.getRequestDispatcher("SubmitAssignment?assignmentId=" + assignmentId);
        dispatch.forward(request, response);

    }

    private String getFileName(final Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
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
