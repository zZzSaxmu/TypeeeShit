package Principal;
enum EstadoPokemon {
    Normal, Debilitado, Paralizado, Envenenado, Dormido, Quemado, Congelado
}

public abstract class Pokemon {
    // Propiedades
    private String nombre;
    private int salud;
    private int puntosAtaque;
    private TipoPokemon tipo;
    private EstadoPokemon estado;

    public Pokemon(String nombre, int salud, int puntosAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosAtaque = puntosAtaque;
        this.tipo = tipo;
        this.estado = EstadoPokemon.Normal; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalud(){
        return salud;
    }
    public void setSalud(int salud){
        this.salud = salud;
    }
    public int getpuntosAtaque(){
        return puntosAtaque;
    }
    public void setpuntosAtaque(int puntosAtaque){
        this.puntosAtaque = puntosAtaque;
    }
    public TipoPokemon getTipo() {
        return tipo;
    }
    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }
    public EstadoPokemon getEstado() {
        return estado;
    }
    public void setEstado(EstadoPokemon estado) {
        this.estado = estado;
    }

}
