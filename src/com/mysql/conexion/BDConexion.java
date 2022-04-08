
package com.mysql.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BDConexion {
    
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "Enise123";
    private static String URL ="jdbc:mysql://localhost:3306/p5gnoctua";
            
            
    static{
        try{
            Class.forName(DRIVER);         
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "ERROR EN EL DRIVER:" +e);
       }
    }
    public Connection getConnection(){
                
        Connection con = null;
        try{
            con=DriverManager.getConnection(URL,USUARIO,PASSWORD);
            JOptionPane.showMessageDialog(null, "Conectado");
        }  catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Error en la conexion"+e);
        }
        return con;
  } 
}

