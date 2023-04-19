package Models;
import java.util.Stack;

public class ListaBasica extends ListaReproduccion {
    private Stack<Cancion> miLista;
    public ListaBasica() {
        this.miLista = new Stack<Cancion>();
    }
    public ListaBasica(String nombre, Stack<Cancion> miLista) {
        super(nombre);
        this.miLista = miLista;
    }
    public Stack getMiLista() {
        return miLista;
    }
    public void setMiLista(Stack<Cancion> miLista) {
        this.miLista = miLista;
    }
    @Override
    public void reproduccion() {
        Cancion cancion = miLista.pop();
        Stack<Cancion> aux = new Stack();

        for (Cancion cancionAux : miLista) {
            aux.push(cancionAux);
        }
        aux.push(cancion);
        miLista = aux;

        System.out.println("Reproduciendo : " + cancion.toString());
    }

    @Override
    public void aniadir(Cancion cancion) {
        this.miLista.push(cancion);
    }
    @Override
    public void eliminar(Cancion cancion) {
        System.out.println("Para acceder a esta opcion, compre el paquete PREMIUM.");
    }
    @Override
    public void verMiLista() {
        System.out.println(this.getNombre());
        int cont = 0;
        for (Cancion cancionAux : miLista) {
            System.out.println(cont + ":" + cancionAux.toString());
        }
    }
}
