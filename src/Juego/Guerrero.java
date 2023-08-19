package Juego;

public class Guerrero extends Heroe implements Cloneable{

    private int ataque;
    private int defensa;
    private int magia;
    private String habilidades;

    public Guerrero(String nombre,String aspecto, int nivel, int exp, int puntos) {
        super(nombre,aspecto,nivel,exp,puntos);
        this.ataque = 50;
        this.defensa = 80;
        this.magia = 15;
        this.habilidades = "hailidades guerrero";
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
