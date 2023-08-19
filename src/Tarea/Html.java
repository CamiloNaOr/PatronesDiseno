package Tarea;

public class Html extends Informe{
    double[] datos;
    @Override
    public void crearInforme(BD bd) {
        System.out.println("Informe.html");
        this.consultBd(bd);
        this.introduccion();
        this.argumentos();
        this.conclusion();
    }

    @Override
    public void consultBd(BD bd) {
        this.datos = bd.datosBD();
    }

    @Override
    public void introduccion() {
        System.out.println("Introduccion del informe");
    }

    @Override
    public void argumentos() {
        System.out.println("Argumentos:");
        this.maximo();
        System.out.println("Argumentos");
        this.minimo();

    }

    @Override
    public void maximo() {
        double max=0;
        for (int i=0;i< datos.length;i++){
            if (datos[i]>max){
                max = datos[i];
            }
        }
        System.out.println("el valor maximo es "+max);
    }

    @Override
    public void minimo() {
        double min = datos[1];
        for (int i=0;i< datos.length;i++){
            if (datos[i]<min){
                min = datos[i];
            }
        }
        System.out.println("el valor minimo es "+min);
    }

    @Override
    public void conclusion() {
        System.out.println("Conclusion");
    }
}
