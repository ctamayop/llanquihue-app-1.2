package cl.llanquihuetour.model;

/**
 * Representa la ubicación donde se realiza un tour
 * Clase de composición dentro de la clase Tour
 */
public class Ubicacion {

    private String ciudad;
    private String region;

    /**
     * Constructor vacío de la clase Ubicacion
     */
    public Ubicacion() {
    }

    /**
     * Constructor con parámetros de la clase Ubicacion
     *
     * @param ciudad Ciudad donde se realiza el tour
     * @param region Región donde se encuentra la ciudad
     */
    public Ubicacion(String ciudad, String region) {
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return ciudad + ", " + region;
    }
}