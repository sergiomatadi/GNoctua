
package gnoctua.Modelo;

import Config.Conexion;
import javax.persistence.EntityManager;

/**
 *
 * @author Usuario
 */
public class DAO {
    protected final EntityManager em;
    
    public DAO(){
        em=Conexion.getEntityManager();
    }
}
