package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonElectrico extends Pokemon {
    public PokemonElectrico (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Electrico);
    }
}
