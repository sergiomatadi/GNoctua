
package gnoctua.Modelo;

public abstract class Cliente {
    
    protected String nombre;
    protected String domicilio;
    protected String email;
    protected String nif; 

   /*
    Constructor
    */
    public Cliente(String nombre, String domicilio, String email, String nif) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.nif = nif;
    }

    /*
    Getter y Setter
    */
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + '}';
    }

  
    
}
