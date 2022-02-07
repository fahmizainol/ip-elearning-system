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
 * @author Fahmi ZB 
 */
public class CourseDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    private static final String SELECT_ALL_COURSES = "select * from courses";
    private static final String INSERT_LECTURER = "";
    private static final String UPDATE_LECTURER=  "UPDATE courses SET lecturer=? WHERE id=?";
    private static final String UPDATE_COURSE=  "UPDATE courses SET code=?, courseName=?, studentCount=?, lecturer=? WHERE id=?";
    private static final String WITHDRAW_COURSE=  "UPDATE courses SET code=?, courseName=?, studentCount=?, lecturer=? WHERE id=?";
               

    /**
     *
     */
    public CourseDAO() {

    }

    public List<Course> selectAllCourses() throws SQLException  {
        List<Course> courses = new ArrayList<>();
        try {
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement("select * from courses");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("code");
                String cn = rs.getString("courseName");
                int count = rs.getInt("studentCount");
                String lecturer = rs.getString("lecturer");
                courses.add(new Course(id, name, cn, count, lecturer));
                
            } 
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        return courses;
    }

    public void insertLecturer() throws SQLException {
        try {
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(INSERT_LECTURER);
//            pS.set

        } catch (Exception e) {}
        
    }

    public void updateLecturer(Course course) throws SQLException{}
    public void updateCourse(Course course) throws SQLException{
        try{
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(UPDATE_COURSE);
            pS.setString(1, course.getCode());
            pS.setString(2, course.getCourseName());
            pS.setInt(3, course.getStudentCount());
            pS.setString(4, course.getLecturerUsername());
            pS.setInt(5, course.getId());
            pS.executeUpdate();
                    
        } catch(Exception e){
            
        }
    }
    public void withdrawCourse(Course course) throws SQLException{
        try{
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(WITHDRAW_COURSE);
            pS.setString(1, course.getCode());
            pS.setString(2, course.getCourseName());
            pS.setInt(3, course.getStudentCount());
            pS.setString(4, course.getLecturerUsername());
            pS.setInt(5, course.getId());
            pS.executeUpdate();
                    
        } catch(Exception e){
            
        }
    }

}
