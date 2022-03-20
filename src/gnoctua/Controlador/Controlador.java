
// test //

package gnoctua.Controlador;

import gnoctua.Modelo.Articulo;
import gnoctua.Modelo.Cliente;
import gnoctua.Modelo.ClienteEstandard;
import gnoctua.Modelo.ClientePremium;
import gnoctua.Modelo.Datos;
import gnoctua.Modelo.Pedido;
import gnoctua.Vista.Interface;
import java.util.List;


public class Controlador {
    
   
    public static void main(String[] args) {
        
        Interface vista = new Interface();
        Datos bd = new Datos();
        
        Cliente cliente = new ClienteEstandard("Pedro", "Calle Roma 1", "pedro@roma.com", "11111111P", "estandard");
        bd.agregarCliente(cliente);
        cliente = new ClienteEstandard("Heidi", "Calle Roma 2", "heidi@roma.com", "22222222H", "estandard");
        bd.agregarCliente(cliente);
        cliente = new ClienteEstandard("Blanca", "Calle Roma 3", "blanca@roma.com", "33333333B", "estandard");
        bd.agregarCliente(cliente);
        cliente = new ClientePremium("30", "20%", "Arnold", "Calle Hollywood 1", "arnold@hollywood.com", "44444444A", "premium");
        bd.agregarCliente(cliente);
        cliente = new ClientePremium("30", "20%", "Hamilton", "Calle Hollywood 2", "hamilton@hollywood.com", "55555555H", "premium");
        bd.agregarCliente(cliente);
        
        Articulo articulo = new Articulo("0001", "Manzanas", "20", "2", "2" );
        bd.agregarArticulo(articulo);
        articulo = new Articulo("0002", "Peras", "10", "2", "2" );
        bd.agregarArticulo(articulo);
        articulo = new Articulo("0003", "Platanos", "15", "2", "2" );
        bd.agregarArticulo(articulo);
        
        Pedido pedido = new Pedido(1, 3, cliente, articulo, "02-02-2022", "10:30", true);
        bd.agregarPedido(pedido);
        pedido = new Pedido(2, 4, cliente, articulo, "02-03-2022", "10:40", true);
        bd.agregarPedido(pedido);
        
        int opc = 0;
        do{
            opc = vista.menu();           
            switch(opc){
               
                case 1:
                    cliente = vista.lecturaCliente();
                    bd.agregarCliente(cliente);
                    vista.msg("Guardado correctamente");
                    break;
                case 2: 
                    List<Cliente> datos = bd.obtenerClientes();
                    vista.mostrarClientes(datos);
                    break;
                case 3:
                    articulo = vista.introducirArticulo();
                    bd.agregarArticulo(articulo);
                    vista.msg("Guardado correctamente");
                    break;
                case 4:
                    List<Articulo> art = bd.obtnerArticulo();
                    vista.mostrarArticulos(art);
                    break; 
                case 5: 
                    String nif = vista.introducirNifCliente();
                    if(bd.existeClienteByNif(nif)) {
                        cliente = bd.getClienteByNif(nif);
                    }else {
                        cliente = vista.lecturaCliente();
                    }
                    String codigoArticulo;
                    codigoArticulo = vista.introducirCodigoArticulo();
                    articulo = bd.getArticuloByCodigo(codigoArticulo);
                    pedido = vista.introducirPedido(cliente, articulo);
                    bd.agregarPedido(pedido);
                    vista.msg("Guardado correctamente");
                    break;
                case 6:              
                    List<Pedido> order = bd.obtenerPedido();
                    vista.mostrarPedidos(order);
                    break; 
           
                case 7:              
                    vista.msg("Salir de la aplicación");
                    break;
           
                default:
                    vista.msg("Opcion incorrecta");                 
           }
        }
        
        while(opc!=6);
    }
    
}

