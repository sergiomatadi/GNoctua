
package gnoctua.Modelo;

import java.time.LocalDate;

public class Articulo {
    private int codigo;
    private String descripcion;
    private double precioVenta;
    private double gastosEnvio;
    private LocalDate tiempoEnvio;

  
    public Articulo(int codigo, String descripcion, double precioVenta, double gastosEnvio, LocalDate tiempoEnvio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.tiempoEnvio = tiempoEnvio;
    } 

   



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public LocalDate getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(LocalDate tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", gastosEnvio=" + gastosEnvio + ", tiempoEnvio=" + tiempoEnvio + '}';
    }
    
    
}
