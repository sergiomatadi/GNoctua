
package gnoctua.Modelo;

/**
 *
 * Interface para definir los DAO de Clientes
 */
public interface ClienteDAO {
    
    public boolean create(Cliente a);
    public Cliente read(String email);
    public boolean update(Cliente a);
    public boolean delete(String email);
}
    
    /*public List<Cliente> getClientes();
    public Cliente getClienteByEmail(String email);
    public boolean addCliente(Cliente cliente);

    public boolean clienteExiste(String email);

    public List<Cliente> listarClientesEstandard();
    public List<Cliente> listarClientesPremium();
}*/
