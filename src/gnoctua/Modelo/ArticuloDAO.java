
package gnoctua.Modelo;

import gnoctua.Modelo.Articulo;
/**
 *
 * @author denis
 */
public interface ArticuloDAO {
    public boolean create(Articulo a);
    public Articulo read(int codigo);
    public boolean update(Articulo a);
    public boolean delete(int codigo);
}
