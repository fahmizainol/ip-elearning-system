/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Lecturer;
import Model.Student;
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
public class StudentDAO {
 String url = "jdbc:mysql://localhost:3306/elearning";
    String user = "root";
    String password = "";
    String jdbcDriver = "com.mysql.jdbc.Driver";
    
    private static final String SELECT_ALL_STUDENT= "select * from student";
    private static final String UPDATE_STUDENT=  "UPDATE student SET email=?, password=?, fullname=?, phone=? WHERE studentID=?";
    private static final String INSERT_STUDENT=  "INSERT INTO student (username, email, password, fullname, phone) values(?,?,?,?,?)";
    private static final String SELECT_STUDENT_BY_ID = "select * from student where studentID=?";
    private static final String SELECT_STUDENT_BY_USER_PWD = "select * from student where username=? and password=?";


    /**
     *
     */
    public StudentDAO(){
        
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
    
    public Student selectStudentByUsername(String username, String password) throws ClassNotFoundException{
        Connection conn = getConnection();
        Student student = null;
        try{
            PreparedStatement pS = conn.prepareStatement(SELECT_STUDENT_BY_USER_PWD);
            pS.setString(1, username);
            pS.setString(2, password);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int studentID = rs.getInt("studentID");
                String email = rs.getString("email");
                String fullname = rs.getString("fullname");
                String phone = rs.getString("phone");
                student = new Student(studentID,  email,  username,  password,  fullname,  phone);
            }
            
        }catch(Exception e){
            
        }
        return student;
    }
    
    public void insertStudent(Student student) throws ClassNotFoundException, SQLException{
        Connection conn = getConnection();
        try{
            PreparedStatement pS = conn.prepareStatement(INSERT_STUDENT);
            pS.setString(1, student.getUsername());
            pS.setString(2, student.getEmail());
            pS.setString(3, student.getPassword());
            pS.setString(4, student.getFullname());
            pS.setString(5, student.getPhone());
            pS.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    
    // select user by id
    public Student selectStudent(int id) throws SQLException, ClassNotFoundException{
        Student student = null;
        try(Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_STUDENT_BY_ID);){
            pS.setInt(1, id);
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String fullname = rs.getString("fullname");
                String phone = rs.getString("phone");
                student = new Student(email, username, password, fullname, phone);
                
            } 
        }
        return student;
    }
    public List<Student> selectAllStudent() throws ClassNotFoundException, SQLException{
        List<Student> students = new ArrayList<>();
        try(Connection conn = getConnection();
                PreparedStatement pS = conn.prepareStatement(SELECT_ALL_STUDENT);){
            System.out.println(pS);
            ResultSet rs = pS.executeQuery();
            
            while(rs.next()){
                int studentID = rs.getInt("studentID");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String fullname = rs.getString("fullname");
                String phone = rs.getString("phone");
                students.add(new Student(studentID, email, username, password, fullname, phone));
                
            } 
        }
        return students;
    }

    public void updateStudent(Student student) throws SQLException{
        try{
            Connection conn = getConnection();
            PreparedStatement pS = conn.prepareStatement(UPDATE_STUDENT);
            pS.setString(1, student.getEmail());
            pS.setString(2, student.getPassword());
            pS.setString(3, student.getFullname());
            pS.setString(4, student.getPhone());
            pS.setInt(5, student.getId());
            pS.executeUpdate();
                    
        } catch(Exception e){
            
        }
    
    }
}
