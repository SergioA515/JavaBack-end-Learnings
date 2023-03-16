/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sena
 */
public class Conexion {
    Connection con;
    String user= "root";
    String host= "localhost";
    String pass="";
    String url = "jdbc:mysql://localhost:3306/base_registro";
    String driver="com.mysql.cj.jdbc.Driver";

    public Conexion(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pass);
        }catch (ClassNotFoundException |SQLException ex) {
            System.out.println("No se pudo conectar");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection(){
        return con;
    }
    public void Disconnect(){
        try{
            con.close();
        }catch(Exception e){
            
        }
    }
}