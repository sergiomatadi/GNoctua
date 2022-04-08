
package gnoctua.Modelo;
import Config.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// CRUD = Create Reaad Update Delete
public class PedidoDAO {
    
    private Connection con;
    
    public PedidoDAO(){
        con=Conexion.conexion();
    }
   
public boolean create(Pedido a){
        boolean exito=false;
        
        String sql="insert into Pedido( cantidad, cliente, articulo, fechaPedido, hora, enviado) values (?,?,?,?,?,?)";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setInt(1,a.getCantidad());
            stm.setObject(2,a.getCliente());
            stm.setObject(3,a.getArticulo());
            stm.setDate(4, (Date) a.getFechaPedido());
            stm.setTime(5,a.getHora());
            stm.setBoolean(6,a.getEnviado());
            
            stm.executeUpdate();
            
            exito=true;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        if(exito){
            sql="select last_insert_id() as pedido";
            try(Statement stm=con.createStatement();
                ResultSet rs=stm.executeQuery(sql);){
            
                a.setPedido(rs.getInt("pedido"));
                
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        
        return exito;
    }

public Pedido read(int numero){
        Pedido a=null;
        
        String sql="select * from Pedido where numero=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            stm.setInt(1, numero);
            
            ResultSet rs=stm.executeQuery(); // Conjunto de filas que ha obtenido la consulta
            if(rs.next()){ // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                a=new Pedido(
                        rs.getInt("numero"),
                        rs.getInt("cantidad"),
                        //rs.getObject("cliente"),
                        rs.getObject("articulo"),
                        rs.getDate("fechaPedido"),
                        rs.getTime("hora"),
                        rs.getBoolean("enviado")
                );
            }
            rs.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return a;
    }
public boolean update(Pedido a){
        boolean exito=false;
        
        String sql="update Pedido set cantidad=?,cliente=?, articulo=?, fechaPedido=?, hora=?,enviado=?, where numero=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setInt(1,a.getCantidad());
            stm.setObject(2,a.equals("cliente"));
            stm.setObject(3,a.equals("articulo"));
            stm.setDate(4, (Date) a.getFechaPedido());
            stm.setTime(5,a.getHora());
            stm.setBoolean(6,a.getEnviado());
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
    public boolean delete(int numero){
        boolean exito=false;
        
        String sql="delete from Pedido where numero=?";
        try(PreparedStatement stm=con.prepareStatement(sql);){
            
            stm.setInt(1,numero);
            
            stm.executeUpdate();
            
            exito=true;
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return exito;
    }
    
}