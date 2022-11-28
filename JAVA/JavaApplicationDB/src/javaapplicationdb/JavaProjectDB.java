/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationdb;
/**
 *
 * @author Sena
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JavaProjectDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conectamos con el driver
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");    
        } catch (ClassNotFoundException ex){
            Logger.getLogger(JavaProjectDB.class.getName()).log(Level.SEVERE,null,ex);
        }
        //Conectamos a la base de datos
        String usser = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/mydb";
        try{
            Connection conexion = DriverManager.getConnection(url,usser,password);
            //los estados de SQL ayudan a alterar la base de datos SQL
            Statement st = conexion.createStatement();
            /*st.executeUpdate("INSERT INTO novedades (nov_nombre) VALUES ('RETIRO VOLUNTARIO')");
            st.executeUpdate("INSERT INTO novedades (nov_nombre) VALUES ('CANCELACIÓN DE MATRICULA')");
            st.executeUpdate("INSERT INTO novedades (nov_nombre) VALUES ('DESERCIÓN')");*/
            /*st.executeUpdate("UPDATE novedades SET nov_nombre = 'FELICITACIONES' WHERE nov_id=3");
            st.executeUpdate("DELETE FROM novedades WHERE nov_id=1");*/
            
            
            /*Aqui adentro se esta seleccinando los campos de la tabla de la DB*/
            ResultSet rs = st.executeQuery("SELECT * FROM novedades");
            System.out.println("Novedades Registradas");
            while (rs.next()){
                System.out.println(rs.getString("nov_nombre"));
            }
            // el "rs.next()" ayuda a seguir al siguiente archivo;
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(JavaProjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
