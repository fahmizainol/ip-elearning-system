/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;


/**
 *
 * @author Rejwan
 */
public class Assignment implements Serializable{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPath() {
        return path;
    }

    /*
    id                   int(11)
    title               varchar(255)
    duedate       varchar(255)
    course          int(11)
    Materials     mediumblob
     */
    public void setPath(String path) {
        this.path = path;
    }

    public Assignment(int id, String title, String duedate, int course, String filename, String path) {
        this.id = id;
        this.title = title;
        this.duedate = duedate;
        this.course = course;
        this.filename = filename;
        this.path = path;
    }

    
    private int id;
    private String title;
    private String duedate;
    private int course;
    private String filename;
    private String path;

    public Assignment() {
    }

  

}
