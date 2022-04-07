    
package gnoctua.Modelo;

/**
 *
 * @author denis
 */
public class Pedido {
    private int numero;
    private int cantidad; 
    private Cliente cliente;
    private Articulo articulo;
    private String fechaPedido;
    private String hora;
    private Boolean enviado;

    
    
    public Pedido(int numero, int cantidad, Cliente Cliente, Articulo Articulo, String fechaPedido, String hora, Boolean enviado) {
        this.numero = numero;
        this.cantidad = cantidad;
        this.cliente = Cliente;
        this.articulo = Articulo;
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
        return cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.cliente = Cliente;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo Articulo) {
        this.articulo = Articulo;
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
        text += ", Cliente nif=" + cliente.nif;
        text += ", Cliente nombre=" + cliente.nombre;
        text += ", Articulo codigo=" + articulo.getCodigo();
        text += ", Articulo descripcion=" + articulo.getDescripcion();
        text += ", PVPArticulo=" + articulo.getPrecioVenta();
        text += ", FechaPedido=" + fechaPedido;
        text += ", Hora=" + hora;
        text += "}";
        return text;

        //return "Pedido{" + "numero=" + numero + ", cantidad=" + cantidad + ", cliente nif=" + Cliente.nif + ", cliente nombre=" + Cliente.nombre + ", Articulo codigo =" + Articulo.codigo + ", Articulo descripcion =" + Articulo.descripcion + ",fechaPedido =" +fechaPedido + ", hora =" +hora + ",pvpArticulo'}';
    }
    
}

