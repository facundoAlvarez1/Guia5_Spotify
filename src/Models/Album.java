package Models;

public class Album {
    private String nombre;
    private String album;
    private String ano;
    private String artista;

    public Album(String nombre, String album, String ano, String artista) {
        this.nombre = nombre;
        this.album = album;
        this.ano = ano;
        this.artista = artista;
    }


    public Album() {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nombre='" + nombre + '\'' +
                ", album='" + album + '\'' +
                ", ano='" + ano + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
