/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnoctua.Modelo;

/**
 *
 * @author Usuario
 */
public class DAOFactory {
    
    public static ClienteDAO createClienteDAO(Class c){
        if(c==ClienteStandard.class){
            return new ClienteStandardDAO();
        }
        if(c==ClientePremium.class){
            return new ClientePremiumDAO();
        }
        return null;
    }
    
    public static ClienteDAO createClienteDAO(){
        return new ClienteStandardDAO();
    }
    
    public static ArticuloDAO createArticuloDAO(){
        return new ArticuloDAO();
    }
    
    public static PedidoDAO createPedidoDAO(){
        return new PedidoDAO();
    }
    
    
}
