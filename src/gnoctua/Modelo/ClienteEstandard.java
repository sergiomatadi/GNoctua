
package gnoctua.Modelo;

/**
 *
 * @author denis
 */

public class ClienteEstandard extends Cliente {
    
    private String tipoCliente;
    
    
    //public ClienteEstandard(String nombre, String domicilio, String email, String nif){}
  
/*
    Constructor
    */
    @Override
    public String tipoCliente(){
        return "ClienteEstandard";
    }
        
    public ClienteEstandard(String nombre, String domicilio, String email, String nif, String tipoCliente) {
        super(nombre, domicilio, email, nif, tipoCliente);
        this.tipoCliente = tipoCliente;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + "tipo de cliente=" + tipoCliente + " }";
    }
}
  //coment//