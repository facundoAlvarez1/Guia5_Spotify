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

/*
public Client buscarCliente(String name){
    Client buscado = null;
    for(Client cliente : clienList){
        if(cliente.getName().equals(name)){
            buscado =cliente;
        }
    }
    return buscado;
}


public String ultimosDiezCliente(String name){
    String lista = "";
    int j=0; // cantidad alquileres a su nombre
    if(buscarCliente(name)!=null){
            for(int i=loansList.size()-1; i >=0 && j<10;i--){
                if(loansList.get(i).getClient().getName().equals(name)){ // igualar si el nombre contra nombre
                 lista +=loansList.get(i).toString();
                 j++;
                }
            }
    }
    return lista;
}


// peliculas mas populares

public int compararPelicula(Pelicula peli){
        int i;
        if(this.loans<peli.getLoans() || movie==null){
            i=1;
        }else if(this.loans == peli.getLoans()){
            i=0;
        }else{
            i=-1;
        }
        return i;

}


public String top3Populares(){
    Collections.sort(movieList); // ordena el arreglo de pelicula
    String lista = "";
    if(moviesList.size<=3){
    lista= this.getMovies();
    }else
    {
    for(int i=0; i < 3; i++)
    {
        lista+= movieList.get(i).toString();
           }
    }
    return lista;
}


llamar EAudiencia.UNRATED.getName() / enum

*/
