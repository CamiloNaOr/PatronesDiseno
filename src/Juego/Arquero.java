package Juego;

public class Arquero extends Heroe implements Cloneable{
    private int ataque;
    private int defensa;
    private int magia;
    private String habilidades;

    public Arquero(String nombre,String aspecto, int nivel, int exp, int puntos) {
        super(nombre,aspecto,nivel,exp,puntos);
        this.ataque = 80;
        this.defensa = 15;
        this.magia = 50;
        this.habilidades = "hailidades arquero";
    }

    public void setNombre(String name){
        this.nombre=name;
    }

    public void setAspecto(String traje){
        this.aspecto=traje;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getMagia() {
        return magia;
    }

    public String getHabilidades() {
        return habilidades;
    }

    @Override
    public Heroe clone() {
        return this.clone();
    }
}
