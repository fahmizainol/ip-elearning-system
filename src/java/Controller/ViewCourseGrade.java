/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author MeGa
 */
public class ViewCourseGrade {
    private String code;
    private String course;
    private String qu;
    private String mn;
    private String jmn;
    private String st;
    private Integer thisSum;
    private Integer allSum;

    public ViewCourseGrade(String code, String course, String qu, String mn, String jmn, String st, Integer thisSum, Integer allSum) {
        this.code = code;
        this.course = course;
        this.qu = qu;
        this.mn = mn;
        this.jmn = jmn;
        this.st = st;
        this.thisSum = thisSum;
        this.allSum = allSum;
    }

    public ViewCourseGrade() {
    }

    public ViewCourseGrade(String course, String qu, String mn, String jmn, String st, Integer thisSum, Integer allSum) {
        this.course = course;
        this.qu = qu;
        this.mn = mn;
        this.jmn = jmn;
        this.st = st;
        this.thisSum = thisSum;
        this.allSum = allSum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public String getJmn() {
        return jmn;
    }

    public void setJmn(String jmn) {
        this.jmn = jmn;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public Integer getThisSum() {
        return thisSum;
    }

    public void setThisSum(Integer thisSum) {
        this.thisSum = thisSum;
    }

    public Integer getAllSum() {
        return allSum;
    }

    public void setAllSum(Integer allSum) {
        this.allSum = allSum;
    }
    
}
