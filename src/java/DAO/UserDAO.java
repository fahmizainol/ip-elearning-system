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
    
    /**
     *
     * @param u_id
     * @return
     */
    public Users getUsers(int u_id);

    /**
     *
     * @param u
     */
    public void registerUsers(Users u);

    /**
     *
     * @param name
     * @param password
     * @param r_id
     * @return
     */
    public Users checkUser(String name, String password, int r_id);

    /**
     *
     * @return
     */
    public List<Users> getAllUsers();  

    /**
     *
     * @return
     */
    public List<Role> getAllRole();
    
}
