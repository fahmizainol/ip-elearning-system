/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author MeGa
 */
public class ManageCourseGrade {
    private Integer serical;
    private String name;
    private String matrix;
    private String grade;
    private String gpa;
    private String action;

    public ManageCourseGrade() {
    }

    public ManageCourseGrade(Integer serical, String name, String matrix, String grade, String gpa, String action) {
        this.serical = serical;
        this.name = name;
        this.matrix = matrix;
        this.grade = grade;
        this.gpa = gpa;
        this.action = action;
    }

    public ManageCourseGrade(String name, String matrix, String grade, String gpa, String action) {
        this.name = name;
        this.matrix = matrix;
        this.grade = grade;
        this.gpa = gpa;
        this.action = action;
    }

    public Integer getSerical() {
        return serical;
    }

    public void setSerical(Integer serical) {
        this.serical = serical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}
