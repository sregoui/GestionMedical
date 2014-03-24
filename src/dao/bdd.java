/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samia
 */
public class bdd {
    
    private Connection cnx;
    private String username = "";
    private String password = "";
    private String url = "jdbc:mysql://";

    public Connection seConnecter() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, username, password);

        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }
    
    public void seDeconnecter(Connection connection)
    {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
