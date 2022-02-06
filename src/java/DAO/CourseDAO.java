/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBUtility.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Model.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class CourseDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    private static final String SELECT_ALL_COURSES = "select * from courses";
    private static final String INSERT_LECTURER = "";

    /**
     *
     */
    public CourseDAO() {

    }

    public List<Course> selectAllCourses()  {
        List<Course> courses = new ArrayList<>();
        try {
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement("select * from courses");
            rs = ps.executeQuery();

            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getInt("id"));
                c.setCode( rs.getString("code"));
                c.setCourseName(rs.getString("courseName"));
                c.setStudentCount( rs.getInt("studentCount"));
            
                courses.add(c);

            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return courses;
    }

    public void insertLecturer() throws SQLException {
        try {
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(INSERT_LECTURER);
//            pS.set

        } catch (Exception e) {

        }
    }

}
