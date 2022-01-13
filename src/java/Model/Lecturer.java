/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class Lecturer {
    private int id;
    private String username;
    private String password;
    private String name;
    private int age;
    private List<Course> taughtCourses;

    public Lecturer(int id, String username, String password, String name, int age, List<Course> taughtCourses) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.taughtCourses = taughtCourses;
    }

    public Lecturer(String name, int age, List<Course> taughtCourses) {
        this.name = name;
        this.age = age;
        this.taughtCourses = taughtCourses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(List<Course> taughtCourses) {
        this.taughtCourses = taughtCourses;
    }
    
    
    
}
