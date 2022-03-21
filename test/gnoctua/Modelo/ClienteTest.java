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
    public void testSetTipoCliente() {
        System.out.println("setTipoCliente");
        String tipoCliente = "";
        Cliente instance = new ClienteImpl();
        instance.setTipoCliente(tipoCliente);
        
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new ClienteImpl();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new ClienteImpl();
        instance.setNombre(nombre);
       
    }

    @Test
    public void testGetDomicilio() {
        System.out.println("getDomicilio");
        Cliente instance = new ClienteImpl();
        String expResult = "";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDomicilio() {
        System.out.println("setDomicilio");
        String domicilio = "";
        Cliente instance = new ClienteImpl();
        instance.setDomicilio(domicilio);
        
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = new ClienteImpl();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Cliente instance = new ClienteImpl();
        instance.setEmail(email);
        
    }

    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Cliente instance = new ClienteImpl();
        String expResult = "";
        String result = instance.getNif();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "";
        Cliente instance = new ClienteImpl();
        instance.setNif(nif);
       
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new ClienteImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    public class ClienteImpl extends Cliente {
    }
    
}
