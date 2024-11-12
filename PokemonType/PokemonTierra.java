package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonTierra extends Pokemon {
    public PokemonTierra(String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Tierra);
    }
}