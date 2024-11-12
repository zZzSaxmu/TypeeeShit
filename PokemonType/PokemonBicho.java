package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonBicho extends Pokemon {
    public PokemonBicho (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Bicho);
    }
}
