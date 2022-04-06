package gnoctua.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Datos {
 private List<Cliente> datos = new ArrayList<>();
    
    public boolean agregarCliente(Cliente cliente){
        datos.add(cliente);
        return true;
    }
    
    public List<Cliente>obtenerClientes(){
        return datos;
    } 
}
