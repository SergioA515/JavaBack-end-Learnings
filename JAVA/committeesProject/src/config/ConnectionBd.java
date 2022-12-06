/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionBd {
    Connection con;
    String bd="mydb";
    String driver="com.mysql.cj.jdbc.Driver";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/mydb";
    /* Realizamos la conexion al driver y a la base de datos**/
    public ConnectionBd(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,password);
            System.out.println("SE CONECTO A LA BBDD "+bd);
        } catch(ClassNotFoundException |SQLException ex){
            System.out.println("NO SE CONECTO A LA BBDD");
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection(){
        return con;
    }
    public void disconnect(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
