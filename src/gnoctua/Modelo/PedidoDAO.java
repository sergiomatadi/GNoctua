
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
public class PedidoDAO {

    private Connection con;

    public PedidoDAO() {
        con = Conexion.conexion();
    }

    public boolean create(Pedido a) {
        boolean exito = false;

        String sql = "insert into Pedido( cantidad, codigo, fechaPedido, hora, nif, enviado) values (?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql);) {

            stm.setInt(1, a.getCantidad());
            stm.setInt(2, a.getArticulo().getCodigo());
            stm.setDate(3, java.sql.Date.valueOf(a.getFechaPedido()));
            stm.setTime(4, java.sql.Time.valueOf(a.getHora()));
            stm.setString(5, a.getCliente().getNif());
            stm.setBoolean(6, a.getEnviado());

            stm.executeUpdate();

            exito = true;

        } catch (SQLException e) {
            //e.printStackTrace();
        }

        if (exito) {
            sql = "select last_insert_id() as numero";
            try (Statement stm = con.createStatement();
                    ResultSet rs = stm.executeQuery(sql);) {

                a.setNumero(rs.getInt("numero"));

            } catch (SQLException e) {
               // e.printStackTrace();
            }
        }

        return exito;
    }

    public Pedido read(int numero) {
        Pedido a = null;

        String sql = "select * from Pedido where numero=?";
        try (PreparedStatement stm = con.prepareStatement(sql);) {
            stm.setInt(1, numero);

            ResultSet rs = stm.executeQuery();
            
            // Conjunto de filas que ha obtenido la consulta
            if (rs.next()) { // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                ClienteDAO cdao = DAOFactory.createClienteDAO();
                Cliente c = cdao.read(rs.getString("nif"));
                ArticuloDAO adao = DAOFactory.createArticuloDAO();
                Articulo articulo = adao.read(rs.getInt("codigo"));
                Pedido p = new Pedido(
                        rs.getInt("numero"),
                        rs.getInt("cantidad"),
                        c,
                        articulo,
                        rs.getDate("fechaPedido").toLocalDate(),
                        rs.getTime("hora").toLocalTime(),
                        rs.getBoolean("enviado")
                );
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return a;
    }
    
    public List<Pedido> listar(){
        List<Pedido> l=new ArrayList<>();
        
        String sql = "select * from Pedido";
        try (PreparedStatement stm = con.prepareStatement(sql);) {
            

            ResultSet rs = stm.executeQuery(); // Conjunto de filas que ha obtenido la consulta
            while(rs.next()) { // next avanza a la siguiente fila ( en esrte caso solo habra una SI EXISTE UN ARTICULO CON ESE CODIGO. Si no hay siguiente fila devuelve false y si la hay debvuelve true
                ClienteDAO cdao = DAOFactory.createClienteDAO();
                Cliente c = cdao.read(rs.getString("nif"));
                ArticuloDAO adao = DAOFactory.createArticuloDAO();
                Articulo articulo = adao.read(rs.getInt("codigo"));
                Pedido p = new Pedido(
                        rs.getInt("numero"),
                        rs.getInt("cantidad"),
                        c,
                        articulo,
                        rs.getDate("fechaPedido").toLocalDate(),
                        rs.getTime("hora").toLocalTime(),
                        rs.getBoolean("enviado")
                );
                l.add(p);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return l;
    }

    public boolean update(Pedido a) {
        boolean exito = false;

        String sql = "update Pedido set cantidad=?,nif=?, codigo=?, fechaPedido=?, hora=?,enviado=?, where numero=?";
        try (PreparedStatement stm = con.prepareStatement(sql);) {

            stm.setInt(1, a.getCantidad());
            stm.setString(2, a.getCliente().getNif());
            stm.setObject(3, a.getArticulo().getCodigo());
            stm.setDate(4, java.sql.Date.valueOf(a.getFechaPedido()));
            stm.setTime(5, java.sql.Time.valueOf(a.getHora()));
            stm.setBoolean(6, a.getEnviado());
            stm.setInt(7, a.getNumero());

            stm.executeUpdate();

            exito = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exito;
    }

    public boolean delete(int numero) {
        boolean exito = false;

        String sql = "delete from Pedido where numero=?";
        try (PreparedStatement stm = con.prepareStatement(sql);) {

            stm.setInt(1, numero);

            stm.executeUpdate();

            exito = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exito;
    }

}
