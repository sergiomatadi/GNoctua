package gnoctua.Controlador;

import gnoctua.Modelo.Articulo;
import gnoctua.Modelo.ArticuloDAO;
import gnoctua.Modelo.Cliente;
import gnoctua.Modelo.ClienteDAO;
import gnoctua.Modelo.ClientePremium;
import gnoctua.Modelo.DAOFactory;
import gnoctua.Modelo.Pedido;
import gnoctua.Modelo.PedidoDAO;
import gnoctua.Vista.InterfaceUsuario;
import java.util.List;



public class Controlador {
    
   
    public static void main(String[] args) {
        
        InterfaceUsuario vista = new InterfaceUsuario();
        Cliente cliente;
        ClienteDAO cdao;
        ArticuloDAO adao;
        PedidoDAO pdao;
        Articulo articulo=null;
        int codigoArticulo;
        Pedido pedido;
        
        int opc = 0;
        do{
            opc = vista.menu();           
            switch(opc){
               
                case 1:
                    cliente = vista.lecturaCliente();
                    cdao=DAOFactory.createClienteDAO(cliente.getClass());
                    cdao.create(cliente);
                    vista.msg("**********************");
                    vista.msg("Guardado correctamente");
                    vista.msg("**********************");
                    break;
                case 2: 
                    cdao=DAOFactory.createClienteDAO();
                    List<Cliente> lista=cdao.listar();
                    vista.listarClientes(lista);
                    break;
                case 3:
                    articulo = vista.introducirArticulo();
                    adao=DAOFactory.createArticuloDAO();
                    adao.create(articulo);
                    vista.msg("**********************");
                    vista.msg("Guardado correctamente");
                    vista.msg("**********************");
                    break;
                case 4:
                    adao=DAOFactory.createArticuloDAO();
                    List<Articulo> art = adao.listar();
                    vista.mostrarArticulos(art);
                    break; 
                case 5: 
                    String nif = vista.introducirNifCliente();
                    cdao=DAOFactory.createClienteDAO();
                    cliente=cdao.read(nif);
                    if(cliente!=null){
                        codigoArticulo = vista.introducirCodigoArticulo();
                        adao=DAOFactory.createArticuloDAO();
                        articulo=adao.read(codigoArticulo);
                        if(articulo!=null){
                            pedido = vista.introducirPedido(cliente, articulo);
                            pdao=DAOFactory.createPedidoDAO();
                            pdao.create(pedido);
                            vista.msg("**********************");
                            vista.msg("Guardado correctamente");
                            vista.msg("**********************");
                        }
                        else{
                            System.out.println("Articulo no encontrado");
                        }
                    }
                    else{
                        System.out.println("Cliente no encontrado.");
                    }                   
                    break;
                case 6:        
                    pdao=DAOFactory.createPedidoDAO();
                    List<Pedido> order = pdao.listar();
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

