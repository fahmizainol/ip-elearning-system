/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Assignment;
import Model.Student;
import Model.Submission;
import static java.rmi.server.LogStream.log;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Rejwan
 */
public class AssignmentDAO {

    String url = "jdbc:mysql://localhost:3306/elearning";
    String user = "root";
    String password = "";
    String jdbcDriver = "com.mysql.jdbc.Driver";

    private static final String SELECT_ASSIGNMENT_BY_ID = "select * from assignment where id=?";

    /**
     *
     */
    public AssignmentDAO() {

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

    public Assignment selectAssignmentFromBlob(int id) throws SQLException, ClassNotFoundException {
        Assignment assignment = null;
        try (Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_ASSIGNMENT_BY_ID);) {
            pS.setInt(1, id);
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();

            while (rs.next()) {
                int course = rs.getInt("course");
                String title = rs.getString("title");
                String duedate = rs.getString("duedate");
                Blob MaterialsBlob = rs.getBlob("Materials");
                int myblobLength = (int) MaterialsBlob.length();
                byte[] MaterialsBytes = MaterialsBlob.getBytes(1, myblobLength);
                BASE64Encoder base64Encoder = new BASE64Encoder();
                StringBuilder imageString = new StringBuilder();
                imageString.append("data:image/jpg;base64,");
                imageString.append(base64Encoder.encode(MaterialsBytes));
                String Materials = imageString.toString();
                log(Materials);
                MaterialsBlob.free();
//                byte[] Materials = MaterialsBlob.getBytes(1, (int) MaterialsBlob.length);
//                byte[] Materials = new byte[0];
//             int id, String title, String duedate, int course, Blob Materials
//                assignment = new Assignment(id, title, duedate, course, Materials);
            }
        }
        return assignment;
    }

    public Assignment selectAssignment(int id) throws SQLException, ClassNotFoundException {
        Assignment assignment = null;
        try (Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_ASSIGNMENT_BY_ID);) {
            pS.setInt(1, id);
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();

            while (rs.next()) {
                int course = rs.getInt("course");
                String title = rs.getString("title");
                String duedate = rs.getString("duedate");
                String filename = rs.getString("filename");
                String path = rs.getString("path");

//                byte[] Materials = MaterialsBlob.getBytes(1, (int) MaterialsBlob.length);
//                byte[] Materials = new byte[0];
//             int id, String title, String duedate, int course, Blob Materials
                assignment = new Assignment(id, title, duedate, course, filename, path);
            }
        }
        return assignment;
    }

}
