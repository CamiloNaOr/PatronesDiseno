package Juego;

public abstract class Heroe {

    String nombre;
     String aspecto;
    private int nivel;
    private int exp;
    private int puntos;

    public Heroe(String nombre, String aspecto, int nivel, int exp, int puntos) {
        this.nombre = nombre;
        this.aspecto = aspecto;
        this.nivel = nivel;
        this.exp = exp;
        this.puntos = puntos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExp() {
        return exp;
    }

    public int getPuntos() {
        return puntos;
    }
    public abstract int getAtaque();
    public abstract int getDefensa();
    public abstract int getMagia();
    public abstract String getHabilidades();

    public abstract Heroe clone();
}
