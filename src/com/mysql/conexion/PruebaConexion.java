/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysql.conexion;

/**
 *
 * @author denisse
 */
public class PruebaConexion {
    
    public static void main(String[] args) {
        BDConexion bd = new BDConexion();
        bd.getConnection();
    }
}
