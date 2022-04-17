/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnoctua.Modelo;

import Config.Conexion;
import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class DAO {
    protected Connection con;
    
    public DAO(){
        con=Conexion.conexion();
    }
}
