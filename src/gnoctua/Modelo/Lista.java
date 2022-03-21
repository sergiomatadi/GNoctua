
package gnoctua.Modelo;
import java.util.ArrayList;
//  La aplicación que debemos implementar debe gestionar colecciones de tres tipos de objetos: Artículo, Cliente y Pedido.
// Dado que las operaciones que necesitamos realizar son muy similares para las tres colecciones, deberemos implementar la mayoría de estas operaciones en una clase genérica, y a partir de ella derivar clases para las tres listas que se necesitan.
//  Las clases genéricas en Java constituyen una herramienta muy útil para reutilizar software. En concreto, son clases similares a las clases convencionales pero que reciben tipos como parámetro a la hora de instanciarse. 
// A partir de la clase Lista, se definirán las clases derivadas: ListaArticulos, ListaClientes y ListaPedidos, según el tipo de objeto a gestionar. Por ejemplo, la definición de ListaArticulos se realizará de la siguiente forma:

// public class ListaArticulos extends Lista<Articulo>{….}

public class Lista <T>{
protected ArrayList <T> lista;

   public Lista() {        
       lista = new ArrayList<>();
    }

    public int getSize() {
        return this.lista.size();
    }

    public void añadir(T t) throws Exception {
        this.lista.add(t);
    }

    public void eliminar(T t) {
        this.lista.remove(t); 
    }
    
    public T getAt(int position) {
       return this.lista.get(position);
    }

    public void clear() {
        this.lista.clear();
    }
    
    public boolean isEmpty() {
        return lista.isEmpty();
    }
    
    public ArrayList<T> getArrayList() {
        ArrayList<T> aList = new ArrayList<>(lista);
        return aList;
    }
}
