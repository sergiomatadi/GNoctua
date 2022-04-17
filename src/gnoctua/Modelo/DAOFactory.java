
package gnoctua.Modelo;

public class DAOFactory {
    
    public static ClienteDAO createClienteDAO(Class c){
        if(c==ClienteStandard.class){
            return new ClienteStandardDAO();
        }
        if(c==ClientePremium.class){
            return new ClientePremiumDAO();
        }
        return null;
    }
    
    public static ClienteDAO createClienteDAO(){
        return new ClienteStandardDAO();
    }
    
    public static ArticuloDAO createArticuloDAO(){
        return new ArticuloDAO();
    }
    
    public static PedidoDAO createPedidoDAO(){
        return new PedidoDAO();
    }
    
    
}
