package gnoctua.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Datos {
 private final List<Cliente> datos = new ArrayList<>();
 private final List<Articulo> art = new ArrayList<>();
    
    public boolean agregarCliente(Cliente cliente){
        datos.add(cliente);
        return true;
    }
    
    public List<Cliente>obtenerClientes(){
        return datos;
    } 
    
    public boolean agregarArticulo(Articulo articulo){
        art.add(articulo);
        return true;
    }
    public List<Articulo>obtnerArticulo(){
        return art;
    }
}
