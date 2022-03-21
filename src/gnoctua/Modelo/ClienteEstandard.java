package gnoctua.Modelo;

// denisse
    //private String tipoCliente;
    //public ClienteEstandard(String nombre, String domicilio, String email, String nif){}

public class ClienteEstandard extends Cliente {
   

// Las clases hijas, ClienteEstandard y ClientePremium, implementarán los métodos abstractos indicados.
//  public abstract String tipoCliente();
// public abstract float calcAnual();
// public abstract float descuentoEnv();

    /*
    Constructor
    */
   public ClienteEstandard(String nombre, String domicilio, String email, String nif, String tipoCliente){
  super(nombre, domicilio, email, nif, tipoCliente);
   this.tipoCliente = tipoCliente;
}
    
    /*getters & setters*/
    /*@Override
    public String getTipoCliente() {
        return tipoCliente;
    }
    
    @Override
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    */

    @Override
    public String toString() {
        return "Cliente{ nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + ", tipo de cliente=" + tipoCliente + " }";
    }
}