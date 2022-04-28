
package gnoctua.Vista;

import gnoctua.Modelo.Articulo;
import gnoctua.Modelo.ArticuloDAO;
import gnoctua.Modelo.Cliente;
import gnoctua.Modelo.ClienteDAO;
import gnoctua.Modelo.ClienteStandard;
import gnoctua.Modelo.ClientePremium;
import java.util.List;
import gnoctua.Modelo.Pedido;
import gnoctua.Modelo.PedidoDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class InterfaceUsuario {
    
    ClienteDAO clienteDao = new ClienteDAO();
    ArticuloDAO articuloDao = new ArticuloDAO();
    PedidoDAO pedidoDao = new PedidoDAO();

    
    public int menu(){
        int opc = 0;
    
    System.out.println("==================");
    System.out.println("Menu opciones:");
    System.out.println("==================");
    System.out.println("1- Añadir cliente.");
    System.out.println("2- Mostrar cliente:");
    System.out.println("3- Añadir articulo.");
    System.out.println("4- Mostrar articulo:");
    System.out.println("5- Añadir pedido");
    System.out.println("6- Mostrar pedido:");
    System.out.println("7- Salir");
    System.out.println("==================");
    System.out.println("Opcion:");
    System.out.println("==================");
    
    
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
            return new ClienteStandard(nombre, domicilio, email, nif); 
        }else{
            System.out.println("Cuota");
            int cuota = sc.nextInt();
            System.out.println("Descuento por pedido a clientes premium");
            double descuentoEnvio = sc.nextDouble();
            return new ClientePremium(cuota, descuentoEnvio, nombre, domicilio, email, nif);
            
        }
         
    
    }
   
   public void listarClientes( List<Cliente> lista){
       
       System.out.println("LISTADO DE CLIENTES");
       for(Cliente c : lista){
           System.out.println(c);
       }
       System.out.println();
   }
   
   
    public Articulo introducirArticulo(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Codigo articulo:");
        int codigo = 1;
        System.out.println("Descripción articulo:");
        String descripcion = sc.nextLine();
        System.out.println("PVP:");
        double precioVenta = Double.parseDouble(sc.nextLine());
        System.out.println("Gastos de envio");
        double gastosEnvio = Double.parseDouble(sc.nextLine());
        System.out.println("Tiempo de envio");
        String stiempoEnvio = sc.nextLine();
        LocalDate tiempoEnvio=LocalDate.parse(stiempoEnvio);
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
    
    public String introducirNifCliente() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nif del cliente");
        String nifCliente = sc.nextLine();
        return nifCliente;
    }
    
    public int introducirCodigoArticulo() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Codigo de artículo");
        int codigoArticulo = sc.nextInt();
        return codigoArticulo;
    }
    
    
    public Pedido introducirPedido(Cliente cliente, Articulo articulo){
        Scanner sc = new Scanner (System.in);
        System.out.println("Numero de pedido:");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Cantidad");
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.println("Fecha de pedido");
        String sFechaPedido = sc.nextLine();
        LocalDate fechaPedido=LocalDate.parse(sFechaPedido,DateTimeFormatter.ISO_LOCAL_DATE); 
        System.out.println("Hora de pedido");
        String sHora = sc.nextLine();
        LocalTime hora=LocalTime.parse(sHora,DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("Ha sido enviado? (true, false)");
        String sEnviado=sc.nextLine();
        Boolean enviado = sEnviado.equals("true");
        return new Pedido (numero, cantidad, cliente.getNif(), articulo.getCodigo(), fechaPedido, hora, enviado );
               
    }
    
    public void mostrarPedidos(List<Pedido>pedidos){
        System.out.println("Pedidos");
        for(Pedido pedido: pedidos){
            System.out.println(pedido);
        }
    }
}