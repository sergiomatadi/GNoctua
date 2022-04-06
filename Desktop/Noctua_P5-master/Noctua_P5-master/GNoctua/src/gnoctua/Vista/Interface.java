
package gnoctua.Vista;

import gnoctua.Modelo.Cliente;
import java.util.List;
import java.util.Scanner;


public class Interface {
    
    public int menu(){
        int opc = 0;
    
    System.out.println("Menu opciones");
    System.out.println("1- Añadir cliente");
    System.out.println("2- Mostrar cliente");
    System.out.println("3- Articulo");
    System.out.println("4- Salir");
    
    opc = new Scanner(System.in).nextInt();
    return opc;
    }
    
    public Cliente lecturaCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre cliente");
        String nombre = sc.nextLine();
        System.out.println("Email cliente");
        String email = sc.nextLine();
        return new Cliente(nombre, email);
    }
    public void mostrarClientes(List<Cliente>clientes){
        System.out.println("Datos clientes");
        for(Cliente cliente: clientes){
            System.out.println(cliente);
        }
    }
    
    public void msg(String text){
        System.out.println(text);
    }
}
