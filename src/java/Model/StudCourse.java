/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author muham
 */
public class StudCourse {
    
    private int id;
    private String code;
    private String courseN;
    private String studentUN;
    private String lecturer;
    private String registerStatus;
    
    public StudCourse(){};

    public StudCourse(int id, String code, String courseN, String studentUN, String lecturer) {
        this.id = id;
        this.code = code;
        this.courseN = courseN;
        this.studentUN = studentUN;
        this.lecturer = lecturer;
    }
    
    
    public StudCourse(int id, String code, String courseN, String studentUN, String lecturer, String registerStatus) {
        this.id = id;
        this.code = code;
        this.courseN = courseN;
        this.studentUN = studentUN;
        this.lecturer = lecturer;
        this.registerStatus = registerStatus;
    }

    public StudCourse(String code, String courseN, String studentUN, String lecturer) {
        this.code = code;
        this.courseN = courseN;
        this.studentUN = studentUN;
        this.lecturer = lecturer;
    }

    public StudCourse(String code, String courseN, String studentUN, String lecturer, String registerStatus) {
        this.code = code;
        this.courseN = courseN;
        this.studentUN = studentUN;
        this.lecturer = lecturer;
        this.registerStatus = registerStatus;
    }

    public String getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(String registerStatus) {
        this.registerStatus = registerStatus;
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

    public String getCourseN() {
        return courseN;
    }

    public void setCourseN(String courseN) {
        this.courseN = courseN;
    }

    public String getStudentUN() {
        return studentUN;
    }

    public void setStudentUN(String studentUN) {
        this.studentUN = studentUN;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}
