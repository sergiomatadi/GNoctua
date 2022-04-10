    
package gnoctua.Modelo;
import java.sql.Time;
import java.util.Date;



public class Pedido {
    private int numero;
    private int cantidad; 
    private Cliente cliente;
    private Articulo articulo;
    private Date fechaPedido;
    private Time hora;
    private Boolean enviado;

    
 //Constructor   
    public Pedido(int numero, int cantidad, Cliente Cliente, Articulo Articulo, Date fechaPedido, Time hora, Boolean enviado) {
        this.numero = numero;
        this.cantidad = cantidad;
        this.cliente = Cliente;
        this.articulo = Articulo;
        this.fechaPedido = fechaPedido;
        this.hora = hora;
        this.enviado = enviado;
    }

    Pedido(int aInt, int aInt0, Object object, java.sql.Date date, Time time, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Pedido(int parseInt, int parseInt0, Cliente cliente, Articulo articulo, String fechaPedido, String hora, Boolean enviado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }

    public Boolean getEnviado() {
        return enviado;
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

    void setPedido(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

