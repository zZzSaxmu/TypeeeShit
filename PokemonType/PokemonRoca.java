package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonRoca extends Pokemon {
    public PokemonRoca (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Roca);
    }
}