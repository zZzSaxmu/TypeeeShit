package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonNormal extends Pokemon {
    public PokemonNormal(String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Normal);
    }
}