        
package gnoctua.Modelo;

/**
 *
 * @author denis
 */
public class Pedido {
    private int numero;
    private int cantidad; 
    private Cliente Cliente;
    private Articulo Articulo;
    private String fechaPedido;
    private String hora;
    private Boolean enviado;

    
    
    public Pedido(int numero, int cantidad, Cliente Cliente, Articulo Articulo, String fechaPedido, String hora, Boolean enviado) {
        this.numero = numero;
        this.cantidad = cantidad;
        this.Cliente = Cliente;
        this.Articulo = Articulo;
        this.fechaPedido = fechaPedido;
        this.hora = hora;
        this.enviado = enviado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Articulo getArticulo() {
        return Articulo;
    }

    public void setArticulo(Articulo Articulo) {
        this.Articulo = Articulo;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }
    
    public boolean pedidoEnviado() {
        return enviado;
    }
    
    @Override
    public String toString() {
        String text ="Pedido{"; 
        text += "  Numero=" + numero;
        text += ", Cantidad=" + cantidad;
        text += ", Cliente nif=" + Cliente.nif;
        text += ", Cliente nombre=" + Cliente.nombre;
        text += ", Articulo codigo=" + Articulo.codigo;
        text += ", Articulo descripcion=" + Articulo.descripcion;
        text += ", PVPArticulo=" + Articulo.precioVenta;
        text += ", FechaPedido=" + fechaPedido;
        text += ", Hora=" + hora;
        text += "}";
        return text;

        //return "Pedido{" + "numero=" + numero + ", cantidad=" + cantidad + ", cliente nif=" + Cliente.nif + ", cliente nombre=" + Cliente.nombre + ", Articulo codigo =" + Articulo.codigo + ", Articulo descripcion =" + Articulo.descripcion + ",fechaPedido =" +fechaPedido + ", hora =" +hora + ",pvpArticulo'}';
    }
    
}

