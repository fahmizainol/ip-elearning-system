/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class Course {
    private int id;
    private String code;
    private String courseName;
    private int studentCount;

    public Course(int id, String code, String courseName, int studentCount) {
        this.id = id;
        this.code = code;
        this.courseName = courseName;
        this.studentCount = studentCount;
    }

    public Course(String code, String courseName, int studentCount) {
        this.code = code;
        this.courseName = courseName;
        this.studentCount = studentCount;
    }
    
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

  
    
}
