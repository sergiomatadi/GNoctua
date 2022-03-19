
package gnoctua.Vista;

import gnoctua.Modelo.Articulo;
import gnoctua.Modelo.Cliente;
import gnoctua.Modelo.ClienteEstandard;
import gnoctua.Modelo.ClientePremium;
import gnoctua.Modelo.Datos;
import java.util.List;
import gnoctua.Modelo.Pedido;
import java.util.Scanner;


public class Interface {

    Datos datos = new Datos();
    public int menu(){
        int opc = 0;
    
    System.out.println("Menu opciones");
    System.out.println("1- Añadir cliente");
    System.out.println("2- Mostrar cliente");
    System.out.println("3- Añadir articulo");
    System.out.println("4- Mostrar articulo:");
    System.out.println("5- Añadir pedido");
    System.out.println("6- Mostrar pedido:");
    System.out.println("7- Salir");
    System.out.println("Opcion");
    
    
    opc = new Scanner(System.in).nextInt();
    return opc;
    }
    
    public Cliente lecturaCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre cliente:");
        String nombre = sc.nextLine();
        System.out.println("Domicilio:");
        String domicilio = sc.nextLine();
        System.out.println("Email cliente:");
        String email = sc.nextLine();
        System.out.println("DNI:");
        String nif = sc.nextLine();
        System.out.println("Tipo de cliente:");
        System.out.println("1. Estandard");
        System.out.println("2. Premium");
        String tipoCliente = sc.nextLine();
        if ("1".equals(tipoCliente)) {
            return new ClienteEstandard(nombre, domicilio, email, nif, "estandard"); 
        }else{
            System.out.println("Cuota");
            String cuota = sc.nextLine();
            System.out.println("Descuento por pedido a clientes premium");
            String descuentoEnvio = sc.nextLine();
            return new ClientePremium(cuota, descuentoEnvio, nombre, domicilio, email, nif, "premium") {};
            
        }
    
    }
    public void mostrarClientes(List<Cliente>clientes){
        System.out.println("Datos clientes");
        for(Cliente cliente: clientes){
            System.out.println(cliente);
        }
    }
    
    public Articulo introducirArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Codigo articulo:");
        String codigo = sc.nextLine();
        System.out.println("Descripción articulo:");
        String descripcion = sc.nextLine();
        System.out.println("PVP:");
        String precioVenta = sc.nextLine();
        System.out.println("Gastos de envio");
        String gastosEnvio = sc.nextLine();
        System.out.println("Tiempo de envio");
        String tiempoEnvio = sc.nextLine();
        return new Articulo(codigo, descripcion, precioVenta, gastosEnvio, tiempoEnvio);
          
    }
    public void mostrarArticulos(List<Articulo>articulos){
        System.out.println("Articulos");
        for(Articulo articulo: articulos){
            System.out.println(articulo);
        }
    }
    public void msg(String text){
        System.out.println(text);
    }  
    
    public Pedido introducirPedido(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Numero de pedido:");
        String numero = sc.nextLine();
        System.out.println("Cantidad");
        String cantidad =sc.nextLine();
        System.out.println("Nif del cliente");
        String nifCliente = sc.nextLine();
        Cliente cliente;
        //datos está vacio siempre (Hay que mirarlo bien)
        if( datos.existeClienteByNif(nifCliente) ) {
            cliente = datos.getClienteByNif(nifCliente);
        }else{
            cliente = lecturaCliente();
            datos.agregarCliente(cliente);
        }
        System.out.println("Codigo de artículo");
        String codigoArticulo = sc.nextLine();
        Articulo articulo = datos.getArticuloByCodigo(codigoArticulo);
        System.out.println("Fecha de pedido");
        String fechaPedido = sc.nextLine();
        System.out.println("Hora de pedido");
        String hora = sc.nextLine();
        System.out.println("Ha sido enviado? (true, false)");
        Boolean enviado = sc.nextLine() == "true" ? true : false;;
        return new Pedido (Integer.parseInt(numero), Integer.parseInt(cantidad), cliente, articulo, fechaPedido, hora, enviado );
               
    }
}