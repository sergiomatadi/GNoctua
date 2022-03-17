package Noctua.Modelo;



public class ClientesPremium extends Clientes {
    
    private boolean premium;
    
    public ClientesPremium (String nombre, String domicilio, String nif, String email){
    
    super (nombre, domicilio,email, nif);
    
    this.premium = true;
  }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }      
 
}
