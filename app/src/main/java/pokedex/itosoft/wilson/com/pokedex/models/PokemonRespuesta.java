package pokedex.itosoft.wilson.com.pokedex.models;

import java.util.ArrayList;

/**
 * Created by wilsonurbano on 28/10/16.
 */

public class PokemonRespuesta {

    private ArrayList<Pokemon> results;

    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> items) {
        this.results = items;
    }
}
