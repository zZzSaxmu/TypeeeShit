package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonVolador extends Pokemon {
    public PokemonVolador (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Volador);
    }
}