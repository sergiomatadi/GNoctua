package Config;

import javax.swing.JOptionPane;



public class PruebaConexion {
    
    public static void main(String[] args) {
        Conexion bd = new Conexion();
        JOptionPane.showMessageDialog(null, "Conectado");
        bd.getConnection();
    }
}
