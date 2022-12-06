/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import config.ConnectionBd;
import java.sql.*;
import config.ConnectionBd;
/**
 *
 * @author POWER 1
 */
public class Instructor {
    int ins_id;
    String ins_nombres;
    String ins_apellidos;
    String ins_email;
    
    public Instructor(){
        
    }
    public String getName(){
        
        return ins_nombres;
        
    }
    public void setName(){
        
    }
    public boolean add(Instructor ins){
        PreparedStatement ps = null;
        ConnectionBd con = new ConnectionBd();
        
        String sql = "INSERT INTO instructores ()";
        try {
            
        } catch(SQLException ex){
            
        }
    }
}
