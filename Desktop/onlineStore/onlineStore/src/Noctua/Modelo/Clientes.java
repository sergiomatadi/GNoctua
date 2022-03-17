package Noctua.Modelo;

import java.util.ArrayList;


public class Clientes {
    private String nombre;
    private String domicilio;
    private String email;
    private String nif;  
    
   


//Constructores// 
public Clientes(){
}

public Clientes(String nombre, String domicilio, String email, String nif){
    
    this.nombre = nombre;
    this.domicilio = domicilio;
    this.nif = nif;
    this.email = email;
}

@Override
 public String toString(){
     return "Cliente: "+ nombre + "";
 }

 // Getter y Setter //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
}
