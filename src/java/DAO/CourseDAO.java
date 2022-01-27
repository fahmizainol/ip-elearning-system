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
    String url = "jdbc:mysql://localhost:3306/elearning";
    String user = "root";
    String password = "";
    String jdbcDriver = "com.mysql.jdbc.Driver";
    Connection conn = null;
    private static final String SELECT_ALL_COURSES = "select * from courses";
    private static final String UPDATE_LECTURER=  "UPDATE courses SET lecturer=? WHERE id=?";
               

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
                courses.add(new Course(id, name, cn, count));
                
            } 
        }
        return courses;
    }

    public void updateLecturer(Course course) throws SQLException{
        try{
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(UPDATE_LECTURER);
            pS.setString(1, course.getLecturerUsername());
            pS.setInt(2, course.getId());
            pS.executeUpdate();
                    
        } catch(Exception e){
            
        }
    }

}


