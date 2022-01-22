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
public class Role {
    private int r_id;
   private String r_name;

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
    public String getR_name() {
        return r_name;
    }

    /**
     *
     * @param r_name
     */
    public void setR_name(String r_name) {
        this.r_name = r_name;
    }
}
