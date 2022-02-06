/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class Lecturer implements Serializable{
    private int id;
    private String email;
    private String username;
    private String password;
    private String fullname;
    private String phone;
    private List<Course> taughtCourses;
    
    public Lecturer(){
        
    }

    public Lecturer(int id, String email, String username, String password, String fullname, String phone, List<Course> taughtCourses) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
        this.taughtCourses = taughtCourses;
    }

    public Lecturer(int id, String email, String username, String password, String fullname, String phone) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
    }
    
    public Lecturer(int id, String email, String password, String fullname, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
    }
    

    public Lecturer(String email, String username, String password, String fullname, String phone) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
    }

    
    
    
    public Lecturer(String email, String password, String fullname, String phone) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(List<Course> taughtCourses) {
        this.taughtCourses = taughtCourses;
    }

    
   
    
}
