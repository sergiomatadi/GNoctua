package Noctua.Modelo;

import java.util.ArrayList;
import java.util.Date;


public class Pedidos {
    
    private String numPedido;
    private Clientes cliente;
    private Articulos articulo;
    private int unidades;
    private Date fechaPedido, horaPedido;
   
    // Constructor //
    
    public Pedidos(String numPedidos,int unidades, Date fechaPedido, Date horaPedido){
        this.unidades = unidades;
        this.fechaPedido = fechaPedido;
        this.horaPedido = horaPedido;
        this.cliente =  new Clientes();
        this.articulo = new Articulos();
       
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Articulos getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulos articulo) {
        this.articulo = articulo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Date horaPedido) {
        this.horaPedido = horaPedido;
    }
}
