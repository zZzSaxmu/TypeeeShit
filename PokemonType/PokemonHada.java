package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonHada extends Pokemon {
    public PokemonHada (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Hada);
    }
}