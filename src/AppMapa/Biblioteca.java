package AppMapa;

public class Biblioteca {

    private final String extencion;

    public Biblioteca() {
        this.extencion = "KML";
    }

    public String getExtencion() {
        return extencion;
    }

    public boolean fits(ArchivoKML kml) {
        boolean result;
        result = (this.getExtencion().equals(kml.getExtencion()));
        return result;
    }
}
