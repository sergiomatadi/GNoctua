/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Conexion {
    
    private static Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/onlinestore";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection conexion(){
        if(con==null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(URL, USER, PASS);

            }catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
        return con;
    }

    
}
