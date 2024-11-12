package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemoNormal extends Pokemon {
    public PokemoNormal (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Normal);
    }
}