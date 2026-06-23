package cl.llanquihuetour.model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour
 * Cada tour contiene nombre, tipo, precio y una ubicación asociada
 */
public class Tour {

    private String nombre;
    private String tipo;
    private int precio;
    private Ubicacion ubicacion;

    /**
     * Constructor vacío de la clase Tour
     */
    public Tour() {
    }

    /**
     * Constructor con parámetros de la clase Tour
     *
     * @param nombre Nombre del tour
     * @param tipo Tipo o categoría del tour
     * @param precio Precio del tour
     * @param ubicacion Ubicación donde se realiza el tour
     */
    public Tour(String nombre, String tipo, int precio, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nTipo: " + tipo +
                "\nPrecio: $" + precio +
                "\nUbicación: " + ubicacion;
    }
}