/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author muham
 */
public class Users implements Serializable{
 
    private String u_name;
    private String password;
    private int r_id;
    private String email;
    private String phone;
    
    /**
     *
     */
    public Users(){};

    /**
     *
     * @param u_name
     * @param password
     * @param r_id
     */
    public Users(String u_name, String password, int r_id) {
        this.u_name = u_name;
        this.password = password;
        this.r_id = r_id;
    }

    /**
     *
     * @param u_name
     * @param password
     * @param r_id
     * @param email
     * @param phone
     */
    public Users(String u_name, String password, int r_id, String email, String phone) {
        this.u_name = u_name;
        this.password = password;
        this.r_id = r_id;
        this.email = email;
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    public String getU_name() {
        return u_name;
    }

    /**
     *
     * @param u_name
     */
    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public int getR_id() {
        return r_id;
    }

    /**
     *
     * @param r_id
     */
    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
   
}
