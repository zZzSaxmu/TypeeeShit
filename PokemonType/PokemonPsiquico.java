package PokemonType;
import Principal.Pokemon;
import Principal.TipoPokemon;


public class PokemonPsiquico extends Pokemon {
    public PokemonPsiquico (String nombre, int salud, int puntosAtaque, TipoPokemon TipoPokemon ) {
        super(nombre, salud, puntosAtaque, TipoPokemon.Psiquico);
    }
}