
package gnoctua.Modelo;

import Config.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

// CRUD = Create Reaad Update Delete
public class ArticuloDAO extends DAO {
    
    
    
    /**
     * Inserta el articulo en la base de datos
     * @param a Articulo a insertar
     * @return true si se ha conseguido insertar y false si no
     */
    public boolean create(Articulo a){
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        return true;
    }
    
    /**
     * Devuelve el articulo que tiene este codigo si existe en la base de datos
     * @param codigo Codigo del articulo a buscar
     * @return el objeto articulo si estaba en la base de datos y null si no estaba
     */
    public Articulo read(int codigo){
        em.getTransaction().begin();
        Articulo a=em.find(Articulo.class, codigo);
        em.getTransaction().commit();
        return a;
    }
    
    public List<Articulo> listar(){
        em.getTransaction().begin();
        
        Query q=em.createQuery("select a from Articulo a");
        List<Articulo> l=q.getResultList();
        em.getTransaction().commit();
        return l;
    }
    
    public boolean update(Articulo a){
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        return true;
    }
    
    public boolean delete(int codigo){
        em.getTransaction().begin();
        Articulo a=em.find(Articulo.class, codigo);
        em.remove(a);
        em.getTransaction().commit();
        return true;
    }
    
}
