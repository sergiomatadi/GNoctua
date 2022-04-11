
package gnoctua.Modelo;

import Config.Conexion;
import java.sql.SQLException;
import java.util.List;

public class GenericDAOMemory extends Conexion implements GenericDAO {

    @Override
    public <T> List<T> selectQuery(Class<T> type, String query) throws SQLException {
        return null;
    }
  
}

