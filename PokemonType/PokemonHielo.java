package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonHielo extends Pokemon {
    public PokemonHielo (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Hielo);
    }
}