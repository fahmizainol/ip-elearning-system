/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fahmi ZB 仕事
 */
public class DBConnection {
    
//    register $load db driver
//    create a connection, pass the connection object to the caller
//    close the db connection
    
    private static final String connectionURL="jdbc:mysql://localhost:3306/elearning";
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String username="root";
    private static final String password="";
    private static Connection conn= null;
    
    /**
     *
     * @return
     */
    public static Connection openConnection(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(connectionURL, username, password);
            
        }catch(Exception ex){}
        
        return conn;
        
    }
    
    /**
     *
     */
    public static void closeConnection(){
        try{
            conn.close();
        }catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    
}
