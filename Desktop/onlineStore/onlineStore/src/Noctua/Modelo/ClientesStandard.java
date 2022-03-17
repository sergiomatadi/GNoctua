
package Noctua.Modelo;

public class ClientesStandard extends Clientes {
    
    private boolean premium;
    
    public ClientesStandard (String nombre, String domicilio, String nif, String email){
    
    super (nombre, domicilio,email, nif);
    
    this.premium = false;    
  }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
