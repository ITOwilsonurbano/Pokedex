package pokedex.itosoft.wilson.com.pokedex.models;

/**
 * Created by wilsonurbano on 28/10/16.
 */

public class Pokemon {

    private int number;
    private String texto;
    private String imagen_url;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String url) {
        this.imagen_url= url;
    }

    public int getNumber() {
        String[] urlPartes = imagen_url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
