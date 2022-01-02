/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elearning.db;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class LecturerDB {
    String url = "jdbc:mysql://localhost:3306/elearning";
    String user = "root";
    String password = "";
    String jdbcDriver = "com.mysql.jdbc.Driver";
    
    private static final String SELECT_ALL_COURSES = "select * from courses";
    
    public LecturerDB(){
        
    }
}
