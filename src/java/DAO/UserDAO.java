/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Role;
import Model.Users;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author muham
 */
public interface UserDAO {
    
    public Users getUsers(int u_id);
    public void registerUsers(Users u);
    public Users checkUser(String name, String password, int r_id);
    public List<Users> getAllUsers();  
    public List<Role> getAllRole();
    
}
