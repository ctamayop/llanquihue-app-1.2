package cl.llanquihuetour.model;

public class GuiaTuristico extends RecursoAgencia {

    private String nombre;
    private String idioma;
    private int aniosExperiencia;

    public GuiaTuristico(boolean activo, String nombre,
                         String idioma, int aniosExperiencia) {
        super(activo);
        this.nombre = nombre;
        this.idioma = idioma;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String mostrarResumen() {
        return "Nombre: " + nombre + "\n"
                + "Idioma: " + idioma + "\n"
                + "Años de experiencia: " + aniosExperiencia + "\n"
                + "Estado: " + obtenerEstado() + "\n";
    }
}
