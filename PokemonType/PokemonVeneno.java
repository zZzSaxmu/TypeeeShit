package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonVeneno extends Pokemon {
    public PokemonVeneno (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Veneno);
    }
}