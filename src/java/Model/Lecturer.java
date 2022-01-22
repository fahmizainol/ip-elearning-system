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

    /**
     *
     * @param id
     * @param username
     * @param password
     * @param name
     * @param age
     * @param taughtCourses
     */
    public Lecturer(int id, String username, String password, String name, int age, List<Course> taughtCourses) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.taughtCourses = taughtCourses;
    }

    /**
     *
     * @param name
     * @param age
     * @param taughtCourses
     */
    public Lecturer(String name, int age, List<Course> taughtCourses) {
        this.name = name;
        this.age = age;
        this.taughtCourses = taughtCourses;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }

    /**
     *
     * @param taughtCourses
     */
    public void setTaughtCourses(List<Course> taughtCourses) {
        this.taughtCourses = taughtCourses;
    }
    
    
    
}
