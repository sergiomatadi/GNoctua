
package gnoctua.Modelo;

/**
 *Clase hija de Cliente
 *
 */
public class ClientePremium extends Cliente{
      
    private String tipoCliente;
    
    //public ClientePremium(tipoCliente){}
    
    public ClientePremium(String nombre, String domicilio, String email, String nif, String tipoCliente) {  
        super(nombre, domicilio, email, nif);
        this.tipoCliente = tipoCliente;
    }
    
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
    @Override
    public String toString() {
        return "Cliente{ " + "nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + "tipo de cliente=" + tipoCliente + " }";
    }
}
