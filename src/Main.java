import Models.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world y hello Intent de Spotify");
        Scanner miScanner = new Scanner(System.in);
        Spotify reproductor;
        int op;

        do{
            System.out.println("BIENVENIDO! Elija una opción (0 para salir):");
            System.out.println("1 - Utilizar Lista Basica");
            System.out.println("2 - Utilizar Lista Premium");
            op = miScanner.nextInt();

            switch (op){
                case 1:
                    reproductor = new Spotify(new ListaBasica());
                    reproductor.menuCanciones();
                    break;
                case 2:
                    reproductor = new Spotify(new ListaPremium());
                    reproductor.menuCanciones();
                    break;
                default:
                    System.out.println("Opcion no valida, Reintente");
                    break;
            }
        }while(op != 0);
        System.out.println("Saliendo del programa.");
    }
}


