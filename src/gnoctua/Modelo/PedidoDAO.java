
package gnoctua.Modelo;

import gnoctua.Modelo.Pedido;
/**
 *
 * @author denis
 */
public interface PedidoDAO {
    public boolean create(Pedido a);
    public Pedido read(int numero);
    public boolean update(Pedido a);
    public boolean delete(int numero);
}
