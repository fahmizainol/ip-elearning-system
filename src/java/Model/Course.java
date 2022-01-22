/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class Course implements Serializable{
    private int id;
    private String code;
    private String courseName;
    private int studentCount;

    /**
     *
     */
    public Course(){}
    
    /**
     *
     * @param id
     * @param code
     * @param courseName
     * @param studentCount
     */
    public Course(int id, String code, String courseName, int studentCount) {
        this.id = id;
        this.code = code;
        this.courseName = courseName;
        this.studentCount = studentCount;
    }

    /**
     *
     * @param code
     * @param courseName
     * @param studentCount
     */
    public Course(String code, String courseName, int studentCount) {
        this.code = code;
        this.courseName = courseName;
        this.studentCount = studentCount;
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
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     *
     * @return
     */
    public int getStudentCount() {
        return studentCount;
    }

    /**
     *
     * @param studentCount
     */
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

  
    
}
