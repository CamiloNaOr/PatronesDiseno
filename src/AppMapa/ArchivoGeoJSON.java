package AppMapa;

public class ArchivoGeoJSON {
    private final String coordenadas;

    public ArchivoGeoJSON(String extencion) {
        this.coordenadas = extencion;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

}
