/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBUtility.DBConnection;
import Model.Course;
import Model.Lecturer;
import Model.Users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class LecturerDAO {
    String url = "jdbc:mysql://localhost:3306/elearning";
    String user = "root";
    String password = "";
    String jdbcDriver = "com.mysql.jdbc.Driver";
    
    private static final String SELECT_ALL_LECTURER = "select * from lecturer";
    private static final String UPDATE_LECTURER=  "UPDATE lecturer SET email=?, password=?, fullname=?, phone=? WHERE lectID=?";
    private static final String INSERT_LECTURER=  "INSERT INTO lecturer (username, email, password, fullname, phone) values(?,?,?,?,?)";
    private static final String SELECT_LECT_BY_ID = "select * from lecturer where lectID=?";
    private static final String SELECT_LECT_BY_USER_PWD = "select * from lecturer where username=? and password=?";


    /**
     *
     */
    public LecturerDAO(){
        
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
    
    public Lecturer selectLecturerByUsername(String username, String password) throws ClassNotFoundException{
        Connection conn = getConnection();
        Lecturer lecturer = null;
        try{
            PreparedStatement pS = conn.prepareStatement(SELECT_LECT_BY_USER_PWD);
            pS.setString(1, username);
            pS.setString(2, password);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int lectID = rs.getInt("lectID");
                String email = rs.getString("email");
                String fullname = rs.getString("fullname");
                String phone = rs.getString("phone");
                lecturer = new Lecturer(lectID,  email,  username,  password,  fullname,  phone);
            }
            
        }catch(Exception e){
            
        }
        return lecturer;
    }
    
    public void insertLecturer(Lecturer lect) throws ClassNotFoundException, SQLException{
        Connection conn = getConnection();
        try{
            PreparedStatement pS = conn.prepareStatement(INSERT_LECTURER);
            pS.setString(1, lect.getUsername());
            pS.setString(2, lect.getEmail());
            pS.setString(3, lect.getPassword());
            pS.setString(4, lect.getFullname());
            pS.setString(5, lect.getPhone());
            pS.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    
    // select user by id
    public Lecturer selectLecturer(int id) throws SQLException, ClassNotFoundException{
        Lecturer lecturer = null;
        try(Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_LECT_BY_ID);){
            pS.setInt(1, id);
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String fullname = rs.getString("fullname");
                String phone = rs.getString("phone");
                lecturer = new Lecturer(email, username, password, fullname, phone);
                
            } 
        }
        return lecturer;
    }
    public List<Lecturer> selectAllLecturer() throws ClassNotFoundException, SQLException{
        List<Lecturer> lecturers = new ArrayList<>();
        try(Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_ALL_LECTURER);){
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int lectID = rs.getInt("lectID");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String fullname = rs.getString("fullname");
                String phone = rs.getString("phone");
                lecturers.add(new Lecturer(lectID, email, username, password, fullname, phone));
                
            } 
        }
        return lecturers;
    }

    public void updateLecturer(Lecturer lecturer) throws SQLException{
        try{
            Connection conn = getConnection();
            PreparedStatement pS = conn.prepareStatement(UPDATE_LECTURER);
            pS.setString(1, lecturer.getEmail());
            pS.setString(2, lecturer.getPassword());
            pS.setString(3, lecturer.getFullname());
            pS.setString(4, lecturer.getPhone());
            pS.setInt(5, lecturer.getId());
            pS.executeUpdate();
                    
        } catch(Exception e){
            
        }
    
    }
}