package AppMapa;

public class Cliente {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        ArchivoKML kml1 = new ArchivoKML("KML");

        if (biblioteca.fits(kml1)) {
            System.out.println("Archivo KML Mapeado");
        }

        ArchivoGeoJSON json1 = new ArchivoGeoJSON("GeoJSON");
        Adaptador adaptador1 = new Adaptador(json1);

        ArchivoGeoJSON json2 = new ArchivoGeoJSON("UwU");
        Adaptador adaptador2 = new Adaptador(json2);

        if (biblioteca.fits(adaptador1)) {
            System.out.println("Archivo adaptado a KML mapeado");
        }

        if (biblioteca.fits(adaptador2)) {
            System.out.println("Archivo adaptado a KML mapeado");
        }else{
            System.out.println("Error: Adaptacion fallida");
        }

    }
}
