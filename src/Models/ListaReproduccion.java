package Models;

public abstract class ListaReproduccion implements Reproduccion{
    private String nombre;
    public ListaReproduccion() {
    }
    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
