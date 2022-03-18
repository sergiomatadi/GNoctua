
package gnoctua.Vista;

import gnoctua.Modelo.Articulo;
import gnoctua.Modelo.Cliente;
import java.util.List;
import java.util.Scanner;


public class Interface {
    
    public int menu(){
        int opc = 0;
    
    System.out.println("Menu opciones");
    System.out.println("1- Añadir cliente");
    System.out.println("2- Mostrar cliente");
    System.out.println("3- Añadir articulo");
    System.out.println("4- Mostrar articulo:");
    System.out.println("5- Salir");
    System.out.println("Opcion");
    
    
    opc = new Scanner(System.in).nextInt();
    return opc;
    }
    
    public Cliente lecturaCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre cliente:");
        String nombre = sc.nextLine();
        System.out.println("Domicilio:");
        String domicilio = sc.nextLine();
        System.out.println("Email cliente:");
        String email = sc.nextLine();
        System.out.println("DNI:");
        String nif = sc.nextLine();
        return new Cliente(nombre, domicilio, email, nif);
    }
    public void mostrarClientes(List<Cliente>clientes){
        System.out.println("Datos clientes");
        for(Cliente cliente: clientes){
            System.out.println(cliente);
        }
    }
    
    public Articulo introducirArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre articulo:");
        String codigo = sc.nextLine();
        System.out.println("Descripción articulo:");
        String descripcion = sc.nextLine();
        System.out.println("PVP:");
        String precioVenta = sc.nextLine();
        System.out.println("Gastos de envio");
        String gastosEnvio = sc.nextLine();
        System.out.println("Tiempo de envio");
        String tiempoEnvio = sc.nextLine();
        return new Articulo(codigo, descripcion, precioVenta, gastosEnvio, tiempoEnvio);
          
    }
    public void mostrarArticulos(List<Articulo>articulos){
        System.out.println("Articulos");
        for(Articulo articulo: articulos){
            System.out.println(articulo);
        }
    }
    public void msg(String text){
        System.out.println(text);
    }
}
