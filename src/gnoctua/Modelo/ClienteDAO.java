
package gnoctua.Modelo;

import gnoctua.Modelo.Cliente;
/**
 *
 * @author denis
 */
public interface ClienteDAO {
    public boolean create(Cliente a);
    public Cliente read(String email);
    public boolean update(Cliente a);
    public boolean delete(String email);
}
