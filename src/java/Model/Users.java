/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author muham
 */
public class Users {
 
    private String u_name;
    private String password;
    private int r_id;
    private String email;
    private String phone;
    
    public Users(){};

    public Users(String u_name, String password, int r_id, String email, String phone) {
        this.u_name = u_name;
        this.password = password;
        this.r_id = r_id;
        this.email = email;
        this.phone = phone;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
   
}
