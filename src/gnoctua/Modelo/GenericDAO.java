
package gnoctua.Modelo;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO {
    public <T> List<T> selectQuery(Class<T> type,String query) throws SQLException;
}
