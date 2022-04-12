package gnoctua.Modelo;

public abstract class Cliente {
    
    protected String nombre;
    protected String domicilio;
    protected String email;
    protected String nif; 
    protected int cuota;
    protected int descuento;
    
    

   //public abstract String tipoCliente(){}; 
   
   /*
    Constructor
    */
    public Cliente() {};
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
    
    public int getCuota(){
        return cuota;
    }
    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    public abstract boolean tipoCliente (String email);

    public abstract double cuotaAnual(); 

    public abstract double descuentoEnvio(double totalPedido); 
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + '}';
    }

    void setCliente(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void descuentoEnvio(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
