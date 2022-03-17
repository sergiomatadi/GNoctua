
package Noctua.Modelo;

public class Articulos {
    public String codigo;
    public String descripcion;
    public double precioVenta;
    public double gastosEnvio;
    public int tiempoEnvio;
    
    
//Constructores//
   
   public Articulos(){
   }
   public Articulos(String codigo, String descripcion, double precioVenta, double gastosEnvio, int tiempoEnvio){
   }
   
    @Override 
      public String toString(){
          return "Articulo: "+ codigo + ", " + descripcion + ", precio: "+ precioVenta + ", gastos de envio: "+ gastosEnvio + " tiempo de envio: "+ tiempoEnvio;
      }
    
      // Getter y Setter //
      
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(int tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }


}



