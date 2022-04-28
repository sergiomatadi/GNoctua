
package gnoctua.Modelo;

import Config.Conexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
// CRUD = Create Reaad Update Delete
public class PedidoDAO {

    private final EntityManager em;

    public PedidoDAO() {
        em=Conexion.getEntityManager();
    }

    public boolean create(Pedido a) {
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        return true;
    }

    public Pedido read(int numero) {
        em.getTransaction().begin();
        Pedido a=em.find(Pedido.class, numero);
        em.getTransaction().commit();
        return a;
    }
    
    public List<Pedido> listar(){
        em.getTransaction().begin();
        
        Query q=em.createQuery("select a from Pedido a");
        List<Pedido> l=q.getResultList();
        em.getTransaction().commit();
        return l;
    }

    public boolean update(Pedido a) {
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        return true;
    }

    public boolean delete(int numero) {
        em.getTransaction().begin();
        Articulo a=em.find(Articulo.class, numero);
        em.remove(a);
        em.getTransaction().commit();
        return true;
    }

}
