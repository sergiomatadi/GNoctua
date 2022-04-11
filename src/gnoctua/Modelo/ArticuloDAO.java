
package gnoctua.Modelo;

import gnoctua.Modelo.Articulo;
/**
 *
 * @author denis
 */
public interface ArticuloDAO {
    //metodo para agrear el artículo
    public boolean create(Articulo a);
    
    //metodo leer artículo por codigo
    public Articulo read(int codigo);
    
    //metodo para guarar el articulo
    public boolean update(Articulo a);
    
    //metodo para borrar articulo
    public boolean delete(int codigo);
}
