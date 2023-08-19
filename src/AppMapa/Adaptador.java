package AppMapa;

public class Adaptador extends ArchivoKML{

    private final ArchivoGeoJSON json;

    public Adaptador(ArchivoGeoJSON json) {
        this.json = json;
    }

    public String getExtencion(){
        String result;
        if ("GeoJSON".equals(json.getCoordenadas())) {
            result = "KML";
        }else {
            result = "Error";
        }
        return  result;
        }
    }


