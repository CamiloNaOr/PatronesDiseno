package Tarea;

public class Main {


    public static void main(String[] args) {
        BD bd = new BD();
        Pdf pdf = new Pdf();
        Excel excel = new Excel();
        Html html = new Html();
        System.out.println("Ejemplo informe Html");
        html.crearInforme(bd);
        System.out.println("Ejemplo informe Pdf");
        pdf.crearInforme(bd);
        System.out.println("Ejemplo informe Excel");
        excel.crearInforme(bd);
    }
}
