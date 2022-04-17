
package gnoctua.Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


// CRUD = Create Reaad Update Delete
public class ClienteDAO extends DAO {
    
    public static final String TIPO_STANDARD="standard";
    public static final String TIPO_PREMIUM="premium";
    
    
    
    public Cliente read(String nif){
        Cliente a=null;
        
        String sql="select c.nombre, c.domicilio, c.email, p.cuota, p.descuento, c.nif  from Cliente as c left join Cliente_Premium as p on c.nif = p.nif where c.nif=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            stm.setString(1, nif);
            
            try (ResultSet rs = stm.executeQuery() // Conjunto de filas que ha obtenido la consulta
            ) {
                if(rs.next()){ // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                    if(rs.getString("cuota")==null){
                        a=new ClienteStandard(
                                rs.getString("nombre"),
                                rs.getString("domicilio"),
                                rs.getString("email"),
                                rs.getString("nif")
                        );
                    }
                    else{
                        a=new ClientePremium(
                                rs.getInt("cuota"),
                                rs.getDouble("descuento"),
                                rs.getString("nombre"),
                                rs.getString("domicilio"),
                                rs.getString("email"),
                                rs.getString("nif")
                        );
                    }
                    
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return a;
    }

    public List<Cliente> listar(){
        List<Cliente> l=new ArrayList<>();
        
        //String sql="select nif,nombre,domicilio,email,p.nif as nif_premium,cuota,descuento from Cliente c left join Cliente_Premium p on (c.nif=p.nif)";
        String sql="select c.nombre, c.domicilio, c.email, p.cuota, p.descuento, c.nif  from Cliente as c left join Cliente_Premium as p on c.nif = p.nif";
        try(PreparedStatement stm=con.prepareStatement(sql);){
           
            
            ResultSet rs=stm.executeQuery(); // Conjunto de filas que ha obtenido la consulta
            while(rs.next()){ // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                Cliente a=null;
                if(rs.getString("cuota")==null){
                    a=new ClienteStandard(
                        rs.getString("nombre"),
                        rs.getString("domicilio"),
                        rs.getString("email"),
                        rs.getString("nif")
                    );
                }
                else{
                     a=new ClientePremium(
                        rs.getInt("cuota"),
                        rs.getDouble("descuento"),
                        rs.getString("nombre"),
                        rs.getString("domicilio"),
                        rs.getString("email"),
                        rs.getString("nif")
                    );
                }
                l.add(a);
            }
            rs.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return l;
    }
    
    /**
     * Inserta el cliente en la base de datos
     * @param a Cliente a insertar
     * @return true si se ha conseguido insertar y false si no
     */
    public boolean create(Cliente a){
        boolean exito=false;
        
        String sql="insert into Cliente( nombre, domicilio, email, nif) values (?,?,?,?)";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,a.getNombre());
            stm.setString(2,a.getDomicilio());
            stm.setString(3,a.getEmail());
            stm.setString(4,a.getNif());
            
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
              
        return exito;
    }
    
    
    public boolean delete(String nif){
        boolean exito=false;
        
        String sql="delete from Cliente where nif=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,nif);
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
    public boolean update(Cliente a){
        boolean exito=false;
        
        String sql="update Cliente set nombre=?,domicilio=?,email=? where nif=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setString(1,a.getNombre());
            stm.setString(2,a.getDomicilio());
            stm.setString(3,a.getEmail());
            stm.setString(5,a.getNif());
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return exito;
    }


}

