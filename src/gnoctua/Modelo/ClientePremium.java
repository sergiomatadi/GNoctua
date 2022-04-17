
package gnoctua.Modelo;

/**
 *Clase hija de Cliente
 *
 */

public class ClientePremium extends Cliente{  
    
    private int cuota;
    private double descuentoEnvio;

    public ClientePremium(int cuota, double descuentoEnvio, String nombre, String domicilio, String email, String nif) {
        super(nombre, domicilio, email, nif);
        this.cuota = cuota;
        this.descuentoEnvio = descuentoEnvio;    
    }

    public int getCuota(){
        return this.cuota;
    }

    public void setCuota(int  cuota){
        this.cuota = cuota;
    }
    
    public double getDescuentoEnvio(){
        return this.descuentoEnvio;
    }

    public void setDescuentoEnvio(double descuentoEnvio){
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
        return "Cliente{ nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + ", tipo de cliente= premium, cuota=" + cuota + ", descuentoEnvio=" + descuentoEnvio +" }";
    }
}
