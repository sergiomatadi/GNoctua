package gnoctua.Modelo;

public class Articulo {
    public String codigo;
    public String descripcion;
    public String precioVenta;
    public String gastosEnvio;
    public String tiempoEnvio;

  
    public Articulo(String codigo, String descripcion, String precioVenta, String gastosEnvio, String tiempoEnvio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.tiempoEnvio = tiempoEnvio;
    } 



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

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(String gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public String getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(String tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", gastosEnvio=" + gastosEnvio + ", tiempoEnvio=" + tiempoEnvio + '}';
    }
    
    
}
