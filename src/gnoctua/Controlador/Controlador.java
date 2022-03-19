
// test //

package gnoctua.Controlador;

import gnoctua.Modelo.Articulo;
import gnoctua.Modelo.Cliente;
import gnoctua.Modelo.Datos;
import gnoctua.Modelo.Pedido;
import gnoctua.Vista.Interface;
import java.util.List;


public class Controlador {
    
   
    public static void main(String[] args) {
        
        Interface vista = new Interface();
        Datos bd = new Datos();
        
        int opc = 0;
        do{
            opc = vista.menu();           
            switch(opc){
               
                case 1:
                    Cliente cliente = vista.lecturaCliente();
                    bd.agregarCliente(cliente);
                    vista.msg("Guardado correctamente");
                    break;
                case 2: 
                    List<Cliente> datos = bd.obtenerClientes();
                    vista.mostrarClientes(datos);
                    break;
                case 3:
                    Articulo articulo = vista.introducirArticulo();
                    bd.agregarArticulo(articulo);
                    vista.msg("Guardado correctamente");
                    break;
                case 4:
                    List<Articulo> art = bd.obtnerArticulo();
                    vista.mostrarArticulos(art);
                    break; 
                case 5: 
                    // List<Pedido> pedidos = bd.obtenerPedido();
                    Pedido pedido = vista.introducirPedido();
                    bd.agregarPedido(pedido);
                    vista.msg("Guardado correctamente");
                    break;
                case 6:              
                    vista.msg("Salir de la aplicación");
                    break;
           
                default:
                    vista.msg("Opcion incorrecta");                 
           }
        }
        
        while(opc!=6);
    }
    
}

