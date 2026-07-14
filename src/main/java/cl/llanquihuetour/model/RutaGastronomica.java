package cl.llanquihuetour.model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, double duracionHoras,
                            int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String mostrarInformacion() {
        return "Tipo: Ruta gastronómica\n"
                + "Número de paradas: " + numeroDeParadas;
    }
}
