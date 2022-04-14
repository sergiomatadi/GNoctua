/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnoctua.Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ClientePremiumDAO extends ClienteDAO{
    
    
     /**
     * Inserta el cliente en la base de datos
     * @param a Cliente a insertar
     * @return true si se ha conseguido insertar y false si no
     */
    public boolean create(Cliente a){
        boolean exito=super.create(a);
        if(exito){
            exito=false;
            String sql="insert into Cliente_Premium(cuota,descuento, nif) values (?,?,?)";
            try(PreparedStatement stm=con.prepareStatement(sql);){
                ClientePremium p=(ClientePremium)a;
                stm.setInt(1,p.getCuota());
                stm.setDouble(2,p.getDescuentoEnvio());
                stm.setString(3,p.getNif());


                stm.executeUpdate();

                exito=true;

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return exito;
    }
    
    
    public boolean update(Cliente a){
        boolean exito=super.update(a);
        
        
        if(exito){
            exito=false;
            ClientePremium p=(ClientePremium)a;
            String sql="update Cliente_Premium set cuota=?,descuento=? where email=?";
            try(PreparedStatement stm=con.prepareStatement(sql);){

                stm.setInt(1,p.getCuota());
                stm.setDouble(2,p.getDescuentoEnvio());
                stm.setString(3,a.getEmail());

                stm.executeUpdate();

                exito=true;

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        
        return exito;
    }
    
}
