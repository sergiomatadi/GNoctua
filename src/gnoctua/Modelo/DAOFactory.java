
package gnoctua.Modelo;

public class DAOFactory {
    
    public static ClienteDAO createClienteDAO(Class c){
        return new ClienteDAO();
    }
    
    public static ClienteDAO createClienteDAO(){
        return new ClienteDAO();
    }
    
    public static ArticuloDAO createArticuloDAO(){
        return new ArticuloDAO();
    }
    
    public static PedidoDAO createPedidoDAO(){
        return new PedidoDAO();
    }
    
    
}
