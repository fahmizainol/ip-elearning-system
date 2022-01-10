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

    Connection conn = null;
    
    private static final String SELECT_ALL_COURSES = "select * from courses";
    private static final String INSERT_LECTURER = "insert into courses (lecturer) values (?)";
    
    public CourseDAO(){
        
    }
    
    public List<Course> selectAllCourses() throws ClassNotFoundException, SQLException{
                        List<Course> courses = new ArrayList<>();

        try{
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(SELECT_ALL_COURSES);
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("code");
                String cn = rs.getString("courseName");
                int count = rs.getInt("studentCount");
                courses.add(new Course(id, name, cn, count));
                
            } 
        } catch(Exception e){
            
        }
        return courses;
    }
    
    public void insertLecturer() throws SQLException{
        try{
            conn = DBConnection.openConnection();
            PreparedStatement pS = conn.prepareStatement(INSERT_LECTURER);
            pS.set
                    
        } catch(Exception e){
            
        }
    }
}


