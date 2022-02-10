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
import Model.Lecturer;
import Model.StudCourse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fahmi ZB 
 */
public class CourseDAO {
    String url = "jdbc:mysql://localhost:3306/elearning";
    String user = "root";
    String password = "";
    String jdbcDriver = "com.mysql.jdbc.Driver";
    Connection conn = null;
    private static final String SELECT_ALL_COURSES = "select * from courses";
    private static final String SELECT_BY_LECTURER = "select * from studcourse where lecturer=?";
    private static final String SELECT_ALL_COURSES_STUD = "select * from studcourse";
    private static final String UPDATE_COURSE=  "UPDATE courses SET code=?, courseName=?, studentCount=?, lecturer=? WHERE id=?";
    private static final String UPDATE_STUDCOURSE_STATUS=  "UPDATE studcourse SET registerStatus=? WHERE id=?";
    private static final String WITHDRAW_COURSE=  "UPDATE courses SET code=?, courseName=?, studentCount=?, lecturer=? WHERE id=?";
    private static final String REGISTER_COURSE = "insert into studcourse( code, courseN, studentUN, lecturer, registerStatus) values (?,?,?,?,?)";
               

    /**
     *
     */
    public CourseDAO(){
        
    }
   

    protected Connection getConnection() throws ClassNotFoundException{
        Connection conn = null;
        try{
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(url, user, password);
        } catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    

    public List<Course> selectAllCourses() throws ClassNotFoundException, SQLException{
                        List<Course> courses = new ArrayList<>();
        try(Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_ALL_COURSES);){
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("code");
                String cn = rs.getString("courseName");
                int count = rs.getInt("studentCount");
                String lecturer = rs.getString("lecturer");
                courses.add(new Course(id, name, cn, count, lecturer));
                
            } 
        }
        return courses;
    }
    
    public List<StudCourse> selectAllCoursesStud() throws ClassNotFoundException, SQLException{
                        List<StudCourse> course = new ArrayList<>();
        try(Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_ALL_COURSES_STUD);){
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("code");
                String cn = rs.getString("courseN");
                String studname = rs.getString("studentUN");
                String lecturer = rs.getString("lecturer");
                course.add(new StudCourse(id,name,cn,studname,lecturer));
                
            } 
        }
        return course;
    }
    
    public List<StudCourse> selectAllCoursesStudLecturer(Lecturer lect) throws ClassNotFoundException, SQLException{
                        List<StudCourse> course = new ArrayList<>();
        try(Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_BY_LECTURER);){
//            System.out.println(pS);
            pS.setString(1, lect.getUsername());
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("code");
                String cn = rs.getString("courseN");
                String studname = rs.getString("studentUN");
                String lecturer = rs.getString("lecturer");
                String status = rs.getString("registerStatus");
                course.add(new StudCourse(id,name,cn,studname,lecturer, status));
                
            } 
        }
        return course;
    }

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
    public void updateStudCourseStatus(String status, String id) throws SQLException{
        try{
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(UPDATE_STUDCOURSE_STATUS);
            pS.setString(1, status);
            pS.setString(2, id);
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
    
    public void RegisterCourse(StudCourse studc){
        try {
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(REGISTER_COURSE);
            
            pS.setString(1, studc.getCode());
            pS.setString(2, studc.getCourseN());
            pS.setString(3, studc.getStudentUN());
            pS.setString(4, studc.getLecturer());
            pS.setString(5, studc.getRegisterStatus());
            pS.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

}
}


