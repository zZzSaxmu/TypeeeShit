package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonAcero extends Pokemon {
    public PokemonAcero (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Acero);
    }
}
