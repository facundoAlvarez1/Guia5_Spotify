package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spotify {
    List<Cancion> canciones;
    ListaReproduccion miLista;
    Scanner miScanner;
    public Spotify(ListaReproduccion miLista) {
        this.canciones = traerCanciones();
        this.miLista = miLista;
        this.miScanner = new Scanner(System.in);
    }
    public void menuCanciones() {
        int respuesta = 0;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Elija una opcion (0 para volver)");

            System.out.println("1- Reproducir lista");
            System.out.println("2- Ver mi lista");
            System.out.println("3- Añadir Canción");
            System.out.println("4- Eliminar Canción");

            switch (respuesta){
                case 1:
                    reproducir();
                    break;
                case 2:
                    miLista.verMiLista();
                    break;
                case 3:
                    elegirCancion();
                    break;
                case 4:
                    eliminarCancion();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Parametro no valido, reintente");
                    break;
            }
        } while (respuesta != 0);
    }

    public void reproducir() {
        String pausa;
        miLista.reproduccion();
        System.out.println("Presione p para pausar y regresar al menu");
        do{
            pausa = miScanner.nextLine();
        }while(!pausa.equals("p"));
    }

    public void elegirCancion(){
        System.out.println("-----------------------------------");

        System.out.println("Elegir canción a agregar: ");

        int cont=0;

        for(Cancion cancionAux : canciones){
            System.out.println(cont + ":" + cancionAux.toString());
            cont++;
        }
        int numeroCancion = miScanner.nextInt();
        Cancion cancion = canciones.get(numeroCancion);
        miLista.aniadir(cancion);
        System.out.println("Cancion agregada correctamente");
    }

    public void eliminarCancion(){
        System.out.println("-----------------------------------");
        System.out.println("Elegir canción a eliminar: ");

        miLista.verMiLista();

        int numeroCancion = miScanner.nextInt();
        Cancion cancion = canciones.get(numeroCancion);
        miLista.eliminar(cancion);
    }
    public static List<Cancion>traerCanciones(){
        List<Cancion> canciones = new ArrayList<Cancion>();

        Artista chizzo = new Artista("Chizzo",40,"Argentino");
        Album pesadosVestigo = new Album("Pesados Vestigios","Corazon Fugitivo","2018","chizzo");
        Cancion tema = new Cancion("Corazon Fugitivo",120,"Rock","PESADOS VESTIGIO");

        canciones.add(tema);

        Artista sole = new Artista("soledad",34,"Argentino");
        Album pasosLargos = new Album("pasosLargos","Folckore","2018","Soledad");
        Cancion temaSole = new Cancion("PasosLargos",120,"Folckore","Folckore");

        canciones.add(temaSole);
        return canciones;
    }

}



