/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gnoctua.Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author denis
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void testGetTipoCliente() {
        System.out.println("getTipoCliente");
        String tipo = "estandard";
        Cliente cliente = new ClienteEstandard("Pedro","Calle Amor 5", "p@goo.com","34534534G", tipo);
        String result = cliente.getTipoCliente();
        assertEquals(tipo, result);
        
    }


    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String nombre = "Pedro";
        Cliente instance = new ClienteEstandard(nombre,"Calle Amor 5", "p@goo.com","34534534G", "estandard");
        String result = instance.getNombre();
        assertEquals(nombre, result);
        
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        Cliente instance = new ClienteEstandard("Pedro","Calle Amor 5", "p@goo.com","34534534G", "estandard");
        String nombre = "Mario";
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
       
    }

    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        String domicilio = "Calle Falsa 2";
        Cliente instance = new ClienteEstandard("Pedro","Calle Falsa 2", "p@goo.com","34534534G", "estandard");
        String result = instance.getDomicilio();
        assertEquals(domicilio, result);
        
    }

    @Test
    public void testSetDomicilio() {
       System.out.println("setDomicilio");
        Cliente instance = new ClienteEstandard("Pedro","Calle Amor 5", "p@goo.com","34534534G", "estandard");
        String domicilio = "Calle Petit 6";
        instance.setDomicilio(domicilio);
        assertEquals(domicilio, instance.getDomicilio());
        
    }

    public class ClienteImpl extends Cliente {
    }

}