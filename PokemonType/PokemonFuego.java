package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonFuego extends Pokemon {
    public PokemonFuego (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Fuego);
    }
}