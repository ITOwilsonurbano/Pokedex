package pokedex.itosoft.wilson.com.pokedex.pokeapi;

import pokedex.itosoft.wilson.com.pokedex.models.PokemonRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wilsonurbano on 28/10/16.
 */

public interface PokeapiService {

    @GET("noticias")
    Call<PokemonRespuesta> obtenerListaPokemon(/*@Query("limit") int limit, @Query("offset") int offset*/);


}
