
package gnoctua.Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// CRUD = Create Reaad Update Delete
public class ArticuloDAOMemory implements ArticuloDAO {
    
    private final Connection con;
    
    public ArticuloDAOMemory(){
        con=Conexion.conexion();
    }
    
    /**
     * Inserta el articulo en la base de datos
     * @param a Articulo a insertar
     * @return true si se ha conseguido insertar y false si no
     */
    @Override
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
            System.err.println();
        }
        
        if(exito){
            sql="select last_insert_id() as codigo";
            try(Statement stm=con.createStatement();
                ResultSet rs=stm.executeQuery(sql);){
            
                a.setCodigo(rs.getInt("codigo"));
                
            }
            catch(SQLException e){
                System.err.println();
            }
        }
        
        return exito;
    }
    
    /**
     * Devuelve el articulo que tiene este codigo si existe en la base de datos
     * @param codigo Codigo del articulo a buscar
     * @return el objeto articulo si estaba en la base de datos y null si no estaba
     */
    @Override
    public Articulo read(int codigo){
        Articulo a=null;
        
        String sql="select * from Articulo where codigo=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            stm.setInt(1, codigo);
            
            try (ResultSet rs = stm.executeQuery() // Conjunto de filas que ha obtenido la consulta
            ) {
                if(rs.next()){ // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                    a=new Articulo(
                            rs.getInt("codigo"),
                            rs.getString("descripcion"),
                            rs.getDouble("precioVenta"),
                            rs.getDouble("gastosEnvio"),
                            rs.getInt("tiempoEnvio")
                    );
                }
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
        
        return a;
    }
    
    @Override
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
            System.err.println();
        }
        
        return exito;
    }
    
    @Override
    public boolean delete(int codigo){
        boolean exito=false;
        
        String sql="delete from Articulo where codigo=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setInt(1,codigo);
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            System.err.println();
        }
        
        return exito;
    }
    
        public List<Articulo> getArticulos() throws SQLException{
        Articulo a = null;
        List<Articulo> list = new ArrayList<>(); 
        
            String sql="select (codigo,descripcion, precioVenta, gastosEnvio, tiempoEnvio) from Articulo";
            try(PreparedStatement stm = con.prepareStatement(sql);
                ResultSet rs = stm.executeQuery()){ // Conjunto de filas que ha obtenido la consulta
             
                    while(rs.next()){ // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true

                            Articulo articulo = new Articulo(
                                    rs.getInt(1), 
                                    rs.getString(2),
                                    rs.getDouble(3),
                                    rs.getDouble(5),
                                    rs.getInt(6)
                            );
                            
                            list.add(articulo);               
                    }
                }
            catch(SQLException e){
                    System.err.println(e);
            }
            return list;    
    }
    
    public void listarArticulos() throws Exception {
        List<Articulo> list = new ArrayList<>();
        list = getArticulos();
        for(Articulo articulo: list){
            System.out.println(articulo);
        }
    }
}
