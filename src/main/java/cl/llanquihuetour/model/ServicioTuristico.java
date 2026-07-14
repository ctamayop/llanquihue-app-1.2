package cl.llanquihuetour.model;

public abstract class ServicioTuristico {

    private String nombre;
    private double duracionHoras;

    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public abstract String mostrarInformacion();

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Duración: " + duracionHoras + " horas\n"
                + mostrarInformacion();
    }
}
