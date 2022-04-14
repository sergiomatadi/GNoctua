/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnoctua.Modelo;

/**
 *
 * @author Usuario
 */
public class ClienteStandard extends Cliente{

    public ClienteStandard(String nombre, String domicilio, String email, String nif) {
        super(nombre, domicilio, email, nif);
    }

    
    
    
    @Override
    public String toString() {
        return "ClienteStandard{" + '}';
    }
    
    
    
}
