package gnoctua.Controlador;

import gnoctua.Modelo.Articulo;
import gnoctua.Modelo.Cliente;
//import gnoctua.Modelo.Datos;
import gnoctua.Modelo.Pedido;
import gnoctua.Vista.Interface;
import java.util.List;
import gnoctua.Modelo.ClienteDAO;
import gnoctua.Modelo.ArticuloDAO;
import gnoctua.Modelo.ArticuloDAOMemory;
import gnoctua.Modelo.ClienteDAOMemory;
import gnoctua.Modelo.PedidoDAO;
import gnoctua.Modelo.PedidoDAOMemory;


public class Controlador {
   
    /**
     *
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        
        Interface vista = new Interface();
        ClienteDAO clientedao = new ClienteDAOMemory();
        PedidoDAO pedidodao = new PedidoDAOMemory();
        ArticuloDAO articulodao = new ArticuloDAOMemory();
        //Datos bd = new Datos();

       /*
        Cliente cliente = new ClienteEstandard("Pedro", "Calle Roma 1", "pedro@roma.com", "11111111P", "estandard");
        clientedao.create(cliente);
        cliente = new ClienteEstandard("Heidi", "Calle Roma 2", "heidi@roma.com", "22222222H", "estandard");
        clientedao.create(cliente);
        cliente = new ClienteEstandard("Blanca", "Calle Roma 3", "blanca@roma.com", "33333333B", "estandard");
        clientedao.create(cliente);
        cliente = new ClientePremium("30", "20%", "Arnold", "Calle Hollywood 1", "arnold@hollywood.com", "44444444A", "premium");
        clientedao.create(cliente);
        cliente = new ClientePremium("30", "20%", "Hamilton", "Calle Hollywood 2", "hamilton@hollywood.com", "55555555H", "premium");
        clientedao.create(cliente);
        

        
        Pedido pedido = new Pedido(1, 3, cliente, articulo, "02-02-2022", "10:30", true);
        bd.agregarPedido(pedido);
        pedido = new Pedido(2, 4, cliente, articulo, "02-03-2022", "10:40", true);
        bd.agregarPedido(pedido);*/
        
        int opc = 0;
        do{
            opc = vista.menu();           
            switch(opc){
               
                case 1:
                    Cliente cliente = vista.lecturaCliente();
                    clientedao.create(cliente);
                    vista.msg("**********************");
                    vista.msg("Guardado correctamente");
                    vista.msg("**********************");
                    break;
                case 2: 
                    clientedao.listarClientes();
                    break;
                case 3:
                    Articulo articulo = vista.introducirArticulo();
                    articulodao.create(articulo);
                    vista.msg("**********************");
                    vista.msg("Guardado correctamente");
                    vista.msg("**********************");
                    break;
                case 4:
                    articulodao.listarArticulos();
                    break; 
                case 5: 
                    String nif = vista.introducirNifCliente();
                    if(clientedao.existeCliente(nif)) {
                        cliente = clientedao.readByNif(nif);
                    }else {
                        cliente = vista.lecturaCliente();
                    }
                    String codigoArticulo;
                    codigoArticulo = vista.introducirCodigoArticulo();
                    articulo = bd.getArticuloByCodigo(codigoArticulo);
                    pedido = vista.introducirPedido(cliente, articulo);
                    bd.agregarPedido(pedido);
                    vista.msg("**********************");
                    vista.msg("Guardado correctamente");
                    vista.msg("**********************");
                    break;
                case 6:              
                    List<Pedido> order = bd.obtenerPedido();
                    vista.mostrarPedidos(order);
                    break; 
           
                case 7:  
                    vista.msg("**********************");
                    vista.msg("Salir de la aplicación");
                    vista.msg("**********************");
                    break;
           
                default:
                    vista.msg("Opcion incorrecta");                 
           }
        }
        
        while(opc!=7);
    }
    
}

