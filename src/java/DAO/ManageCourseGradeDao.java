/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.model.ManageCourseGrade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MeGa
 */
public class ManageCourseGradeDao {
    Connection con;

    public ManageCourseGradeDao(Connection con) {
        this.con = con;
    }

    public List<ManageCourseGrade> getAll()
    {
        List<ManageCourseGrade> list = new ArrayList<>();
        try {
            String query = "select * from managecoursegrade";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet set = ps.executeQuery();
            while(set.next())
            {
                ManageCourseGrade grade = new ManageCourseGrade();
                grade.setAction(set.getString("action"));
                grade.setGpa(set.getString("gpa"));
                grade.setGrade(set.getString("grade"));
                grade.setMatrix(set.getString("matrix"));
                grade.setSerical(set.getInt("serial"));
                grade.setName(set.getString("name"));
                list.add(grade);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
        }
        return list;
    }
    
}
