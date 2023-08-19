package Tarea;

public class Pdf extends Informe {
    double[] datos;

    @Override
    public void crearInforme(BD bd) {
        System.out.println("Informe.pdf");
        this.consultBd(bd);
    }

    @Override
    public void consultBd(BD bd) {
        this.datos = bd.datosBD();
        for (int i=0;i< datos.length;i++){
            System.out.println(datos[i]);
        }
    }
}
