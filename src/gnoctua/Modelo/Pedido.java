    
package gnoctua.Modelo;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


@Entity
public class Pedido implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    private int numero;
    private int cantidad; 
    
    @ManyToOne(targetEntity=gnoctua.Modelo.Cliente.class)
    @JoinTable(
            name="Cliente",
            joinColumns={
                @JoinColumn(name="nif")
            },
            inverseJoinColumns={
                @JoinColumn(name="nif")
            }
    )
    private Cliente cliente;
    
    @ManyToOne(targetEntity=gnoctua.Modelo.Articulo.class)
    @JoinTable(
            name="Articulo",
            joinColumns={
                @JoinColumn(name="codigo"),
            },
            inverseJoinColumns={
                @JoinColumn(name="codigo")
            }
    )
    private Articulo articulo;
    private LocalDate fechaPedido;
    private LocalTime hora;
    private Boolean enviado;

    public Pedido(){
        
    }
    
    public Pedido(int numero, int cantidad, Cliente Cliente, Articulo Articulo, LocalDate fechaPedido, LocalTime hora, Boolean enviado) {
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

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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

    
}

