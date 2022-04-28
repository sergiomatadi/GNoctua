
package gnoctua.Modelo;

import Config.Conexion;
import javax.persistence.EntityManager;


public class DAO {
    protected final EntityManager em;
    
    public DAO(){
        em=Conexion.getEntityManager();
    }
}
