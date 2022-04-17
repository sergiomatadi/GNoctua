
package gnoctua.Modelo;


public class ClienteStandard extends Cliente{

    public ClienteStandard(String nombre, String domicilio, String email, String nif) {
        super(nombre, domicilio, email, nif);
    }
  
    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + ", tipo de cliente= standard";
    }
    
    
    
}
