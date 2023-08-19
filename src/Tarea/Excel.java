package Tarea;



public class Excel extends Informe{

    double[] datos;

    @Override
    public void crearInforme(BD bd) {
        System.out.println("Informe.xls");
        this.consultBd(bd);
        this.promedio();
        this.maximo();
        this.minimo();
    }

    @Override
    public void consultBd(BD bd) {
        this.datos = bd.datosBD();
        for (int i=0;i< datos.length;i++) {
            System.out.println(datos[i]);
        }
    }

    @Override
    public void promedio() {
        double sum=0;
        for (int i=0;i< datos.length;i++){
            sum+=datos[i];
        }
        double prom = sum/ datos.length;
        System.out.println("promedio ="+prom);
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
}
