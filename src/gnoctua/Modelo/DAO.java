
package gnoctua.Modelo;

import Config.Conexion;
import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class DAO {
    protected Connection con;
    
    public DAO(){
        con=Conexion.conexion();
    }
}
