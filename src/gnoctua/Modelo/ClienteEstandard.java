
package gnoctua.Modelo;

public class ClienteEstandard extends Cliente {
    
    //private String tipoCliente;
    
    
    //public ClienteEstandard(String nombre, String domicilio, String email, String nif){}
  
    /*
    Constructor
    */
    public ClienteEstandard(String nombre, String domicilio, String email, String nif) {
        super(nombre, domicilio, email, nif);
        super.setCuota(0);
        super.setDescuento(0);
        //this.tipoCliente = tipoCliente;
    }
    
    @Override
    public boolean tipoCliente(String email) {
        boolean existe = false;
        return false;
    }
    
    public double cuotaAnual(){
        return 0;
    }

    public double descuentoEnvio(double totalPedido) {
        return 0;
    }
    @Override
    public String toString() {
        return nif + " }" + "Cliente{ nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=";
    }

}


