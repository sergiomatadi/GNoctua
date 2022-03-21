package gnoctua.Modelo;

// Clase Cliente y Clases Heredadas La clase Cliente guardará la información de los clientes.
// Esta información incluye el correo electrónico, nombre y dirección de cada cliente. 
// Debe declararse la clase Cliente como clase abstracta, incorporando un constructor que inicialice sus atributos, así como los getters y setters necesarios. 
// Además, será necesario declarar los métodos abstractos, que devuelven el tipo de cliente y los que calculan la cuota anual de cada cliente dependiendo del tipo de cliente, 
// así como el descuento de gastos de envío:


// declaracion de metodos abstractos, las clases hijas Estandard y Premium deben implementar estos metodos

// public abstract String tipoCliente();
// public abstract float calcAnual();
// public abstract float descuentoEnv();


public abstract class Cliente {
    
    protected String nombre;
    protected String domicilio;
    protected String email;
    protected String nif; 
    protected String tipoCliente;
// public abstract float calcAnual();
// public abstract float descuentoEnv();
// Importante, si el metodo abstracto implementado no se implemente en las clases hijas, resultara en un error ya que no pueden ser "instantiated"


   
   /*
    Constructor
    */

    public Cliente() {};
    public Cliente(String nombre, String domicilio, String email, String nif, String tipoCliente) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.nif = nif;
        this.tipoCliente = tipoCliente;
    }

    /*
    Getter y Setter
    */

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
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
