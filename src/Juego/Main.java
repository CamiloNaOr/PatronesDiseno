package Juego;

public class Main {

    public static void main(String[] args) {
        Juego prueba=new Juego();
        prueba.clonarHeroe("guerrero","juan","armadura");
        Heroe nuevoHeroe=prueba.buscarHeroe("juan");
        System.out.println(nuevoHeroe.nombre);
        System.out.println(nuevoHeroe.aspecto);
        System.out.println(nuevoHeroe.getNivel());
        System.out.println(nuevoHeroe.getExp());
        System.out.println(nuevoHeroe.getPuntos());
        System.out.println(nuevoHeroe.getAtaque());
        System.out.println(nuevoHeroe.getDefensa());
        System.out.println(nuevoHeroe.getMagia());
        System.out.println(nuevoHeroe.getHabilidades());
    }

}