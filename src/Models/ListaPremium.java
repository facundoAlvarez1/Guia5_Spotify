package Models;
import java.util.LinkedList;

public class ListaPremium extends ListaReproduccion {
    LinkedList<Cancion>miLista;

    public ListaPremium(){
        super("Lista Premium");
        this.miLista=new LinkedList<Cancion>();
    }
    public void setMiLista(LinkedList<Cancion> miLista) {
        this.miLista = miLista;
    }

    public LinkedList<Cancion> getMiLista() {
        return miLista;
    }

    @Override
    public void reproduccion() {
    Cancion cancion = miLista.removeFirst();
    miLista.addLast(cancion);
        System.out.println("Reproduciendo: " + cancion.toString());
    }

    @Override
    public void aniadir(Cancion cancion) {
        this.miLista.add(cancion);
    }

    @Override
    public void eliminar(Cancion cancion) {
        this.miLista.remove(cancion);
    }

    @Override
    public void verMiLista() {
        System.out.println(this.getNombre());
        int cont=0;
        for (Cancion cancionAux: miLista) {
            System.out.println(cont + ":" + cancionAux.toString());
            cont++;
        }
    }

}
