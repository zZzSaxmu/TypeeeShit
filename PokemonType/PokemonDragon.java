package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonDragon extends Pokemon {
    public PokemonDragon (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Dragon);
    }
}
