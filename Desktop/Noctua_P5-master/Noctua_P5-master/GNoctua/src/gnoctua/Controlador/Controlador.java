
package gnoctua.Controlador;

import gnoctua.Modelo.Cliente;
import gnoctua.Modelo.Datos;
import gnoctua.Vista.Interface;
import java.util.List;


public class Controlador {
    
  
    public static void main(String[] args) {
        
        Interface vista = new Interface();
        Datos bd = new Datos();
        int opc = 0;
        do{
           opc = vista.menu();           
           switch(opc){
               
             case 1:
               Cliente cliente = vista.lecturaCliente();
               bd.agregarCliente(cliente);
               vista.msg("Guardado correctamente");
               break;
             case 2: 
               List<Cliente> datos = bd.obtenerClientes();
               vista.mostrarClientes(datos);
               break;
             case 3:
               vista.msg("Salir de la aplicación");
               break;
             default:
                 vista.msg("Opcion incorrecta");                 
           }
        }
        
        while(opc!=3);
    }
}

