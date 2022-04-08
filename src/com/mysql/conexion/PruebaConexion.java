
package com.mysql.conexion;


public class PruebaConexion {
    
    public static void main(String[] args) {
        BDConexion bd = new BDConexion();
        bd.getConnection();
    }
}
