/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Student;
import Model.Submission;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 *
 * @author Rejwan
 */
public class SubmissionDAO {

    String url = "jdbc:mysql://localhost:3306/elearning";
    String user = "root";
    String password = "";
    String jdbcDriver = "com.mysql.jdbc.Driver";

    private static final String UPDATE_SUBMISSION_GRADE_WHERE_ASSIGNMENT_ID = "UPDATE submission SET grade=?, status=?, submissionTime=? WHERE assignmentID=?";
    private static final String SELECT_SUBMISSION_BY_ASSIGNMENT_ID = "select * from submission where assignmentID=?";
    private static final String INSERT_SUBMISSION = "INSERT INTO submission ( status, grade, file, submissionTime, assignmentID) values(?,?,?,?,?)";

    /**
     *
     */
    public SubmissionDAO() {

    }

    protected Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Submission selectSubmission(int assgnId) throws SQLException, ClassNotFoundException {
        Submission submission = null;
        try (Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_SUBMISSION_BY_ASSIGNMENT_ID);) {
            pS.setInt(1, assgnId);
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();

            while (rs.next()) {
//          String status, int assignmentID, String submissionTime, int grade, String file, String empty
                int grade = rs.getInt("grade");
                String submitted = rs.getString("submissionTime");
                String status = rs.getString("status");
                String file = rs.getString("file");
                int assignmentID = rs.getInt("assignmentID");
//                String status, int assignmentID, String submissionTime, int grade, String file
                submission = new Submission(status, assignmentID, submitted, grade, file, "false");
            }
        }
        return submission;
    }

    public void updateSubmission(Submission submission) throws SQLException {
        try {
            Connection conn = getConnection();
            //         "UPDATE submission SET grade=?, status=?, submissionTime=? WHERE assignmentID=?"
            PreparedStatement pS = conn.prepareStatement(UPDATE_SUBMISSION_GRADE_WHERE_ASSIGNMENT_ID);
            pS.setInt(1, submission.getGrade());
            pS.setString(2, submission.getStatus());
            pS.setString(3, submission.getSubmissionTime());
             pS.setInt(4, submission.getAssignmentID() );
            pS.executeUpdate();

        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }

    }

    public void addSubmission(Submission submission) throws SQLException {
        try {
            Connection conn = getConnection();
//            status, grade, file, submissionTime, assignmentID
            PreparedStatement pS = conn.prepareStatement(INSERT_SUBMISSION);
            pS.setString(1, submission.getStatus());
            pS.setInt(2, submission.getGrade());
            pS.setString(3, submission.getFile());
            pS.setString(4, submission.getSubmissionTime()  );
            pS.setInt(5, submission.getAssignmentID());
            pS.executeUpdate();

        } catch (Exception e) {

        }

    }

}
