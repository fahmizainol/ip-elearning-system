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
public class Submission implements Serializable {

    private String status;
    private int assignmentID;
    private String submissionTime;
    private int grade;
    private String file;
    private String empty;

    public String getEmpty() {
        return empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }

    public Submission() {
    }

    public Submission(String status, int assignmentID, String submissionTime, int grade, String file, String empty ) {
        this.status = status;
        this.assignmentID = assignmentID;
        this.submissionTime = submissionTime;
        this.grade = grade;
        this.file = file;
        this.empty = empty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

}
