package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonLucha extends Pokemon {
    public PokemonLucha (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Lucha);
    }
}