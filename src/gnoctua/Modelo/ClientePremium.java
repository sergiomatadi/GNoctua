
package gnoctua.Modelo;

/**
 *Clase hija de Cliente
 *
 */

public class ClientePremium extends Cliente{  
    
    public String cuota, descuentoEnvio;

    public ClientePremium(String cuota, String descuentoEnvio, String nombre, String domicilio, String email, String nif, String tipoCliente) {
        super(nombre, domicilio, email, nif, tipoCliente);
        this.cuota = cuota;
        this.descuentoEnvio = descuentoEnvio;    
    }

    public String getCuota(){
        return this.cuota;
    }

    public void setCuota(String cuota){
        this.cuota = cuota;
    }
    
    public String descuentoEnvio(){
        return this.descuentoEnvio;
    }

    public void descuentoEnvio(String descuentoEnvio){
        this.descuentoEnvio = descuentoEnvio;
    }
 
   //public abstract float getDescuentoEnv();

            
    /*@Override
    public String tipoCliente(){
        return "ClientePremium";
    }
    private String tipoCliente;
     
    //public ClientePremium(tipoCliente){}
    
   
    
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    */
    @Override
    public String toString() {
        return "Cliente{ nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + ", tipo de cliente=" + tipoCliente + ", cuota=" + cuota + ", descuentoEnvio=" + descuentoEnvio +" }";
    }
}
