/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBUtility.DBConnection;
import Model.Role;
import Model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author muham
 */
public class UserDAOImp implements UserDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public Users getUsers(int u_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> checkUser(String name, String password, int r_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> getAllUsers() {
        List<Users> ul = null;
        try {
            String sql = "SELECT * FROM users";
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Users u = new Users();
                u.setR_id(rs.getInt("r_id"));
                u.setU_name(rs.getString("u_name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setPhone(rs.getString("phone"));
                ul.add(u);
               }
        } catch (Exception ex) {
        }
        return ul;
    }

    @Override
    public List<Role> getAllRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerUsers(Users u) {
        try {
            String sql = "insert into users (u_name,password,r_id,email,phone) value(?,?,?,?,?)";

            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getU_name());
            ps.setString(2, u.getPassword());
            ps.setInt(3, u.getR_id());
            ps.setString(4, u.getEmail());
            ps.setString(5, u.getPhone());
            ps.executeUpdate();
            
        } catch (Exception ex) {

        }
    }

}


