package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonFantasma extends Pokemon {
    public PokemonFantasma (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Fantasma);
    }
}