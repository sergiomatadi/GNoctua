
package gnoctua.Modelo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * Interface para definir los DAO de Clientes
 */
public interface ClienteDAO {
    
    public boolean create(Cliente a);
    public Cliente read(String email);
    public boolean update(Cliente a);
    public boolean delete(String email);
    public List<Cliente> getClientes() throws SQLException;
    public void listarClientesPremium() throws Exception;
    public void listarClientesEstandard() throws Exception;
    public void listarClientes() throws Exception;
    public boolean existeCliente(String nif) throws Exception;
    public Cliente readByNif(String nif);
}
    
    /*public List<Cliente> getClientes();
    public Cliente getClienteByEmail(String email);
    public boolean addCliente(Cliente cliente);

    public boolean clienteExiste(String email);

    public List<Cliente> listarClientesEstandard();
    public List<Cliente> listarClientesPremium();
}*/
