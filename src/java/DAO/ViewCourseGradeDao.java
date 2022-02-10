/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.model.ViewCourseGrade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MeGa
 */
public class ViewCourseGradeDao {
    
   Connection con;

    public ViewCourseGradeDao(Connection con) {
        this.con = con;
    }

    
     public List<ViewCourseGrade> getAll()
    {
        List<ViewCourseGrade> list = new ArrayList<>();
        try {
            String query = "select * from viewcoursegrade";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet set = ps.executeQuery();
            while(set.next())
            {
                ViewCourseGrade grade = new ViewCourseGrade();
                grade.setAllSum(set.getInt("allSum"));
                grade.setCode(set.getString("code"));
                grade.setCourse(set.getString("course"));
                grade.setJmn(set.getString("jmn"));
                grade.setMn(set.getString("mn"));
                grade.setQu(set.getString("gr"));
                grade.setSt(set.getString("st"));
                grade.setThisSum(set.getInt("thisSum"));
                list.add(grade);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
        }
        return list;
    }
}
