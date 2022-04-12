
package gnoctua.Modelo;

/**
 *Clase hija de Cliente
 *
 */

public class ClientePremium extends Cliente{  
    
    public String cuota, descuentoEnvio;
    private double getCuota;

    public ClientePremium(int cuota, int descuentoEnvio, String nombre, String domicilio, String email, String nif) {
        super(nombre, domicilio, email, nif);
        super.setCuota(30);
        super.descuentoEnvio(20);    
    }

    /*public String getCuota(){
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
    }*/
 
   //public abstract float getDescuentoEnv();

    ClientePremium() {
        
    }

            
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
    public boolean tipoCliente(String email) {
        return false;
    }

    @Override
    public double cuotaAnual() {
        return getCuota;
    }

    @Override
    public double descuentoEnvio(double totalPedido) {
        return totalPedido - (totalPedido *0.2);
    }
    @Override
    public String toString() {
        return "Cliente{ nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + ", cuota=" + cuota + ", descuentoEnvio=" + descuentoEnvio +" }";
    }


}
