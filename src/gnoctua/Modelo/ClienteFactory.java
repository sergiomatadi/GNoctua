
package gnoctua.Modelo;

/**
 *
 * @author denis
 */
public class ClienteFactory {
    
    public Cliente getCliente(String tipoCliente){
        switch (tipoCliente){
            case "estandard" : 
                return new ClienteEstandard();
        }
                
    }
}
