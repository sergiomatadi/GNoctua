
package gnoctua.Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// CRUD = Create Reaad Update Delete
public class ArticuloDAO {
    
    private Connection con;
    
    public ArticuloDAO(){
        con=Conexion.conexion();
    }
    
    /**
     * Inserta el articulo en la base de datos
     * @param a Articulo a insertar
     * @return true si se ha conseguido insertar y false si no
     */
    public boolean create(Articulo a){
        boolean exito=false;
        
        String sql="insert into Articulo( descripcion,precioVenta,gastosEnvio, tiempoEnvio) values (?,?,?,?)";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,a.getDescripcion());
            stm.setDouble(2,a.getPrecioVenta());
            stm.setDouble(3,a.getGastosEnvio());
            stm.setInt(4,a.getTiempoEnvio());
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        if(exito){
            sql="select last_insert_id() as codigo";
            try(Statement stm=con.createStatement();
                ResultSet rs=stm.executeQuery(sql);){
            
                a.setCodigo(rs.getInt("codigo"));
                
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        
        return exito;
    }
    
    /**
     * Devuelve el articulo que tiene este codigo si existe en la base de datos
     * @param codigo Codigo del articulo a buscar
     * @return el objeto articulo si estaba en la base de datos y null si no estaba
     */
    public Articulo read(int codigo){
        Articulo a=null;
        
        String sql="select * from Articulo where codigo=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            stm.setInt(1, codigo);
            
            ResultSet rs=stm.executeQuery(); // Conjunto de filas que ha obtenido la consulta
            if(rs.next()){ // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                a=new Articulo(
                        rs.getInt("codigo"),
                        rs.getString("descripcion"),
                        rs.getDouble("precioVenta"),
                        rs.getDouble("gastosEnvio"),
                        rs.getInt("tiempoEnvio")
                );
            }
            rs.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return a;
    }
    
    public boolean update(Articulo a){
        boolean exito=false;
        
        String sql="update Articulo set descripcion=?,precioVenta=?,gastosEnvio=?, tiempoEnvio=? where codigo=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,a.getDescripcion());
            stm.setDouble(2,a.getPrecioVenta());
            stm.setDouble(3,a.getGastosEnvio());
            stm.setInt(4,a.getTiempoEnvio());
            stm.setInt(5,a.getCodigo());
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
    public boolean delete(int codigo){
        boolean exito=false;
        
        String sql="delete from Articulo where codigo=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setInt(1,codigo);
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
}
