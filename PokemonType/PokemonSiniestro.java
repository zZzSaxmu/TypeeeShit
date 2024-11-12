package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonSiniestro extends Pokemon {
    public PokemonSiniestro (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Siniestro); 
    }
}
