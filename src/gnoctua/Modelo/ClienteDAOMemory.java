
package gnoctua.Modelo;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// CRUD = Create Read Update Delete
public class ClienteDAOMemory extends Conexion implements ClienteDAO{
    
    private final Connection con;
    
    public ClienteDAOMemory(){
        con=Conexion.conexion();
    }
    
    /**
     * Inserta el cliente en la base de datos
     * @param a Cliente a insertar
     * @return true si se ha conseguido insertar y false si no
     */
    @Override
    public boolean create(Cliente a){
        boolean exito=false;
        
        String sql="insert into Cliente( nombre, domicilio, email, nif, tipoCliente) values (?,?,?,?,?)";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,a.getNombre());
            stm.setString(2,a.getDomicilio());
            stm.setString(3,a.getEmail());
            stm.setString(4,a.getNif());
            
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            System.err.println();
        }
        
        if(exito){
            sql="select last_insert_id() as cliente";
            try(Statement stm=con.createStatement();
                ResultSet rs=stm.executeQuery(sql);){
            
                a.setCliente(rs.getInt("cliente"));
                
            }
            catch(SQLException e){
                System.err.println();
            }
        }
        
        return exito;
    }
    
    /**
     * Devuelve el cliente que tiene este email si existe en la base de datos
     * @param email Email del cliente a buscar
     * @return el objeto Cliente si estaba en la base de datos y null si no estaba
     */
    @Override
    public Cliente read(String email){
        Cliente a=null;
        
        String sql="select * from Cliente where email=" + email;
        try(PreparedStatement stm=con.prepareStatement(sql);){
            stm.setString(1, email);
            
            ResultSet rs=stm.executeQuery(); // Conjunto de filas que ha obtenido la consulta
            if(rs.next()){ // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                a=new Cliente(
                        rs.getString("nombre"),
                        rs.getString("domicilio"),
                        rs.getString("email"),
                        rs.getString("nif")                   
                );
            }
            rs.close();
        }
        catch(SQLException e){
            System.err.println();
        }
        
        return a;
    }
    
    @Override
    public boolean update(Cliente a){
        boolean exito=false;
        
        String sql="update Cliente set nombre=?,domicilio=?,nif=?, tipoCliente=? where email=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,a.getNombre());
            stm.setString(2,a.getDomicilio());
            stm.setString(3,a.getNif());
            stm.setString(5,a.getEmail());
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            System.err.println();
        }
        
        return exito;
    }
    
    @Override
    public boolean delete(String email){
        boolean exito=false;
        
        String sql="delete from Cliente where email=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,email);
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            System.err.println();
        }
        
        return exito;
    }
    

}



