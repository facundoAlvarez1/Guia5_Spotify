package Models;

import java.util.ArrayList;
import java.util.Stack;

public class ListaBasica implements Reproduccion {
    @Override
    public void reproduccion() {
    }
    @Override
    public void aniadir() {
    }
    @Override
    public void eliminar() {
    }
    @Override
    public void verMiLista() {
    }

    private String nombre;
    private Stack miLista;
    private ArrayList<Cancion> listaIndividual;

    public String reproducirCancion(Cancion data){
    return data.toString();
    }

    /*public String aniadirCancion(Cancion cancion){

    }
    */

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
