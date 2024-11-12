package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonAgua extends Pokemon {
    public PokemonAgua (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Agua);
    }
}