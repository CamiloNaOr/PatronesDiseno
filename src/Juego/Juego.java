package Juego;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Heroe> heroes;

    public Juego() {
        this.heroes = new ArrayList<Heroe>();
        Guerrero gerreroDef=new Guerrero("guerrero","set guerrero basico",10,50,25);
        heroes.add(gerreroDef);
        Mago magoDef=new Mago("mago","set mago basico",10,50,25);
        heroes.add(magoDef);
        Guerrero arqueroroDef=new Guerrero("arquero","set arquero basico",10,50,25);
        heroes.add(arqueroroDef);
    }

    public Heroe buscarHeroe(String name){
        Heroe buscado=null;
        int i=0;
        while(buscado==null){
            if(heroes.get(i).nombre.compareToIgnoreCase(name)==0){
                buscado=heroes.get(i);
            }
            else{
                i++;
            }
        }
        return buscado;
    }

    public void clonarHeroe(String referencia, String name, String apariencia){
        Heroe buscado=this.buscarHeroe(referencia);
        buscado.setNombre(name);
        buscado.setAspecto(apariencia);
    }
}
